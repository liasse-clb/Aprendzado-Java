public class Ex008 {
    public static void main(String[] args) {
        double r = 6371.0;

        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double e1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double e2 = Math.toRadians(Double.parseDouble(args[3]));

        double a = Math.pow(Math.sin((x2 - x1) / 2), 2)
                + Math.cos(x1) * Math.cos(x2)
                * Math.pow(Math.sin((e2 - e1) / 2), 2);

        double distancia = 2 * r * Math.asin(Math.sqrt(a));

        System.out.println(distancia + " Kilometers");
    }
}
