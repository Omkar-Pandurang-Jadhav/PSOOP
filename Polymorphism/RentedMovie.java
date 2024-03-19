
/*
Create a class named Movie that can be used with your video rental business.
The Movie class should track the Motion Picture Association of America (MPAA) rating (e.g., Rated G, PG-13, R),
ID Number, and movie title with appropriate accessor and mutator methods.
Also create an equals() method that overrides Object ’s equals() method, where two movies are equal if their
ID number is identical. Next, create three additional classes named Action, Comedy, and Drama that are derived from
Movie. Finally, create an overridden method named calcLateFees that takes as input the number of days a movie is
late and returns the late fee for that movie. The default late fee is $2/day. Action movies have a late fee of $3/day
, comedies are $2.50/day, and dramas are $2/day. Test your classes from a main method.
Extend the previous problem with a Rental class.
 This class should store a Movie that is rented, an integer representing the ID of the customer that rented the movie,
and an integer indicating how many days late the movie is. Add a method that calculates the late fees for the rental.
In your main method, create an array of type Rental filled with sample data of all types of movies. Then, create a
method named lateFeesOwed that iterates through the array and returns the total amount of late fees that are
outstanding.
Last modified: Tuesday, 19 March 2024, 9:09 AM
*/
import java.util.Scanner;

class Movie{
    private String MPAA;
    private String ID;
    private String title;

    public Movie(){
    }

    public String getMPAA(){
        return MPAA;
    }
    public void setMPAA(String MPAA){
        this.MPAA=MPAA;
    }
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID=ID;
    }
    public String gettitle(){
        return title;
    }
    public void settitle(String title){
        this.title=title;
    }

    public String equals(){
        System.out.println("Title-"+gettitle());
        System.out.println("ID-"+getID());
        System.out.println("MPAA-"+getMPAA());
        return "MovieInfo";
    }
    public double calcLateFees(int days){
        return 2*days;
    }
}

class Action extends Movie{

    public Action(){

    }

    public String equals(){
        super.equals();
        return "Thankyou";
    }

    public double calcLateFees(int days){
        return 3*days;
    }
}

class Comedy extends Movie{

    public Comedy(){

    }
    public String equals(){
        super.equals();
        return "Thankyou";
    }

    public double calcLateFees(int days){
        return 2.5*days;
    }
}

class Drama extends Movie{

    public Drama(){

    }

    public String equals(){
        super.equals();
        return "Thankyou";
    }

    public double calcLateFees(int days){
        return 2*days;
    }
}

class Rental{
    String Movie;
    String cusID;
    int latedays;
   static double total;
    Movie m = new Movie();
    Rental(String Movie,String cusID,int latedays){
        this.Movie=Movie;
        this.cusID=cusID;
        this.latedays=latedays;
        total=total+m.calcLateFees(latedays);
    }
    double t=total;
   public double lateFeesOwed(int latedays){
     return m.calcLateFees(latedays);
   }
}

public class RentedMovie{
    public static void main(String args[]){
        String title="";
        String ID="";
        String MPAA="";
        int days;
        int n;
        Scanner sc = new Scanner(System.in);

        Action a = new Action();
        Comedy c = new Comedy();
        Drama d = new Drama();

        System.out.println("1)Action movie\n2)Comedy movie\n3)Drama movie");
        for(int i=1;i<=3;i++){
            System.out.println("Enter info for "+i+" movie.");
            System.out.println("Enter the number based on your choice -");
            n=sc.nextInt();
            System.out.println("Enter the title of movie -");
            title=sc.next();
            System.out.println("Enter the ID of a movie -");
            ID=sc.next();
            System.out.println("Enter the Rated movie type by MPAA-");
            MPAA=sc.next();
            System.out.println("Enter the number of days you have late to submit -");
            days=sc.nextInt();
            if(n==1){
                a.settitle(title);
                a.setID(ID);
                a.setMPAA(MPAA);
                System.out.println(a.equals());
                System.out.println("The rent you have to pay  for action movie "+a.gettitle()+" of ID "+a.getID()+" is "+a.calcLateFees(days)+"$.");
            }
            else if(n==2){
                c.settitle(title);
                c.setID(ID);
                c.setMPAA(MPAA);
                System.out.println(c.equals());
                System.out.println("The rent you have to pay  for action movie "+c.gettitle()+" of ID "+c.getID()+" is "+c.calcLateFees(days)+"$.");
            }
            else if(n==3){
                d.settitle(title);
                d.setID(ID);
                d.setMPAA(MPAA);
                System.out.println(d.equals());
                System.out.println("The rent you have to pay  for action movie "+d.gettitle()+" of ID "+d.getID()+" is "+d.calcLateFees(days)+"$.");
            }

        }
        String Movie;
        String cusID;
        int latedays=0;
        Rental [] r = new Rental[3];
        Rental r1 = new Rental("","",0);
        System.out.println("Enter the info for rented movie :");
        for(int i=0;i<r.length;i++){
            System.out.println("Enter the name of Movie-");
            Movie=sc.next();
            System.out.println("Enter the cusID -");
            cusID=sc.next();
            System.out.println("Enter the days you are late to return Movie CD -");
            latedays=sc.nextInt();
            r[i] = new Rental(Movie,cusID,latedays);
        }
        System.out.println("The fees for rented movie is -");
        for(int i=0;i<r.length;i++){
            System.out.println("Movie "+(i+1)+" - "+r[i].lateFeesOwed(latedays)+"$.");
        }
        System.out.println("The total rent for movie is "+Rental.total+"$.");
    }
}
