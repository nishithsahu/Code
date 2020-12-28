
import java.util.Scanner;
public class reverse {  
    
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int c=0;
        int n=scan.nextInt();
        int []arr =new int[n];
        while(n!=0){
            arr[c++]=scan.nextInt();
            n--;
        }
        for(int i=arr.length-1;i>=0;i--)
        System.out.printf("%d ",arr[i]);
    }
    
}
