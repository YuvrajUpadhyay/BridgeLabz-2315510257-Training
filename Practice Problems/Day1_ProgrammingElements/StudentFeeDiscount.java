import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Fee (INR): ");
        double fee = sc.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        double discountPercent = sc.nextDouble();

        double discountAmount = (fee * discountPercent) / 100;
        double finalFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount +" and final discounted fee is INR " + finalFee);
    }
}
