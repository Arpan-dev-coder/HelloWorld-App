/**
 * UC7 – Greeting using String.join()
 * Efficiently joins multiple names with delimiter
 */

public class HelloWorldApp {

    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {

            System.out.println("Hello, World!");

        } else {

            // Join all names with ", "
            String joinedNames = String.join(", ", args);

            System.out.println("Hello, " + joinedNames + "!");
        }
    }
}