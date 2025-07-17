public class CountingPrimes {
    public static void main(String[] args) {

        long n = Long.parseLong(args[0]);
        long t = 1;
        long Total = 0;

        for (int i = 2; i <= (n / i); i++) {
            while (n % i == 0) {
                System.out.println(i + " ");
                n = n / i;
                Total = t * i;
                t = Total;
            }


        }
        if (n > 1)
        {
            System.out.println(n);
            Total = t * n;
            System.out.println("\n\n\n" +  Total);
        }

        else
            System.out.println();
    }

}
