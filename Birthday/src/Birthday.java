public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int[] counts = new int[n + 1];

        for (int t = 0; t < trials; t++) {
            boolean[] hasBirthday = new boolean[n];
            int people = 0;

            while (true) {
                int birthday = (int) (Math.random() * n);
                people++;
                if (hasBirthday[birthday]) {
                    break;
                }
                hasBirthday[birthday] = true;
            }

            counts[people]++;
        }

        int totalPeople = 0;
        for (int i = 1; i <= n; i++) {
            totalPeople += counts[i];
        }

        double cumulativeFraction = 0.0;
        for (int i = 1; i <= n; i++) {
            if (counts[i] > 0) {
                double fraction = (double) counts[i] / trials;
                cumulativeFraction += fraction;
                System.out.printf("%d\t\t%d\t\t%.6f\n", i, counts[i], cumulativeFraction);
                if (cumulativeFraction >= 0.5) {
                    break;
                }
            }
        }
    }
}
