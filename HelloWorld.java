import java.util.Scanner;

public class HelloWorld {
    static int a;
    static int b;

    public static void main(String[] args) {
        System.out.println("Hello world");
        HelloWorld hello = new HelloWorld();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        hello.add();
    }

    public void add() {
        int c = a + b;
        System.out.println("Sum of two numbers " + c);

    }
}
