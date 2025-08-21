package PACKAGE_NAME;

import java.util.Scanner;

public class RemoveOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ele = sc.nextInt();
        int m=0;
        int k =0;
//        int index=0;
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        for (int a:arr){
//            if(a!=ele){
//                index++;
//            }
//        }
//        System.out.println(index);

        while(k<n){
            if(arr[k]!=ele){
                arr[m]=arr[k];
                m++;
            }
            k++;
        }
        while(m<n){
            arr[m]=0;
            m++;
        }
        for(int a:arr){
            System.out.println(a);
        }
    }
}
