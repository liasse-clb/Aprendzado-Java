public class Ex012 {
    public static void main(String[] args) {

        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);

        double white = 1 - k;

        int r = (int) Math.round(255 * white * (1 - c));
        int g = (int) Math.round(255 * white * (1 - m));
        int b = (int) Math.round(255 * white * (1 - y));

        System.out.println("Red = " + r);
        System.out.println("Green = " + g);
        System.out.println("Blue = " + b);
    }
}
