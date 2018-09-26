import java.util.Scanner;
import java.lang.Math;

public class ThriceTurn
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        new java.util.Random();
        
        double die1 = 1;
        double die2 = 1;
        double die3 = 1;
        double input = 0;
        double originput = 0;
        double triplet = 0;
        int tally = 0;

        System.out.println("Type 1 to roll the dice until you have a triplet.");
        input = scan.nextInt();
        originput = input;
        if (input == 1)
        {
            die1 = (java.lang.Math.random()*10.0);
            if (die1 > 0.0 && die1 <= 1.5)
            {
                die1 = 1;
            }
            else if (die1 < 3.0)
            {
                die1 = 2;
            }
            else if (die1 < 4.5)
            {
                die1 = 3;
            }
            else if (die1 < 6.0)
            {
                die1 = 4;
            }
            else if (die1 < 8.5)
            {
                die1 = 5;
            }
            else
            {
                die1 = 6;
            }
            System.out.println("Your triplet is "+ die1);
        }
        else
        {
            System.out.println("I said type a 1 you idiot");
        }
        tally = tally + die1*2;
        System.out.println("Now enter 1 to roll the dice for score.");
        input = scan.nextInt();
        if (input == 1)
        {
            die1 = (java.lang.Math.random()*10.0);
            if (die1 > 0.0 && die1 <= 1.5)
            {
                die1 = 1;
            }
            else if (die1 < 3.0)
            {
                die1 = 2;
            }
            else if (die1 < 4.5)
            {
                die1 = 3;
            }
            else if (die1 < 6.0)
            {
                die1 = 4;
            }
            else if (die1 < 8.5)
            {
                die1 = 5;
            }
            else
            {
                die1 = 6;
            }
            die2 = (java.lang.Math.random()*10.0);
            if (die2 > 0.0 && die1 <= 1.5)
            {
                die2 = 1;
            }
            else if (die2 < 3.0)
            {
                die2 = 2;
            }
            else if (die2 < 4.5)
            {
                die2 = 3;
            }
            else if (die2 < 6.0)
            {
                die2 = 4;
            }
            else if (die2 < 8.5)
            {
                die2 = 5;
            }
            else
            {
                die2 = 6;
            }
            die3 = (java.lang.Math.random()*10.0);
            if (die3 > 0.0 && die1 <= 1.5)
            {
                die3 = 1;
            }
            else if (die3 < 3.0)
            {
                die3 = 2;
            }
            else if (die3 < 4.5)
            {
                die3 = 3;
            }
            else if (die3 < 6.0)
            {
                die3 = 4;
            }
            else if (die3 < 8.5)
            {
                die3 = 5;
            }
            else
            {
                die3 = 6;
            }
        }
        tally = tally + (die1*die2*die3);
        System.out.println("Your tally is "+ tally + ". You can choose to roll again and run the risk of reseting it to your triplet that you roll, at the reward if it matches your first triplet, your tally will be tripled. Enter 1 to roll, enter 2 to end your turn.");
        input = scan.nextInt;
        if (input == 1)
        {

        }
    }
}