import java.util.*;
class FibonacciThread extends Thread
 {
    public void run() {
        int n1 = 0, n2 = 1, n3;
        System.out.println("Fibonacci Series:");
        int n=10;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 2; i <=n;i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

class ReverseThread extends Thread {
    public void run()
 {
        for (int i = 10; i > 0; i--)
 {

      System.out.println("reverse order: ");
            System.out.print(i + " ");
        }
    }
}

class Main {
    public static void main(String[] args) {
        FibonacciThread fibonacciThread = new FibonacciThread();
        ReverseThread reverseThread = new ReverseThread();

        fibonacciThread.start();
        reverseThread.start();
    }
}
