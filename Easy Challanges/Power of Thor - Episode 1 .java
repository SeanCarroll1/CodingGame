import java.util.*;
import java.io.*;
import java.math.*;

/**
Your program must allow Thor to reach the light of power.
    Rules

Thor moves on a map which is 40 wide by 18 high. Note that the coordinates (X and Y) start at the top left! This means the most top left cell has the coordinates "X=0,Y=0" and the most bottom right one has the coordinates "X=39,Y=17".

Once the program starts you are given:
the variable lightX: the X position of the light of power that Thor must reach.
the variable lightY: the Y position of the light of power that Thor must reach.
the variable initialTX: the starting X position of Thor.
the variable initialTY: the starting Y position of Thor.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position
        
        
        // game loop
        while (true)
        {
            int remainingTurns = in.nextInt();
            String directionY="";
            String directionX="";
             if(initialTY>lightY)
        {
            directionY="N";
            initialTY--;
        }else if(initialTY<lightY)
        {
            initialTY++;
            directionY="S";
        }
        
            if(initialTX>lightX)
        {
            directionX="W";
            initialTX--;
            
        }else if(initialTX<lightX)
        {
            directionX="E";
            initialTX++;
        }
       
        
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            //directionX+=directionY;
            System.out.println(directionY+directionX); // A single line providing the move to be made: N NE E SE S SW W or NW
        }
    }
}
