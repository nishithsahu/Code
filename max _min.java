import java.util.Scanner;

class Max_Min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no strength");
        int n = scan.nextInt();
        int arr[] = new int[n];
        int max, min;
        System.out.println("Enter array");
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        max = min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.printf("Max= %d \n", max);
        System.out.printf("Min= %d \n", min);

    }
}