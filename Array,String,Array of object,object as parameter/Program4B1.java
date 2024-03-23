/*
Create a class called ShoppingCart to represent the following scenario:
In a mall, a conveyor belts holds “c” carts at a time. Each cart may contain
variable number of items, items which are either Perishable or Non-perishable
category items. Create a 3D array named as cart which stores the cost of
items purchased.
Hint: Use Ragged/Jagged Arrays
For c=3, find out:
a) Total cost of each cart.
b) Find out all perishable items sold (on 3 carts).
c) Find out the costliest non-perishable item sold
*/
import java.util.*;

class Cart {
    // 3D array to store cart data: [cart_number][perishibility][price]
    int[][][] data = new int[3][2][];
    int[] no_of_items = new int[3]; // Array to store number of items in each cart

    // Constructor to initialize the cart
    Cart() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 stands for a perishable item, 2 is non-perishable");

        // Accepting number of items in each cart and initializing array sizes accordingly
        for (int k = 0; k < 3; k++) {
            System.out.println("Enter number of items in cart " + (k + 1));
            no_of_items[k] = sc.nextInt();
            data[k][0] = new int[no_of_items[k]]; // Array for perishability
            data[k][1] = new int[no_of_items[k]]; // Array for price
        }

        // Accepting data for each item in each cart
        for (int j = 0; j < 3; j++) {
            System.out.println("Enter info for cart " + (j + 1));
            for (int i = 0; i < no_of_items[j]; i++) {
                System.out.println("Enter Data for item: " + (i + 1));
                System.out.println("Enter perishability info: ");
                data[j][0][i] = sc.nextInt();

                System.out.println("Enter Price: ");
                data[j][1][i] = sc.nextInt();
            }
        }

        sc.close();
    }

    // Method to calculate total cost of each cart
    void totalCost() {
        int totalCost = 0;
        for (int j = 0; j < 3; j++) {
            totalCost = 0;
            for (int i = 0; i < no_of_items[j]; i++) {
                totalCost += data[j][1][i];
            }
            System.out.printf("Total cost of cart %d is: %d \n", (j + 1), totalCost);
        }
    }

    // Method to calculate number of perishable items in each cart
    void numberOfPerishable() {
        int numberOfPerishable = 0;
        for (int j = 0; j < 3; j++) {
            numberOfPerishable = 0;
            for (int i = 0; i < no_of_items[j]; i++) {
                if (data[j][0][i] == 1) {
                    numberOfPerishable++;
                }
            }
            System.out.printf("There are %d perishable items in cart %d \n", numberOfPerishable, (j + 1));
        }
    }

    // Method to find maximum cost of non-perishable item in each cart
    void maxNonPerishable() {
        int maxNonPerishable = 0;

        for (int j = 0; j < 3; j++) {
            maxNonPerishable = 0;
            for (int i = 0; i < no_of_items[j]; i++) {
                if (data[j][1][i] > maxNonPerishable && data[j][0][i] == 2) {
                    maxNonPerishable = data[j][1][i];
                }
            }
            System.out.printf("Maximum cost of non-perishable item in cart %d is %d \n", (j + 1), maxNonPerishable);
        }
    }
}

public class Program4B1 {
    public static void main(String[] args) {
        Cart c1 = new Cart();

        // Calling methods to perform operations on cart
        c1.totalCost();
        c1.maxNonPerishable();
        c1.numberOfPerishable();
    }
}
