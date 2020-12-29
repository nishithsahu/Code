import java.io.*;
import java.util.*;
import java.lang.String;

 class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int c=0;
        char x1,x2;
        /* Enter your code here. Print output to STDOUT. */
        int s=A.length()+B.length();
        for(int i=0;i<A.length();i++){
            x1=A.charAt[i];
            x2=B.charAt[i];
            if(x1>x2){
                c++;
                continue;
            }
            else
            {System.out.println("No");
                break; }
        }
        System.out.println(A+" "+B);

    }
}



