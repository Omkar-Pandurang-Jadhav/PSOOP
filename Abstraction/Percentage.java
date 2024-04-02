/*
Write a program to calculate the percentage of marks obtained in
three subjects (each out of 100) by student
 A and in four subjects (each out of 100) by student B.
Create an abstract class 'Marks' with an abstract method 'getPercentage'.
It is inherited by two other classes 'A' and 'B' each having a
method with the same name which returns the percentage of the students.
The constructor of student A takes the marks in three subjects as its
 parameters and the marks in four subjects as its parameters for student B.
 Input to be taken from the user. Display the marks in highest order of student A and B.
 */

import java.util.Scanner;

abstract class Marks{
    int sub1,sub2,sub3,sub4;
    Marks(int sub1,int sub2,int sub3,int sub4){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
    }
    abstract void getPercentage();
}
class A extends Marks{
    A(int sub1,int sub2,int sub3,int sub4){
        super(sub1,sub2,sub3,sub4);
    }
    double percentage=((double)(sub1+sub2+sub3+sub4)/300)*100;

    public void getPercentage(){
        System.out.println("The percentage got to student A is "+percentage+"%.");
    }
}
class B extends Marks{
    B(int sub1,int sub2,int sub3,int sub4){
        super(sub1,sub2,sub3,sub4);
    }

    double percentage=((double)(sub1+sub2+sub3+sub4)/400)*100;

    public void getPercentage(){
        System.out.println("The percentage got to student B is "+percentage+"%.");
    }
}

public class Percentage {
    public static void main(String[] args) {
        int []subA = new int[3];
        int []subB = new int[4];
         Marks m1 = new A(0,0,0,0);
         Marks m2 = new B(0,0,0,0);
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject marks for student A-");
        for(int i=0;i<subA.length;i++){
            System.out.println("Enter the marks in subject "+(i+1)+" -");
            subA[i]=sc.nextInt();
        }
        m1 = new A(subA[0],subA[1],subA[2],0);
        System.out.println("Enter subject marks for student B-");
        for(int i=0;i<subB.length;i++){
            System.out.println("Enter the marks in subject "+(i+1)+" -");
            subB[i]=sc.nextInt();
        }
        m2 = new B(subB[0],subB[1],subB[2],subB[3]);
        for(int i=0;i<subA.length-1;i++){
            for(int j=0;j<subA.length-i-1;j++){
                int temp;
                if(subA[j]<subA[j+1]){
                    temp=subA[j];
                    subA[j]=subA[j+1];
                    subA[j+1]=temp;
                }
            }
        }
        for(int i=0;i<subB.length-1;i++){
            for(int j=0;j<subB.length-i-1;j++){
                int temp;
                if(subB[j]<subB[j+1]){
                    temp=subB[j];
                    subB[j]=subB[j+1];
                    subB[j+1]=temp;
                }
            }
        }
        System.out.println("The of student A -");
        for(int i=0;i<subA.length;i++){
            System.out.println("The marks in subject "+(i+1)+" is "+subA[i]+".");
        }
        System.out.println("The of student B -");
        for(int i=0;i<subB.length;i++){
            System.out.println("The marks in subject "+(i+1)+" is "+subB[i]+".");
        }
        m1.getPercentage();
        m2.getPercentage();
    }
}
