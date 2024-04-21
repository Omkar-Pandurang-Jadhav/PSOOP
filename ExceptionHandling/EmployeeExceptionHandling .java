/*
Write a java program to throw a exception (checked) for an employee details.
a) If an employee name is a number, a name exception must be thrown.
b) If an employee age is greater than 50, an age exception must be thrown.
 c) Or else an object must be created for the entered employee details
Demonstrate different kinds of Exceptions:
1-ArithmaticException: find HCF and LCM of two no's
2- ArrayIndexOutofBound exception:
3-NumberFormatException
4-StringIndexOutOfBoundsException
 */
import java.util.Scanner;
class NameException extends Exception{
    public NameException(String message){
        super(message);
    }
}
class AgeException extends Exception{
    public AgeException(String message){
        super(message);
    }
}

public class EmployeeExceptionHandling {
    String name;
    int age;
    public EmployeeExceptionHandling(String name,int age){
        this.name=name;
        this.age=age;

    }
    public static void main(String[] args) {

        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name -");
        name=sc.next();
        System.out.println("Enter the age-");
        age=sc.nextInt();

        EmployeeExceptionHandling e = new EmployeeExceptionHandling(name,age);

        try {
            if (name.matches("[0-9]+")) {
                throw new NameException("The number cannot be entered in name.");
            }
        }
        catch(NameException e1){

            System.out.println(e1.getMessage());
        }try{
            if(age>50){
                throw new AgeException("Age cannot be greater that 50.");
            }
        }
        catch(AgeException e2){
            System.out.println(e2.getMessage());
        }
        System.out.println("Object created successfully.");


        System.out.println("End of Employee Program");
        System.out.println();

        System.out.println("Demonstration of different kinds of Exception:");
        System.out.println();

        System.out.println("Array out of bound exception: ");
        int[] arr = new int[5];
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e3) {
            System.out.println(e3.getMessage());
        }
        System.out.println();

        System.out.println("NumberFormatException: ");
        try {
            String a = sc.next();
            int num = Integer.parseInt(a);
            System.out.println("The Parsed Number is: " + num);
        } catch(NumberFormatException e3) {
            System.out.println(e3.getMessage());
        }
        System.out.println();

        System.out.println("StringOutOfBoundsExample: ");
        String sample = "Hello";
        try {
            char character = sample.charAt(10);
            System.out.println(character);
        } catch (StringIndexOutOfBoundsException e3) {
            System.out.println(e3.getMessage());
        }
    }
}
