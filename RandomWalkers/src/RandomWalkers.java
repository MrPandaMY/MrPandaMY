public class RandomWalkers {
    public static void main(String[] args) {

        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double TotalSteps = 0;


        for (int i = 0; i < trials; i++) {
            double Steps = 0;
            int Dist = 0;
            int V = 0;
            int H = 0;

            while (Dist < r) {
                double rand = Math.random();

                if (rand <= 0.25) {
                    V++;
                } else if (rand <= 0.5) {
                    H++;
                } else if (rand <= 0.75) {
                    V--;
                } else if (rand <= 1.0) {
                    H--;
                }
                Dist = Math.abs(V) + Math.abs(H);
                Steps++;
            }
            TotalSteps = TotalSteps + Steps;
        }
        double AvgSteps = TotalSteps/trials;
        System.out.println("Average number of steps = " + AvgSteps);
    }
}
