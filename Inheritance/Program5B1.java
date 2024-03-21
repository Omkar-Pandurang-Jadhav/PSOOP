/*
Give the definition of four classes, Person, Doctor, Patient and Billing, whose objects are records for a clinic.
Class Doctor will be derived from the class Person. A doctor have name and Date  (inherited from the class Person),
 it’s speciality; fees and income;
Patient will be derived from the class Person. A Patient record has the patient’s name and Date
(inherited from the class Person) and a Doctor object.
A Billing object will contain a Patient object, a Doctor object, Date of bill using date object and
 an amount due of type double. Be sure your classes have a reasonable complement of constructors,
 copy constructor, override equals(check equality of object)  and toString methods and member functions.
First write a driver program to test all your member functions, and then write a test program that
creates at least two patients, at least two doctors, and at least two Billing records, then prints
out the total income from the Billing records.
At the time of Billing the Patient’s Doctor  name and Billing object’s doctor name equality should be checked.
Total bill generated will be no of days the patient admitted ( current date-admitted date ) * 2000+ doctore fees * no
of days from the date of billing ( current date-admitted date ).
Update the Doctors income to no of days from the date of billing ( current date-admitted date ).
HINTS
To Calculate Days:
D2 = new Date();
days = (D2.getTime() - D.getTime())/(1000*60*60*24);
 */

import java.util.*;
import java.util.Scanner;
import java.util.Date;
class Person{
String name;
Date date;
 public Person(String name,Date date){
     this.name=name;
     this.date=date;
 }
}

class Doctor extends Person{
    double fees;
    double income;
    String specialty;

    public Doctor(String name,Date date,String specialty,double income,double fees){
        super(name,date);
        this.specialty=specialty;
        this.income=income;
        this.fees=fees;
    }
}

class Patient extends Person{
    Doctor doctor;

    public Patient(String name,Date date,Doctor doctor){
        super(name,date);
        this.doctor=doctor;
    }
}

class Billing{
    Patient p;
    Doctor d;
    Date last_date;
    double Amount;
    public Billing(Patient p,Doctor d,Date last_date,double Amount){
        this.p=p;
        this.d=d;
        this.last_date=last_date;
        this.Amount=Amount;
    }

    public void Amountdue(Date last_date,Date date){
        long millisecond=last_date.getTime()-d.date.getTime();
        int days =(int) (millisecond)/(1000*60*60*24);
        Amount=days*2000+d.fees*days;
        d.income=d.income+Amount;
        System.out.println("Days: " + days);
        System.out.println("The amount due of patient is "+Amount+".");
        System.out.println("The total income of doctor becomes "+d.income+".");
    }
    @Override
    public String toString() {
        System.out.println("Patient -"+p.name);
        System.out.println("Doctor -"+d.name);
        System.out.println("Billing Date -"+last_date);
        System.out.println("Amount -"+Amount);
         return "Thank you";
    }
}

public class Program5B1 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Date joiningdate = new Date(2024,1,1);
        Date releasedate = new Date(2024,1,10);

        Doctor d1 = new Doctor("John",joiningdate,"cardiologist",5000,500);
        Doctor d2 = new Doctor("Wick",joiningdate,"Neurologist",10000,600);

        Patient p1 = new Patient("Jessicca",releasedate,d1);
        Patient p2 = new Patient("Jones",releasedate,d2);

        Billing b1 = new Billing(p1,d1,releasedate,0);
        Billing b2 = new Billing(p2,d2,releasedate,0);

        b1.Amountdue(releasedate,joiningdate);
        b1.toString();
        b2.Amountdue(releasedate,joiningdate);
        b2.toString();

        Date today = new Date();
        System.out.println("Today's date -"+today);
    }
}
