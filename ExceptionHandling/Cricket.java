/*
Define a class Cricketer which has:-
Attributes:-
● player_name
● runs_hit
● innings_count
● not_out_count
● batting_avg
Methods:-get_avg
Make a cricket team with 11 cricketers. For each cricketer, find his batting
average. Handle all different errors while calculating this. Also, make a method
which will find the list of cricketers in ascending order of their batting average
and also display the cricketer stats in this order.
If the average of the batting average of the entire team is less than 20 runs then throw a user-defined exception.
Note- handle errors like ArrayIndexOutOfBoundsException, ArithmeticException,ArrayStoreException, NumberFormatException, etc
*/
import java.util.Scanner;

class avgrunException extends Exception{
   public avgrunException(String message){
   super(message);
   }
}

public class Cricket{

  public static void main(String args[]){
  
  String [] name = new String[4];
  int []runs = new int[4];
  int []inning = new int[4];
  int []not_out = new int[4];
  double batting_avg;
  
  Scanner sc = new Scanner(System.in);
  for(int i=0;i<runs.length;i++){
    System.out.println("Enter the name for "+(i+1)+" player." );
    name[i]=sc.next();
    System.out.println("Enter runs scored by "+(i+1)+" player." );
    runs[i]=sc.nextInt();
    System.out.println("Enter inning played by "+(i+1)+" player." );
    inning[i]=sc.nextInt();
    System.out.println("Enter number of not out game played by "+(i+1)+" player." );
    not_out[i]=sc.nextInt();
  }
  
  int sum=0;
 
    
    try{
    for(int i=0;i<4;i++){
    sum=sum+runs[i];
    }
    batting_avg=sum/4;
    
    if(batting_avg<20){
    throw new avgrunException("Batting average of team is less than 20");
     }
    }
    catch(avgrunException e){
      System.out.println(e);
    }
  }
}
