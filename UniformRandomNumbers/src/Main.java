public class Main {
    public static void main(String[] args) {
        double N = Integer.parseInt(args[0]);
        double r1 = Math.random();
        double t1 = (r1 * N);

        double r2 = Math.random();
        double t2 = (r2 * N);

        double r3 = Math.random();
        double t3 = (r3 * N);

        double r4 = Math.random();
        double t4 = (r4 * N);

        double r5 = Math.random();
        double t5 = (r5 * N);

        double avgNum = (t1 + t2 + t3 + t4 + t5)/5;
        double min = Math.min(t1, Math.min(t2, Math.min(t3, Math.min(t4,t5))));
        double max = Math.max(t1, Math.max(t2, Math.max(t3, Math.max(t4,t5))));
//        double max2 = Math.max(t4,t5);


        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);

        System.out.println("\n" + avgNum);
        System.out.println("\n" + min);
        System.out.println("\n" + max);

    }
}
