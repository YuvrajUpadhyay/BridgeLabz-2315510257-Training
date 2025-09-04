public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int gets = number/divisor;
        int remaining = number%divisor;
        return new int[] {gets,divisor};
    }

    public static void main(String[] args) {
        int[] result = findRemainderAndQuotient(53,8);
        System.out.println("each child gets"+result[0]);
        System.out.println("remaining"+result[1]);
    }
}
