import java.util.*;
import java.io.*;
import java.math.*;

/**
* Write a program that prints the temperature closest to 0 among input data. If two numbers are equally close to zero, positive integer has to be considered closest to zero (for instance, if the temperatures are -5 and 5, then display 5).
 **/
class Solution {

    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        in.nextLine();
        int big=Integer.MAX_VALUE;
        
        if(n==0)
        {
         big=0;   
        }
        
        while(n-->0)
        {
            int check=in.nextInt();
            if(Math.abs(check)<Math.abs(big))
            {
                
                big=check;
            }else if(Math.abs(check)==Math.abs(big))
            {
                if(check>big)
                {
                    big=check;
                }
                
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(big);
    }
}
