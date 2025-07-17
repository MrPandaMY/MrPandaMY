public class RandomWalker {
    public static void main(String[] args) {

        int r = Integer.parseInt(args[0]);
        int V = 0;
        int H = 0;
        int Steps = 0;
        int Dist = 0;

        while ( Dist < r) {
            System.out.println("(" + H + ", " + V + ")" );

            double rand = Math.random();
            if (rand < 0.25) {
                V++;
            }
            else if (rand < 0.5 ) {
                H++;
            }
            else if (rand < 0.75) {
                V--;
            }
            else if (rand < 1.0) {
                H--;
            }

            Dist = Math.abs(V) + Math.abs(H);
            Steps++;
        }

        System.out.println("(" + H + ", " + V + ")" );
        System.out.println("Steps = " + Steps);
    }
}
