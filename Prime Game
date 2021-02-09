/*Chef and Divyam are playing a game with the following rules:

First, an integer X! is written on a board.
Chef and Divyam alternate turns; Chef plays first.
In each move, the current player should choose a positive integer D which is divisible by up to Y distinct primes and does not exceed the integer currently written on the board. Note that 1 is not a prime.
D is then subtracted from the integer on the board, i.e. if the integer written on the board before this move was A, it is erased and replaced by A−D.
When one player writes 0 on the board, the game ends and this player wins.
Given X and Y, determine the winner of the game*/



import java.util.Scanner;
import java.io.*;
 class ATM
{
        
    public static void main(String args[])throws IOException
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        while(test--!=0){
               int  c=0;int x,y;
               String line = br.readLine();
               
    String[] data=line.split(",|\\s+");
    
                x=Integer.parseInt(data[0]);
                
               y=Integer.parseInt(data[1]);
               int l=check(x,y);
               if((l<=y))
               System.out.println("Chef");
               else
               if((l>y))
               System.out.println("Divyam");
               
        }
        }
        static int check(int n,int y){
               int m=0;
               for(int i=2;i<=n&m<=y;i++){
                      int c=0;int k=i;
                     
               for (int j=2;j<k/2+1 ;j++ )
               if(k%j==0)
               c++;
               if((c==0)&&(c<=y))
                m++;
                else
                if(m>y)
              break;  }
              return m;}
        

}
