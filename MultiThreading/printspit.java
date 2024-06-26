/*
Write a program to print "Welcome to SPIT" and "Computer Engineering Department"
 continuously on the screen in Java using threads.
  Add a sleep method in the welcome thread to delay its execution for 200ms.
(can use wait(), notify() )
*/
class welcome extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Welcome to spit");
                Thread.sleep(200);
            }
        }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    class Computer extends Thread{
        public void run(){
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Computer Engineering Department");
                    Thread.sleep(200);
                }
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }

    }
    public class printspit{
        public static void main(String args[]){
            welcome w = new welcome();
            Computer c = new Computer();
            w.start();
            c.start();
            w.getPriority();
        }
    }
