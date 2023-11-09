//A program to make a simple game in which user has to make a guess of random number from  1 to 20.
//Based on the user's input the program will tell the user that whether the guess of user is right or not.
import java.util.Random;
import java.util.Scanner;
public class Random_Number_Game
{
    public void randomGenerator(int randomnum)              //Method which will compare the input and provide thenecessary output
    {
        Scanner in1=new Scanner(System.in);
        System.out.println("Enter a number between 1 and 20.....");
        int number=in1.nextInt();
        if(number==randomnum)
        {
        System.out.println("Wow you guessed it right\n"+"Congratualations for guessing the right answer\n"+"Your price is ready you can claim it from the counter!!!!!!");
        }
        else if(randomnum-number<5)
        {
        System.out.println("UHHH Ohhhhhh wrong guessed\n"+"But you are too close to the right answer!!!!!!\n"+"\nBetter luck next time\n"+"Hope you enjoyed playing the game\n"+"Do visit us again!!!!!!");
        }
        else if(randomnum-number>5||number-randomnum>5)
        {
        System.out.println("Uhhhh Ohhhhh wrong guessed\n"+"Woahhhh you guessed too far!!!!!!"+"\nBetter luck next time\n"+"Hope you enjoyed playing the game\n"+"Do visit us again!!!!!!");
        }
        else 
        {
            System.out.println("Looks like you guessed it out of the given range!!!!!!"+"\nBetter luck next time\n"+"Hope you enjoyed playing the game\n"+"Do visit us again!!!!!!");
        }
        in1.close();
    }
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        Random r=new Random();
        int random_number;
        random_number=r.nextInt(20)+1;                      //Generate random number within a given range.
        Random_Number_Game rng=new Random_Number_Game();
        char choice,ch;
        System.out.println("Hello there!\n"+"Lets play an interesting game where you will have to guess a number and if you are able to guess it right exciting prices are waiting for you\n"+"So if you wanna play\n"+"Type Y for playing and N if you are not interested\n"+"Y/N");
        choice=in.next().charAt(0);
        if(choice=='y'||choice=='Y')
        {
        rng.randomGenerator(random_number);
        }
        else
        {
        System.out.println("Looks like you are not currently interested in playing\n"+"You are welcomed in case you change your mind\n"+"Have a nice day!!!!!!");
        }
        in.close();
    }
}