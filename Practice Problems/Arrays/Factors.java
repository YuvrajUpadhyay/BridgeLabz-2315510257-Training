package PACKAGE_NAME;

import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        for(int a:arr){
            System.out.println(a);
        }
    }
}
