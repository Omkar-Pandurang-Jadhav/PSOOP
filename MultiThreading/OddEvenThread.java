/*
Print even numbers by one thread and odd numbers by another thread
and print the
sum of even and odd numbers by third thread.
Use the Thread control function and its method (atleast one)
 */


class even extends Thread{
    public void run(){
        for(int i=0;i<=10;i=i+2){
            System.out.println("Even = "+i);
        }
    }
}
class odd extends Thread{
    public void run(){
        for(int i=1;i<=10;i=i+2){
            System.out.println("Odd = "+i);
        }
    }
}
class sum extends Thread{
    public void run(){
        int sum=0;
        try {
            sleep(1000);
            for (int i = 0; i <= 10; i++) {
                sum = sum + i;
            }
            System.out.println("Sum = " + sum);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

public class OddEvenThread {
    public static void main(String[] args) {
         odd o = new odd();
         even e = new even();
         sum s = new sum();
         o.start();
         e.start();
         s.start();
    }
}
