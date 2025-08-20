package PACKAGE_NAME;

import java.util.Scanner;

public class TwoDtoOneD {
    public static void main(String[] args) {
        int k=0;
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        int[] arr1 = new int[rows*cols];
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int m=0;m<rows;m++){
            for(int n=0;n<cols;n++){
                arr1[k]=arr[m][n];
                k++;
            }
        }
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for(int a:arr1){
            System.out.print(a);
        }
    }
}
