public class RingArea {
    public static double countArea(int r1, int r2) {
        double area1 = Math.PI * Math.pow(r1, 2);
        double area2 = Math.PI * Math.pow(r2, 2);
        return area1 - area2;
    }
}
