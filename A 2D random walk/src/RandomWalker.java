public class RandomWalker {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int box = (2 * n);
        int Hstep = 0;
        int Vstep = 0;
        int TotalStep = 0;

        while (Hstep > -box && Hstep < box && Vstep > -box && Vstep < box) {
            if (Math.random() <= 0.25)
                Hstep++;

            else if (Math.random() >= 0.26 && Math.random() <= 0.5) {
                Hstep--;
            }

            else if (Math.random() >= 0.51 && Math.random() <= 0.75) {
                Vstep++;
            }

            else if (Math.random() >= 0.76) {
                Vstep--;
            }

        TotalStep++;
        }

        if (Hstep == box && Hstep > 0) {
            System.out.println("After a total " + TotalStep + " steps, the Particle moved " + Math.abs(Hstep) + " steps towards East.");

            if (Vstep > 0) {
                System.out.println("Current position from centre point 0 is at " + Math.abs(Vstep) + " North and " + Math.abs(Hstep) + " East.");
            }

            else
                System.out.println("Current position from centre point 0 is at " + Math.abs(Vstep) + " South and " + Math.abs(Hstep) + " East.");
        }

        else if (Hstep == -box && Hstep < 0) {
            System.out.println("After a total " + TotalStep + " steps, the Particle moved " + Math.abs(Hstep) + " steps towards West.");
            if (Vstep > 0) {
                System.out.println("Current position from centre point 0 is at " + Math.abs(Vstep) + " North and " + Math.abs(Hstep) + " West.");
            }

            else
                System.out.println("Current position from centre point 0 is at " + Math.abs(Vstep) + " South and " + Math.abs(Hstep) + " West.");
        }

        else if (Vstep == box && Vstep > 0) {
            System.out.println("After a total " + TotalStep + " steps, the Particle moved " + Math.abs(Vstep) + " steps towards North.");
            if (Hstep > 0) {
                System.out.println("Current position from centre point 0 is at " + Math.abs(Hstep) + " East and " + Math.abs(Vstep) + " North.");
            }

            else
                System.out.println("Current position from centre point 0 is at " + Math.abs(Hstep) + " West and " + Math.abs(Vstep) + " North.");
        }

        else if (Vstep == -box && Vstep < 0) {
            System.out.println("After a total " + TotalStep + " steps, the Particle moved " + Math.abs(Vstep) + " steps towards South.");
            if (Hstep > 0) {
                System.out.println("Current position from centre point 0 is at " + Math.abs(Vstep) + " East and " + Math.abs(Vstep) + " South.");
            }

            else
                System.out.println("Current position from centre point 0 is at " + Math.abs(Vstep) + " West and " + Math.abs(Vstep) + " South.");
        }
    }
}
