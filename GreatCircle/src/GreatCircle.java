public class GreatCircle {
    public static void main(String[] args) {

        double X1 = Double.parseDouble(args[0]);
        double Y1 = Double.parseDouble(args[1]);
        double X2 = Double.parseDouble(args[2]);
        double Y2 = Double.parseDouble(args[3]);

        double a = (Math.toRadians(X2 - X1)/2);
        double b = (Math.toRadians(Y2 - Y1)/2);
        double c = Math.cos(Math.toRadians(X1)) * Math.cos(Math.toRadians(X2));
        double d = Math.sin(b);
        double d2 = Math.pow(d,2);
        double e = Math.sin(a);
        double e2 = Math.pow(e,2);
        double f = Math.sqrt(e2 + (c*d2));
        double g = Math.asin(f);

        double Distance = ((2 * 6371.0) * g);

//        System.out.println(X1);
//        System.out.println(Y1);
//        System.out.println(X2);
//        System.out.println(Y2);
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d2);
//        System.out.println(e2);
//        System.out.println(f);
//        System.out.println(g);
        System.out.println(Distance + " kilometers");
    }
}
