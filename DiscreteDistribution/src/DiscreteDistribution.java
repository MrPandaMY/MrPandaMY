public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = args.length - 1;
        int[] weights = new int[n];
        int[] cumulativeWeights = new int[n];
        int totalWeight = 0;

        for (int i = 0; i < n; i++) {
            weights[i] = Integer.parseInt(args[i + 1]);
            totalWeight += weights[i];
            cumulativeWeights[i] = totalWeight;
        }

        for (int i = 0; i < m; i++) {
            int randomValue = (int)(Math.random() * totalWeight) + 1;
            int selectedIndex = 0;

            int low = 0;
            int high = cumulativeWeights.length - 1;

            while (low < high) {
                int mid = (low + high) / 2;
                if (randomValue > cumulativeWeights[mid]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            selectedIndex = low;

            System.out.print(selectedIndex + 1);
            if (i < m - 1) {
                System.out.print(" ");
            }
        }
    }
}
