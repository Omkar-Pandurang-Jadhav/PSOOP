
/*
Write an abstract class Course with an abstract method studentDetails().
Create 2 classes Comps and IT which inherits class Course and implements studentDetails().
The studentDetails() method should print the name, UID, and year (FE, SE, TE) of students of that Course. These details have to be taken from the user. Write a program that asks user to choose a course  and print the details of all students in that course in a sorted manner  as per the year( FE,SE,TE)
*/
import java.util.Scanner;

abstract class Course{
    String name;
    int uid;
    int n;
    Course(String name,int uid,int n){
        this.name=name;
        this.uid=uid;
        this.n=n;
    }
    abstract void studentDetails();
}
class Comps extends Course{

    Comps(String name,int uid,int n){
        super(name,uid,n);
    }
    public void studentDetails(){
        System.out.println("Name-"+name);
        System.out.println("UID-"+uid);
        if(n==1){
            System.out.println("Year-FE");
        }
        else if(n==2){
            System.out.println("Year-SE");
        }
        else if(n==3){
            System.out.println("Year-TE");
        }
    }
}

class IT extends Course{

    IT(String name,int uid,int n){
        super(name,uid,n);
    }
    public void studentDetails(){
        System.out.println("Name-"+name);
        System.out.println("UID-"+uid);
        if(n==1){
            System.out.println("Year-FE");
        }
        else if(n==2){
            System.out.println("Year-SE");
        }
        else if(n==3){
            System.out.println("Year-TE");
        }
    }
}

public class Coursetype{
    public static void main(String[] args){
        String name;
        int uid;
        int n;
        int n1;
        Scanner sc = new Scanner(System.in);
        Course []c1 = new Comps[3];
        Course []c2 = new IT[3];
        System.out.println("Enter 1 for comps and 2 for IT");
        n1=sc.nextInt();
        if(n1==1){
            for(int i=0;i<c1.length;i++){
                System.out.println("Enter Name:");
                name=sc.next();
                System.out.println("Enter uid:");
                uid=sc.nextInt();
                System.out.println("Enter 1 for FE ,2 for SE and 3 for TE:");
                n=sc.nextInt();
                c1[i]=new Comps(name,uid,n);
            }
        }
        else if(n1==2){
            for(int i=0;i<c2.length;i++){
                System.out.println("Enter Name:");
                name=sc.next();
                System.out.println("Enter uid:");
                uid=sc.nextInt();
                System.out.println("Enter 1 for FE ,2 for SE and 3 for TE:");
                n=sc.nextInt();
                c2[i]=new IT(name,uid,n);
            }
        }


        System.out.println("The info students is -");
        if(n1==1){
            for(int i=0;i<3;i++){
                c1[i].studentDetails();
            }
        }
        else if(n1==2){
            for(int i=0;i<3;i++){
                c2[i].studentDetails();
            }
        }

    }
}
