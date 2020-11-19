import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        /* Scanners let you enter input. To make a scanner,
        you need to write: 
            Scanner <scanner-name> = new Scanner(System.in);
        And add the import statement up top.
        To get a line of input as a String, you would write:
            <scanner-name>.nextLine();
        There are also many other types on input you can get through
        different methods, such as nextInt()
        I made the conversation happen through a method, but you don't
        have to do that.
        You should always close scanner at the end!
        */
        Scanner input = new Scanner(System.in); // Initialize Scanner
        conversation(input); // Generate conversation
        input.close(); // Close scanner
    }

    // This method makes the conversation happen. Notice that I need to take a Scanner
    // as a parameter, but I could name it console instead of input and it works the same
    public static void conversation(Scanner console) {
        System.out.println("You've reached the top of your conversation with World."); // Introductory print
        String text = console.nextLine(); // Gets input
        System.out.println(text); // Prints out input
        System.out.println("You have been blocked by user \"World\":("); // Ending print
    }
}