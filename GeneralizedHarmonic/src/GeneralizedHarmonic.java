public class GeneralizedHarmonic {
    public static void main(String[] args) {

        double n = Integer.parseInt(args[0]);
        double r = Integer.parseInt(args[1]);
        double t = 0;

        for (int i = 1; i <= n; i++) {
            t = t + (1 / (Math.pow(i, r)));
        }

        System.out.println(t);
    }
}
