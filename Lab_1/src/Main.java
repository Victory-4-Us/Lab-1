//lab 1
//This program allows the user to submit a string containing whatever they'd like.
//The program will return the same input except any letters are replaced with numbers.
//This is the main class for the program. 
//It extends the LetterCycle class.
import java.util.Scanner;
public class Main extends LetterCycle {
    public static void main(String[] args) throws Exception {

        //creates a scanner
        Scanner scan = new Scanner(System.in);

        //asks for input
        System.out.print("Please enter a string: ");
        //takes the input
        String input = scan.nextLine();
        System.out.println("You entered \"" + input + "\"");
        //sends the input to the LetterCycle class
        System.out.println("that translates to: " + translate(input));

        //closes scanner
        scan.close();
    }
}
