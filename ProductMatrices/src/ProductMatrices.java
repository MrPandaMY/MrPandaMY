public class ProductMatrices {
    public static void main(String[] args) {

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        double [][] a = new double[n1][n2];
        double [][] b = new double[n1][n2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                a[i][j] = Math.random();

                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                b[i][j] = Math.random();

                System.out.print(b[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                double[][] k = new double[n1][n2];

                k[j][i] = b[i][j] * a[j][i];

                System.out.print(k[j][i] + " ");
            }
        }

    }
}
