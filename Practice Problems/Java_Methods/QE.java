public class QE{

    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[0];
        }
    }

    public static void main(String[] args) {
        double a = 1, b = -3, c = 2;
        double[] roots = findRoots(a, b, c);
        if (roots.length == 2) {
            System.out.printf("Two roots: %.2f and %.2f%n", roots[0], roots[1]);
        } else if (roots.length == 1) {
            System.out.printf("One root: %.2f%n", roots[0]);
        } else {
            System.out.println("No real roots.");
        }
    }
}
