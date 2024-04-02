/*
Write a program to calculate the area of 4 rectangles, 5 squares and  2 circles.
Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each.
The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius.
Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively.
Create an object of class 'Area' and call all the three methods.
*/
import java.util.Scanner;

abstract class Shape{
    double l1,l2,b,r;
    Shape(double l1,double l2,double b,double r){
        this.l1=l1;
        this.l2=l2;
        this.b=b;
        this.r=r;
    }

    abstract void RectangleArea();
    abstract void SquareArea();
    abstract void CircleArea();
}

class Area1 extends Shape{

    Area1(double l1,double l2,double b,double r){
        super(l1,l2,b,r);
    }
    public void RectangleArea(){
        System.out.println("The area of rectangle is "+(l1*b));
    }
    public void SquareArea(){
        System.out.println("The area of square is "+(l2*l2));
    }
    public void CircleArea(){
        System.out.println("The area of circle is "+(3.14*r*r));
    }
}
public class Area{
    public static void main(String [] args){
        double []l1 = new double [4];
        double []b = new double [4];
        double []l2 = new double [5];
        double []r = new double [2];
        Scanner sc = new Scanner(System.in);
        Shape []s = new Area1[11];

        for(int i=0;i<11;i++){
            if(i>=0 && i<=3){
                System.out.println("Enter info for "+(i+1)+" rectangle.");
                System.out.println("Enter the length:");
                l1[i]=sc.nextDouble();
                System.out.println("Enter the breadth:");
                b[i]=sc.nextDouble();
            }
            else if(i>=4 && i<=8){
                System.out.println("Enter info for "+(i-3)+" square.");
                System.out.println("Enter the length:");
                l2[i-4]=sc.nextDouble();
            }
            else if(i>=9 && i<=10){
                System.out.println("Enter info for "+(i-8)+" circle.");
                System.out.println("Enter the radius:");
                r[i-9]=sc.nextDouble();
            }
        }
        for(int i=0;i<11;i++){
            if(i>=0 && i<=3){
                s[i]=new Area1(l1[i],0,b[i],0);
                System.out.println("Rectangle "+(i+1));
                s[i].RectangleArea();
            }
            else if(i>=4 && i<=8){
                s[i]=new Area1(0,l2[i-4],0,0);
                System.out.println("Square "+(i-3));
                s[i].SquareArea();
            }
            else if(i>=0 && i<=3){
                s[i]=new Area1(0,0,0,r[i-9]);
                System.out.println("Circle "+(i-8));
                s[i].CircleArea();
            }
        }


    }
}
