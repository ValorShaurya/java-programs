import java.util.*;

public class GuessTheNumber {
    int a,b,c=0;


    public int random()
    {
        a = 0;
        a = (int)(Math.random()*100)+1;
        return a;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between 1 and 100");
        do {
            b = sc.nextInt();
            if(b>a)
                System.out.println("Think for a Smaller number");
            else if(b<a)
                System.out.println("Think for a bigger number");
            c++;
        } while (a!= b);

    }

    public void output()
    {
        System.out.println("Your Guess is correct");
        System.out.println("Number of guess: "+ c);

    }

    public void level()
    {
        if(c==1)
            System.out.println("You are a Legend");
        else if(c<3)
            System.out.println("Pro Player");
        else if (c<7)
            System.out.println("Good Player");
        else  if (c>7)
            System.out.println("Noob");
    }

}
class main {
    public static void main() {

        GuessTheNumber Player = new GuessTheNumber();
        Player.random();
        Player.input();
        Player.output();
        Player.level();
    }
}
