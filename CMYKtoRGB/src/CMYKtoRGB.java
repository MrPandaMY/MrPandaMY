public class CMYKtoRGB {
    public static void main(String[] args) {

        float Cyan = Float.parseFloat(args[0]);
        float Magenta = Float.parseFloat(args[1]);
        float Yellow = Float.parseFloat(args[2]);
        float Black = Float.parseFloat(args[3]);

        float white = 1 - Black;
        float red = 255 * white * (1-Cyan);
        float green = 255 * white * (1-Magenta);
        float blue = 255 * white * (1-Yellow);

        System.out.println("red     = " + Math.round(red));
        System.out.println("green   = " + Math.round(green));
        System.out.println("blue    = " + Math.round(blue));
    }
}
