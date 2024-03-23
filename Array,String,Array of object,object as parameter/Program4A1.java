/*
 Write a program in Java to maintain the information of Movies which
includes the information of name of movie , type of movie( action , thriller ,
comedy ,drama ) , Hero name , Heroine , budget in Rs. Write a program to
accept the information of movies from user and sort them according to the
budget of the film.
*/
import java.util.Scanner;

class MovieInfo {
    String name, type, hero, heroine;
    int budget;

    MovieInfo(String name, String type, String hero, String heroine, int budget) {
        this.name = name;
        this.type = type;
        this.hero = hero;
        this.heroine = heroine;
        this.budget = budget;
    }

    public void budgetsort(MovieInfo obj[]) {
        for (int i = 0; i <= obj.length - 1; i++) {
            for (int j = i + 1; j <= obj.length - 1; j++) {
                if (obj[j].budget > obj[i].budget) {
                    int temp = obj[i].budget;
                    obj[i].budget = obj[j].budget;
                    obj[j].budget = temp;
                }
            }
        }

    }
}

public class Program4A1 {
    public static void main(String[] args) {
        String name, type, hero, heroine;
        int budget;

        Scanner sc = new Scanner(System.in);
        MovieInfo obj[] = new MovieInfo[2];

        for (int i = 0; i <= obj.length - 1; i++) {
            System.out.println("Enter info of " + (i + 1) + " movie.");
            System.out.println("Enter name of movie -");
            name = sc.next();
            System.out.println("Enter type of movie -");
            type = sc.next();
            System.out.println("Enter name of hero in movie -");
            hero = sc.next();
            System.out.println("Enter name of heroine in movie -");
            heroine = sc.next();
            System.out.println("Enter the budget of movie in cr -");
            budget = sc.nextInt();

            obj[i] = new MovieInfo(name, type, hero, heroine, budget);
        }

        MovieInfo m = new MovieInfo(" ", " ", " ", " ", 0);
        m.budgetsort(obj);
        System.out.println("Sorted movies are:");
        for (int i = 0; i <= obj.length - 1; i++) {
            System.out.println("Movie: " + obj[i].name + ", Budget: " + obj[i].budget);
        }
    }
}

