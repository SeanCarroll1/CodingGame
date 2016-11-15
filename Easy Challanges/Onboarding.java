import java.util.*;
import java.io.*;
import java.math.*;

/**
 *Your program must destroy the enemy ships by shooting the closest enemy on each turn.
    Rules

On each start of turn (within the game loop), you obtain information on the two closest enemies:
enemy1 and dist1: the name and the distance to enemy 1.
enemy2 and dist2: the name and the distance to enemy 2.
Before your turn is over (end of the loop), output the value of either enemy1 or enemy2 to shoot the closest enemy.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            String enemy1 = in.next(); // name of enemy 1
            int dist1 = in.nextInt(); // distance to enemy 1
            String enemy2 = in.next(); // name of enemy 2
            int dist2 = in.nextInt(); // distance to enemy 2

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            if(dist1<dist2)
            System.out.println(enemy1 ); // replace with correct ship name
            else
            System.out.println(enemy2 );
            
        }
    }
}