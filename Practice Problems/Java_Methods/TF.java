public class TF {
    public double[] calculateTrigonometricFunctions(double angle){
        double angleinradian = Math.toRadians(angle);
        double sine = Math.sin(angleinradian);
        double cosine = Math.cos(angleinradian);
        double tangent = Math.tan(angleinradian);
        return new double[] {sine,cosine,tangent};
    }

    public static void main(String[] args) {
        double angle =60;
        TF tf = new TF();
        double[] arr = tf.calculateTrigonometricFunctions(angle);
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
    }
}
