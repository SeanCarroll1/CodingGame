import java.util.*;
import java.io.*;
import java.math.*;

/**
*Casablanca’s hippodrome is organizing a new type of horse racing: duals. During a dual, only two horses will participate in the race. In order for the race to be interesting, it is necessary to try to select two horses with similar strength.
*
*Write a program which, using a given number of strengths, identifies the two closest strengths and shows their difference with an integer (≥ 0).
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int [] list= new int[N];
        
        for (int i = 0; i < N; i++) 
        {
            int pi = in.nextInt();
            list[i]=pi;
        }

        Arrays.sort(list);
        
        int smallest=Integer.MAX_VALUE;
        
        for(int i=0; i<N-1; i++)
        {
            
               if((list[i+1]-list[i])<smallest)
               {
                   smallest=list[i+1]-list[i];
               }       
        }
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(smallest);
    }
}
