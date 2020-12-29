import java.util.Scanner;

 class  Withot_sort {


     public static void main(String args[]) {
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int[] arr = new int[n + 1];
         int[] arr1 = new int[3];
         for (int i = 0; i < n ; i++) {
             arr[i] = scan.nextInt();
             if (arr[i] == 0) arr1[0]++;
             else if (arr[i] == 1) arr1[1]++;
             else if (arr[i] == 2) arr1[2]++;
         }
         for (int i = 0; i < arr1[0]; i++)
             System.out.print("0 " );
         for (int i = 0; i < arr1[1]; i++)
             System.out.print("1 ");
         for (int i = 0; i < arr1[2]; i++)
             System.out.print("2 ");
     }
 }