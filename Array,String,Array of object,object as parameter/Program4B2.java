import java.util.Scanner;

class Hotel {
    int ID;
    int room_type[] = new int[3]; // Array to store the number of rooms for each type
    String location;

    // Constructor to initialize hotel details
    Hotel(int ID, String location, int room_type[]) {
        this.ID = ID;
        this.location = location;
        this.room_type = room_type.clone(); // Cloning to avoid sharing the array reference
    }

    // Method to list hotel details in a given location
    void listHotels(Hotel h[], String location) {
        System.out.println("The hotel details for location " + location + " are :");
        for (int i = 0; i < h.length; i++) {
            if (h[i].location.equals(location)) {
                System.out.println("ID :" + h[i].ID);
                System.out.println("Number of rooms of type suites, deluxe, and standard are:");
                for (int j = 0; j < 3; j++) {
                    System.out.print(h[i].room_type[j] + " ");
                }
                System.out.println();
            }
        }
    }

    // Method to list total number of rooms in each hotel of the given room type
    void listHotels(Hotel h[], int n) {
        System.out.println("Total number of rooms in each hotel of the given room type are :");
        for (int i = 0; i < h.length; i++) {
            System.out.println("Hotel of ID " + h[i].ID + " at location " + h[i].location +
                               " have total number of rooms are " + h[i].room_type[n] + ".");
        }
    }
}

public class Program4B2 {
    public static void main(String[] args) {
        int ID;
        Hotel h[] = new Hotel[2]; // Array to store hotel objects
        String location;

        Scanner sc = new Scanner(System.in);

        // Input hotel details
        for (int i = 0; i < h.length; i++) {
            System.out.println("Enter hotel details for " + (i + 1) + " hotel.");
            System.out.print("Enter the ID of hotel -");
            ID = sc.nextInt();
            System.out.print("Enter location of hotel -");
            location = sc.next();
            int[] room_type = new int[3]; // Array to store room types
            System.out.print("Enter total number of room for type suites, deluxe, and standard -");
            for (int j = 0; j < 3; j++) {
                room_type[j] = sc.nextInt();
            }
            h[i] = new Hotel(ID, location, room_type); // Creating hotel object
        }

        Hotel h1 = new Hotel(0, "", new int[3]);
        System.out.print("Enter the location of hotel you want details of -");
        location = sc.next();
        h1.listHotels(h, location); // Listing hotel details for given location
        System.out.println("Enter 0 for suites\nEnter 1 for Deluxe\nEnter 2 for standard");
        System.out.print("Enter the number based on choice -");
        int n = sc.nextInt();
        h1.listHotels(h, n); // Listing total number of rooms for given room type
    }
}
