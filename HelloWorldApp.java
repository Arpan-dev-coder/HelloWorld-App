
public class HelloWorldApp {

    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {

            System.out.println("Hello, World!");

        } else {

            String names = "";

            // Build names string with delimiter
            for (String name : args) {
                names += name + ", ";
            }

            // Remove trailing ", " using substring
            names = names.substring(0, names.length() - 2);

            System.out.println("Hello, " + names + "!");
        }
    }
}