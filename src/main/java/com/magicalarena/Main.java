import model.*;
import service.*;
public class Main{
   public static void main(String args[])
   {
       Player A = new Player(50,5,10);
       Player B = new Player(100,10,5);
       Arena arena = new Arena();
       arena.startGame(A,B);
       System.out.println();
       System.out.println("Final Health Status : ");
       System.out.println("Health of Player A : "+A.getHealth());
       System.out.println("Health of Player B : "+B.getHealth());
       System.out.println();
       System.out.println("Result of the game : ");
       if(A.getHealth() == 0)
       {
          System.out.println("Player A has died and Player B wins the game");
       }
       else if(B.getHealth() == 0)
       {
        System.out.println("Player B has died and Player A wins the game");
       }
   }
}