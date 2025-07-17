public class DuplicateFinder {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int [][]a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double RanNum = Math.random();
                int k = 0;

                if (RanNum < 0.25) {
                    k++;
                }
                else if (RanNum < 0.5) {
                    k--;
                }
                else if (RanNum < 0.75) {
                    k++;
                    k++;
                }
                else {
                    k--;
                    k--;
                }

                a[i][j] = a[i][j] + k;

                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        if (i == k && l == j) {
                            System.out.println("Same array.");
                        }
                        else if (a[i][j] == a[k][l]) {
                            System.out.println("The array a[" + i + "][" + j + "] is a duplicate with array a[" + k + "][" + l + "].");
                        }
                        else
                            System.out.println("No duplicates");
                    }
                }
            }
        }
    }
}
