
public class HelloWorldApp {

    public static void main(String[] args) {

        String name;

        // Check if argument provided
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";   // Default value
        }

        System.out.println("Hello " + name);
    }
}