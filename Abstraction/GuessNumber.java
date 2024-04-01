/*
The task is to write a Java program in which a user will get K trials to guess a randomly generated number. Below are the rules of the game:
If the guessed number is bigger than the actual number, the program will respond with the message that the guessed number is higher than the actual number.
If the guessed number is smaller than the actual number, the program will respond with the message that the guessed number is lower than the actual number.
If the guessed number is equal to the actual number or if the K trials are exhausted, the program will end with a suitable message.
            Approach: Below are the steps: 
The approach is to generate a random number using Math.random() method in Java.
Now using a loop, take K input from the user and for each input print whether the number is smaller or larger than the actual number.
If within K trials the user guessed the number correctly, print that the user won.
Else print that he was not able to guess and then print the actual number.
Define the Player class with a abstract function named getGuess().
*/

import java.util.Scanner;
import java.util.Random;

abstract class Player{
 public abstract void getGuess();
}

class game extends Player{
Scanner sc = new Scanner(System.in);
int n;
int num;
int count=0;
   game(int n){
   this.n=n;
   }
   
   public void getGuess(){
   System.out.println("Guess the number between 0 to 100");
   for(int i=1;i<=5;i++){
   System.out.println("Enter the number of "+i+" attempt -");
   num=sc.nextInt();
    if(n<num){
     System.out.println("The guess number is bigger than actual number.");
    }
    else if(n>num){
      System.out.println("The guess number is less than actual number.");
    }
    else if(n==num){
    System.out.println("The guess number is correct and you have won the game.");
    break;
    }
    count++;
   }
   
   if(count==5 && n!=num){
   System.out.println("The attemt are over and you have lost the game.");
   }
   }
}

public class GuessNumber{
  public static void main(String[] args){
  Random r = new Random();
  int n=r.nextInt(100);
  System.out.println("The random number is "+n);
  Player p = new game(n);
  p.getGuess();
  }
}
