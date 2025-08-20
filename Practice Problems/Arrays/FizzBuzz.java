package PACKAGE_NAME;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n+1];
        for(int i=0;i<=n;i++){
            if(i%3==0){
                arr[i]="Fizz";
//                System.out.println("Fizz");
            }
            else if(i%5==0){
                arr[i]="Buzz";
//                System.out.println("Buzz");
            } else if (i%15==0) {
                arr[i]="FIzzBuzz";
//                System.out.println("FIzzBuzz");
            }
            else{
                arr[i]=""+i;
//                System.out.println(i);
            }
        }
        for(String a:arr){
            System.out.println(a);
        }
    }
}
