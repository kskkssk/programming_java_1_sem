import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Hello command demonstration:");
        helloCommand();
        //System.out.println("Updated hello command demonstration:");
        //helloSomeoneCommand();
        //System.out.println("Repeat command demonstration");
        //repeatCommand();
    }

    public static void helloCommand() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a command: ");
            String cmd = scanner.nextLine();
            String command = cmd.toLowerCase(Locale.ROOT).trim();
            if (command.equals("hello")) {
                System.out.println("Hello World!");
            } else System.err.println("Unknown command.");
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println("Incorrect enter.");
        }
    }

    public static void helloSomeoneCommand() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an argument: ");
            String arg = scanner.nextLine();
            String argument = arg.trim();
            System.out.println("Hello " + argument + "!");
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println("Incorrect enter.");
        }
    }

    public static void repeatCommand() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an argument: ");
            String arg = scanner.nextLine();
            String argument = arg.trim();
            System.out.print("Enter a number of repeats (this value must be a whole number & be greater than 0): ");
            int number = scanner.nextInt();
            if (number <= 0) throw new NoSuchElementException();
            for (int counter = 0; counter < number; counter++) {
                System.out.println(argument);
            }
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println("Incorrect enter.");
        }
    }

}
