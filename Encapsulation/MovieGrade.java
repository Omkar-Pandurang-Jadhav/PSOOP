/*
Problem Statements 1.

The "User" class represents a user on a ‘buy and stream’ movie platform with attributes : name, age,
account balance.
The “Movie” class represents a movie on the platform with attributes: Movie Title, AgeRestriction,
Cost of the movie.
The User class should have a method to check whether he can watch a movie based on his age and
        also account balance.
The User class should also have a method to WatchMovie where he has to pay the cost for the Movie
to watch it.
The Movie class should have methods to get Cost and Age restriction.
The main method should create objects of the "User" and "Movie" classes and demonstrate the use
of their methods.
*/

import java.util.Scanner;
class Movie{

    int restriction,cost;
    String title;
   
Movie(int restriction,int cost,String title){
        this.restriction=restriction;
        this.cost=cost;
        this.title=title;
    }

    

}

class user{
    int age,balance;
    String name;
    Scanner s = new Scanner(System.in);

   user(int age,int balance,String name){
        this.age=age;
        this.balance=balance;
        this.name=name;
    }


    

   
    public void condition(){
   Movie m = new Movie(int restriction,int age,String name);
   //m.movie(restriction,cost,name);
      if(balance>=m.cost && age>=m.restriction){
          System.out.println("Your are eligible to watch movie :");
      }
      else {
          System.out.println("You are not eligible to watch movie :");
      }
    }
}

public class MovieGrade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter movie information :");
        System.out.println("Enter the title of the movie :");
        String title=s.next();
        System.out.println("Enter the age restriction for movie to watch:");
        int restriction=s.nextInt();
        System.out.println("Enter the the cost of movie ticket :");
        int cost=s.nextInt();
              Movie m = new Movie(restriction,cost,title);
    
        System.out.println("Enter your information :");
        System.out.println("Enter the name:");
        String name=s.next();
        System.out.println("Enter the age of yours:");
        int age=s.nextInt();
        System.out.println("Enter the balance of your account :");
        int balance=s.nextInt();     
        
        user u = new user(age,balance,name);
        
        u.condition();

    }
}
