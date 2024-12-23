public class HelloWorld {
    static int a = 10;
    static int b = 11;

    public static void main(String[] args) {
        System.out.println("Hello world");
        HelloWorld.add();
    }

    public static void add() {
        int c = a + b;
        System.out.println("Sum of two numbers " + c);

    }
}
