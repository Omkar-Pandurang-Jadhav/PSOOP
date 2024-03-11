/*
Write a program in Java to maintain the information of Movies which includes the information of name
of movie , type of movie( action , thriller , comedy ,drama ) , Hero name , Heroine , budget in Rs. Write
a program to accept the information of movies from user and sort them according to the budget of the
film.
 */
import java.util.Scanner;

class MovieInfo{
    String movie,type,hero,heroine;
    int budget;

    MovieInfo(String movie,String type,String hero,String heroine,int budget){
        this.movie=movie;
        this.type=type;
        this.hero=hero;
        this.heroine=heroine;
        this.budget=budget;
    }

  //  public static MovieInfo budgetsort(){
  //      int temp;
  //  }


}
public class Program4A1 {
    public static void main(String[] args) {
        String movie,type,hero,heroine;
        int budget;
        Scanner sc = new Scanner(System.in);
        MovieInfo obj[] = new MovieInfo[4];
        for(int i=1;i<=4;i++) {
            System.out.println("Enter thr info "+i+" movie.");
            System.out.println("Enter the name of movie -");
            movie = sc.next();
            System.out.println("Enter type of movie -");
            type = sc.next();
            System.out.println("Enter the name of hero -");
            hero = sc.next();
            System.out.println("Enter the name of heroine -");
            heroine = sc.next();
            System.out.println("Enter the budget of movie in rupees -");
            budget = sc.nextInt();
            obj[i] = new MovieInfo(movie,type,hero,heroine,budget);
        }

        for (int i = 0; i < obj.length - 1; i++) {
            for (int j = 0; j < obj.length - i - 1; j++) {
                if (obj[j].budget > obj[j + 1].budget) {
                    // Swap obj[j] and obj[j+1]
                    MovieInfo temp = obj[j];
                    obj[j] = obj[j + 1];
                    obj[j + 1] = temp;
                }
            }
        }
        System.out.println("The sorted movie is  -");
         System.out.println("Movies sorted by budget:");
        for (int i = 0; i < obj.length; i++) {
            System.out.println("Movie: " + obj[i].movie + ", Budget: " + obj[i].budget);
        }
    }
}
