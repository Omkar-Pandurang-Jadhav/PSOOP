/*
Define parent class "Employee" that has 3 private attributes
String name, String id, int age.
Employee has constructor with 3 arguments that set value of name, id, age.
It also has getter and setter
methods for all 3 private attributes.
Class "SalariedEmployee" is a sub class of Employee and has 1 private attribute empSalary.
"SalariedEmployee" can be permanent or on contract and has constructor
SalariedEmployee(String name,String id, int age, double empSalary) to set the values.
constructor SalariedEmployee must call the superclass constructor to set name, id,
 age and call setter
method to set the salary.
Employee salary is empSalary + 2000(allowance) if he is a permanent employee
else Employee salary is
empSalary (no allowance).
Accept the details of 5 employees and print details of the employee with highest salary.
Create class Tester with main method
 */

import java.util.Scanner;

class Employee{
    private String name;
    private String id;
    private int age;
    private double empsalary;
    Employee(String name,String id,int age,double empsalary){
        this.name=name;
        this.id=id;
        this.age=age;
        this.empsalary=empsalary;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        name=name;
    }

    public String getid(){
        return id;
    }
    public void setid(String id){
        id=id;
    }

    public int getage(){
        return age;
    }
    public void setage(int age){
       age=age;
    }
    public double getempsalary(){
        return empsalary;
    }
    public void setempsalary(double empsalary){
        empsalary=empsalary;
    }
}

class SalariedEmployee extends Employee{
    SalariedEmployee(String name,String id,int age,double empsalary){
        super(name,id,age,empsalary);
    }

    public double setSalary(SalariedEmployee []obj){
        double a=0;
        for(int i=0;i<obj.length;i++){
            if(obj[i].getage()>18){
             a=obj[i].getempsalary()+2000;
            }
            else{
             a=obj[i].getempsalary();
            }
            //return a;
        }
        return a;
    }


}
public class Program5A2 {
    public static void main(String[] args) {
        String name,id;
        int age;
        double empsalary;
        Scanner sc = new Scanner(System.in);
        SalariedEmployee []obj = new SalariedEmployee[5];
        for(int i=0;i<obj.length;i++){
            System.out.println("Enter info for "+(i+1)+" employee :");
            System.out.print("Enter the name of employee :");
            name=sc.next();
            System.out.print("Enter the id :");
            id=sc.next();
            System.out.print("Enter the age of employee :");
            age=sc.nextInt();
            System.out.print("Enter the employee salary :");
            empsalary=sc.nextDouble();
            obj[i]= new SalariedEmployee(name,id,age,empsalary);
        }

        SalariedEmployee s = new SalariedEmployee("","",0,0);
       // s.setSalary(obj);
        double max=obj[0].getempsalary();
        System.out.println("Employee with maximum salary is :");
        for(int i=1;i<obj.length;i++){
          if(obj[i].getempsalary()>max){
              max=obj[i].getempsalary();
          }
        }
        for(int i=0;i<obj.length;i++){
            if(obj[i].getempsalary()==max){
                System.out.println("Name : "+obj[i].getname());
                System.out.println("ID : "+obj[i].getid());
                System.out.println("age : "+obj[i].getage());
                System.out.println("Employee Salary : "+obj[i].getempsalary());
            }
        }
    }
}