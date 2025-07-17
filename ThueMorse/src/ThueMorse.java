public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int length = n * n;
        int[] thueMorse = new int[length];

        for (int i = 1; i < length; i++) {
            thueMorse[i] = thueMorse[i / 2] ^ (i % 2);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (thueMorse[i] == thueMorse[j]) {
                    System.out.print("+  ");
                } else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}
