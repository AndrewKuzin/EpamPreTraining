public class Triangle {
    public static String checkIfTriangle(int[] a, int[] b, int[] c) {
        if ((a[0] == b[0] && b[0] == c[0]) || (a[1] == b[1] && b[0] == c[1])) {
            return "Не является треугольником";
        } else if (checkIfStrait(a, b, c)) {
            return "Является прямоугольным треугольником";
        } else return "Треугольник, но не прямоугольный";
    }

    public static boolean checkIfStrait(int[] a, int[] b, int[] c) {
        if ((a[0] == b[0] && b[1] == c[1]) || (a[1] == b[1] && b[0] == c[0]) ||
                (a[1] == c[1] && b[0] == c[0]) || (a[0] == c[0] && b[1] == c[1]) ||
                (a[0] == b[0] && a[1] == c[1]) || (a[1] == b[1] && a[0] == c[0])) {
            return true;
        } else {
            return false;
        }
    }
}
