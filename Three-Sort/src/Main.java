public class Main {
    public static void main(String[] args) {
        int a = 520, b = 180, c = 333, d = 555;

//        int max = Math.max(a, Math.max(b, Math.max(c,d)));
//        int min = Math.min(a, Math.min(b, Math.min(c,d)));
//        int middle = a + b + c - max - min;

        int max1 = Math.max(a,b);
        int max2 = Math.max(c,d);
        int max = Math.max(max1,max2);

        int min1 = Math.min(a,b);
        int min2 = Math.min(c,d);
        int min = Math.min(min1,min2);

        int low_middle = Math.max(min1,min2);
        int high_middle = Math.min(max1,max2);

        System.out.println(min);
        System.out.println(low_middle);
        System.out.println(high_middle);
        System.out.println(max);
    }
}
