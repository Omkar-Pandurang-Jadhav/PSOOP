import java.util.Scanner;

class Instructor {
    String arr[][];
    int schedulesJeff[][];
    int schedulesAnna[][];

    // Constructor to initialize schedules for Jeff and Anna
    Instructor(String arr[][], int schedulesJeff[][], int schedulesAnna[][]) {
        this.arr = arr;
        this.schedulesJeff = schedulesJeff;
        this.schedulesAnna = schedulesAnna;
    }

    // Method to print schedules for Jeff and Anna
    public void printschedules(Instructor obj1[]) {
        int cnt = 0;
        for (int i = 0; i <= obj1.length - 1; i++) {
            if (i == 0) {
                System.out.println("The schedule for instructor Jeff.");
            } else if (i == 1) {
                System.out.println("The schedule for instructor Anna.");
            }

            for (int j = 0; j < 4; j++) {
                cnt = 0;
                for (int k = 0; k < 4; k++) {
                    if (i == 0) {
                        if (obj1[i].schedulesJeff[j][k] == 0) {
                            System.out.print(arr[0][k] + "(" + arr[1][j] + ")(busy)");
                        } else if (obj1[i].schedulesJeff[j][k] == 1) {
                            System.out.print(obj1[i].arr[0][k] + "(" + obj1[i].arr[1][j] + ")(free)");
                        }
                    } else if (i == 1) {
                        if (obj1[i].schedulesAnna[j][k] == 0) {
                            System.out.print(arr[0][k] + "(" + arr[1][j] + ")(busy)");
                        } else if (obj1[i].schedulesAnna[j][k] == 1) {
                            System.out.print(obj1[i].arr[0][k] + "(" + obj1[i].arr[1][j] + ")(free)");
                        }
                    }
                    System.out.print(" ");
                    cnt++;
                }
                if (cnt == 4) {
                    System.out.print("\n");
                }
            }
        }

    }

    // Method to print time slots available for individual lessons
    public void individuallesson(Instructor obj1[]) {
        int cnt = 0;
        for (int i = 0; i <= obj1.length - 1; i++) {
            if (i == 0) {
                System.out.println("The individual lesson available by instructor Jeff.");
            } else if (i == 1) {
                System.out.println("The individual lesson available by instructor Anna.");
            }

            for (int j = 0; j < 4; j++) {
                cnt = 0;
                for (int k = 0; k < 4; k++) {
                    if (i == 0) {
                        if (obj1[i].schedulesJeff[j][k] == 1) {
                            System.out.print(obj1[i].arr[0][k] + "(" + obj1[i].arr[1][j] + ")");
                        }
                    } else if (i == 1) {
                        if (obj1[i].schedulesAnna[j][k] == 1) {
                            System.out.print(obj1[i].arr[0][k] + "(" + obj1[i].arr[1][j] + ")");
                        }
                    }
                    System.out.print(" ");
                    cnt++;
                }
                if (cnt == 4) {
                    System.out.print("\n");
                }
            }
        }
    }

    // Method to print time slots available for group lessons
    public void grouplesson(Instructor obj1[]) {
        int cnt = 0;
        System.out.println("The schedule for group lesson by Jeff and Anna is -");
        for (int i = 0; i < obj1.length - 1; i++) {
            for (int j = 0; j < 4; j++) {
                cnt = 0;
                for (int k = 0; k < 4; k++) {

                    if (obj1[i].schedulesJeff[j][k] == 1 && obj1[i].schedulesAnna[j][k] == 1) {
                        System.out.print(obj1[i].arr[0][k] + "(" + obj1[i].arr[1][j] + ")");
                    }

                    System.out.print(" ");
                    cnt++;
                }
                if (cnt == 4) {
                    System.out.println();
                }
            }
        }
    }
}

public class Program4A2 {
    public static void main(String[] args) {
        String arr[][] = {{"Monday", "Tuesday", "Wednesday", "Thursday"}, {"11-12", "12-1", "1-2", "2-3"}};
        int schedulesJeff[][] = new int[4][4];
        int schedulesAnna[][] = new int[4][4];
        Instructor obj1[] = new Instructor[2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= obj1.length - 1; i++) {
            if (i == 0) {
                System.out.println("Enter schedule for instructor Jeff.");
            } else if (i == 1) {
                System.out.println("Enter schedule for instructor Anna.");
            }
            System.out.println("Enter 0 for busy schedule and 1 for free.");
            int cnt = 0;
            for (int j = 0; j < 4; j++) {
                cnt = 0;
                for (int k = 0; k < 4; k++) {
                    System.out.print(arr[0][k] + "(" + arr[1][j] + ")-");
                    if (i == 0) {
                        schedulesJeff[j][k] = sc.nextInt();
                    } else if (i == 1) {
                        schedulesAnna[j][k] = sc.nextInt();
                    }
                    cnt++;
                }
                if (cnt == 4) {
                    System.out.print("\n");
                }
            }
            obj1[i] = new Instructor(arr, schedulesJeff, schedulesAnna);
        }
        Instructor a = new Instructor(arr, schedulesJeff, schedulesAnna);
        int n;
        System.out.println("1)View schedule \n2)Time slot available for individual lesson \n3)Group Lesson");
        System.out.println("Enter the number from 1 to 3 -");
        n = sc.nextInt();
        if (n >= 1 && n <= 3) {
            switch (n) {
                case 1:
                    System.out.println("The schedule for Jeff and Anna is -");
                    a.printschedules(obj1);
                    break;
                case 2:
                    a.individuallesson(obj1);
                    break;
                case 3:
                    a.grouplesson(obj1);
                    break;
            }
        }
    }
}
