
public class HelloWorldApp {

    public static void main(String[] args) {

        // Check if name provided
        if (args.length > 0) {

            String name = args[0];

            System.out.println("Hello " + name);

        } else {

            System.out.println("Hello User");

        }
    }
}