package PACKAGE_NAME;

import java.util.ArrayList;
import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] leaders = new int[n];
        for(int i=0;i<n;i++){
            leaders[i]=sc.nextInt();
        }
//        for(int i=0;i<n-1;i++){
//            int max=leaders[i];
//            for(int j=i+1;j<n;j++){
//                if(leaders[j]>max){
//                    max=leaders[j];
//                }
//            }
//            if(max==leaders[i]){
//                arr.add(leaders[i]);
//            }
//        }
//        arr.add(leaders[n-1]);
//        for(int a:arr){
//            System.out.println(a);
//        }
        int max = leaders[n-1];
        arr.add(max);
        for (int i=n-2;i>=0;i--){
            if(leaders[i]>max){
                arr.add(leaders[i]);
                max=leaders[i];
            }
        }
        int m=0;
        int k=arr.size()-1;
        while(k>m){
            int temp=arr.get(m);
            arr.set(m,arr.get(k));
            arr.set(k,temp);
            m++;
            k--;

        }
        for(int a:arr){
            System.out.println(a);
        }
    }
}
