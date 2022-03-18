import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        //System.out.println("Task 3.1 demonstration:");
        //printFileContent();
        //System.out.println("Task 3.1 demonstration:");
        //printFileWithNumbers();
        System.out.println("Task 3.1 demonstration:");
        printLongestLine();
    }

    public static void printFileContent() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter full filepath: ");
            String filepath = scanner.nextLine();
            File file = new File(filepath);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) System.out.println(line);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File not found.");
        } catch (IOException ioException) {
            System.err.println("File reading error.");
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println("Incorrect enter.");
        }
    }

    public static void printFileWithNumbers() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter full filepath: ");
            String filepath = scanner.nextLine();
            File file = new File(filepath);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            int counter = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println(counter + ") " + line);
                counter += 1;
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File not found.");
        } catch (IOException ioException) {
            System.err.println("File reading error.");
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println("Incorrect enter.");
        }
    }

    public static void printLongestLine() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter full filepath: ");
            String filepath = scanner.nextLine();
            File file = new File(filepath);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            String longestString = null;
            int maxLength = -1;
            while ((line = reader.readLine()) != null) {
                if (line.trim().length() > maxLength) {
                    longestString = line.trim();
                    maxLength = longestString.length();
                }
            }
            System.out.println("Longest line in file: " + longestString);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File not found.");
        } catch (IOException ioException) {
            System.err.println("File reading error.");
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println("Incorrect enter.");
        }
    }

}
