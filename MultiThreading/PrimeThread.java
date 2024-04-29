/*
Write a two-threaded program, where one thread finds all prime numbers (in 0 to 100) and another thread finds all palindrome numbers (in 10 to 1000). Schedule these threads in a sequential manner to get the results. Now reschedule them as parallel threads.
*/
import java.util.Scanner;

class primenumber extends Thread{
  public void run(){
  for(int i=2;i<100;i++){
    if(isprime(i)){
    System.out.println("Prime Number -"+i);
     }
   }
}

public boolean isprime(int num){

  for(int i=2;i<Math.sqrt(num);i++){
   if(num%i==0){
   return false;
    }
  }
  return true;
}
}
class palindromenumber extends Thread{
public void run(){
  for(int i=10;i<1000;i++){
  if(ispalindrome(i)){
  System.out.println("Palindrome Number -"+i);
  }
   }
   }
   
   public boolean ispalindrome(int num){
     int rev=0;
     int temp=num;
     while(temp!=0){
      int digit = temp%10;
      rev=rev*10+digit;
      temp=temp/10;
     }
     return num==rev;
   }
}
public class PrimeThread{
    public static void main(String args[]){
    
    primenumber p1 = new primenumber();
    p1.start();
    
    palindromenumber p2 = new palindromenumber();
    p2.start();
    
    }
}
