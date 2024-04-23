/*
Write a Java program to perform a runnable interface, take two threads t1 and t2 and fetch the names of the thread using getName() method.
Sample Output:
Thread names are following:
Thread A
Thread B
*/
//package Threading;
//import java.lang.Thread;
class A implements Runnable{
  public void run(){
  System.out.println("Hi "+Thread.currentThread().getName());
  }
}
class B implements Runnable{
  public void run(){
  System.out.println("Hello "+Thread.currentThread().getName());
  }
}
class multithreading1 {
  public static void main(String args[]){
    A a = new A();
    B b = new B();
    Thread t1 = new Thread(a);
    Thread t2 = new Thread(b);
    t1.start();
    t2.start();
    System.out.println(t1.getName());
    System.out.println(t2.getName());
  }
}
