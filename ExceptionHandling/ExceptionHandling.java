/*
Write a java program to throw a exception (checked) for an employee details. a) If an employee name is a number, a name exception must be thrown. b) If an employee age is greater than 50, an age exception must be thrown. c) Or else an object must be created for the entered employee details
Demonstarte different kinds of Exceptions:
1-AirthmaticException: find HCF and LCM of two no's
2- Array outofboud exception: 
3-NumberFormatException
4-StringIndexOutOfBoundsException
*/
import java.util.Scanner;



public class ExceptionHandling{
  public static void main(String args[]){
  
  
    try{
       String a="Omkar";
      System.out.println(a.charAt(5));
        
     //   int b=10;
      // int c=b/0;
     }
    catch(ArithmeticException e){
    System.out.println("Arithmatic Exception divide by zero.");
     }
     catch(Exception e){
      // System.out.println(e);
      System.out.println("Catch 1:"+e);
    }
    try{
     int b=10;
     int c=b/0;
    }
    catch(ArithmeticException e){
    System.out.println(e);
     }
     catch(Exception e){
      // System.out.println(e);
      System.out.println("Catch 1:"+e);
    }
    try{
     int []arr ={1,2,3,4};
     System.out.println(arr[4]);
    }
    catch(ArrayIndexOutOfBoundsException e){
    System.out.println("The exception is array index out of bound.");
    }
    catch(Exception e){
    System.out.println(e);
    }
  }
}
