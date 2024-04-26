/*
Write a program to implement stack operations:
a.Push b. Pop
Write a user defined exception to check whether the stack is full or
empty
*/

class Stack {
    int arr[];
    int top;
    final static int DEFAULT_SIZE = 10;

    Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    Stack() {
        this(DEFAULT_SIZE);
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == arr.length - 1;
    }

    void push(int data) throws StackOverflowError {
        if (isFull()) {
            throw new StackOverflowError();
        }
        arr[++top] = data;
    }

    int pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arr[top--];
        
    }
}

class EmptyStackException extends Exception {

    EmptyStackException() {
        super("Stack is empty");
    }
}

class StackOverflowError extends Exception {

    StackOverflowError() {
        super("Stack is full");
    }
}

public class StackException {
    public static void main(String[] args) {
        Stack s = new Stack(6);
        try {
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
            s.push(50);
            s.push(99);
            System.out.println("Popped element: " + s.pop());
            System.out.println("Popped element: " + s.pop());
            System.out.println("Popped element: " + s.pop());
            System.out.println("Popped element: " + s.pop());
            System.out.println("Popped element: " + s.pop());
            System.out.println(s.pop());
            
        } catch (StackOverflowError e) {
            System.out.println(e.getMessage());
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }
    }
}
