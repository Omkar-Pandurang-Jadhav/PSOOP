/*
Define class Production that has attributes String title, String director, String writer. Production class has 3 argument constructor that sets the values. It also has getter and setter methods and Overridden toString() of object class  to display details of class.
class Play is a sub class of Production with getter and setter methods and has an attribute int performances that is incremented every time a play happens.Add Overridden toString() of object class  to display details of class
class Musical is a Play with songs. Musical object has all attributes of Play as well as String composer and String lyricist along with getter and setter methods. Override toString display all attributes of Musical object
In main create 3 objects of Play and 2 objects of Musical. Every time an object of Play or Musical is created, performances get incremented. Also add the number of seats booked for each play or musical.
Find the total box office collection, provided cost of 1 seat for Play is Rs 500(can be variable) and cost of 1 seat for Musical is Rs 800(can be variable)
Display total No. of performances as 5 and display the box office collection.
Create class Tester with main method.
Last modified: Monday, 18 March 2024, 12:33 PM
*/
import java.util.Scanner;
class Production{
    private String title,director,writer;

    Production(){
    }

    public String gettitle(){
        return title;
    }
    public void settitle(String title){
        this.title=title;
    }
    public String getdirector(){
        return director;
    }
    public void setdirector(String director){
        this.director=director;
    }
    public String getwriter(){
        return writer;
    }
    public void setwriter(String writer){
        this.writer=writer;
    }

    public String toString(){
        System.out.println("Title-"+gettitle());
        System.out.println("Director-"+getdirector());
        System.out.println("Writer-"+getwriter());
        return "Thank you";
    }
}

class Play extends Production{
    static int performance=0;
    Play(){
        performance++;
    }
    public String toString(){
        super.toString();
        System.out.println("Performance-"+performance);
        return "Thank you";
    }
}

class Musical extends Play{
    private String composer;
    private String lyricist;
    Musical(){
      //  performance++;
    }

    public String getcomposer(){
        return composer;
    }
    public void setcomposer(String composer){
        this.composer=composer;
    }
    public String getlyricist(){
        return lyricist;
    }
    public void setlyricist(String lyricist){
        this.lyricist=lyricist;
    }

    public String toString(){
        super.toString();
        System.out.println("Composer-"+getcomposer());
        System.out.println("lyricist-"+getlyricist());
        return "Thank you";
    }
}

public class Tester{
    public static void main(String args[]){
        int collection=0;
        int seat;
        Scanner sc = new Scanner(System.in);

        Play p1 = new Play();
        p1.settitle("Aot");
        p1.setdirector("Mappa");
        p1.setwriter("Isamaya");
        System.out.println("Play 1:");
        System.out.println(p1.toString());

        Play p2 = new Play();
        p2.settitle("JJK");
        p2.setdirector("Mappa");
        p2.setwriter("Gege");
        System.out.println("Play 2:");
        System.out.println(p2.toString());

        Play p3 = new Play();
        p3.settitle("Demons Slayer");
        p3.setdirector("Ufotable");
        p3.setwriter("Koyoharu");
        System.out.println("Play 3:");
        System.out.println(p3.toString());

        for(int i=1;i<=3;i++){
            System.out.println("Enter the number seat for play "+i+" -");
            seat=sc.nextInt();
            collection=collection+500*seat;
        }
        int c1=collection;
        collection=0;
        Musical m1 = new Musical();
        m1.settitle("Sairat");
        m1.setdirector("Nagraj");
        m1.setwriter("Nagraj");
        m1.setcomposer("Ajay-Atul");
        m1.setlyricist("Ajay-Atul");
        System.out.println("Music 1:");
        System.out.println(m1.toString());

        Musical m2 = new Musical();
        m2.settitle("Natsamrat");
        m2.setdirector("Nana patekar");
        m2.setwriter("Nana patekar");
        m2.setcomposer("Ajay-Atul");
        m2.setlyricist("Ajay-Atul");
        System.out.println("Music 2:");
        System.out.println(m2.toString());

        for(int i=1;i<=2;i++){
            System.out.println("Enter the number seat for Musical play "+i+" -");
            seat=sc.nextInt();
            collection=collection+800*seat;
        }
        int c2=collection;
        System.out.println("Total number of performance is - "+m2.performance);
        System.out.println("Collection through play is "+c1+" and collection through music is "+c2+" and total boxoffice collection is "+(c1+c2)+" Rupees.");
        
    }
}