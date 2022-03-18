import java.io.*;
import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Task 1.1 demonstration:");
        reverse();
        //System.out.println("Task 1.2 demonstration:");
        //arrayDequeSort();
        //System.out.println("Task 1.3 demonstration:");
        //reverseOrder();
    }

    public static void reverse() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter full filepath: ");
            String filepath = scanner.nextLine();
            File file = new File(filepath);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            FileWriter writer = new FileWriter("./out.txt", false);
            String line;
            Stack stack = new Stack();
            while (!(line = reader.readLine()).equals("0")) {
                stack.push(Integer.valueOf(line));
            }
            System.out.println("Reversed file content has been successfully written to file out.txt (on parent directory).");
            while (!stack.empty()) {
                Integer num = (Integer) stack.pop();
                System.out.println(num);
                writer.write(num.toString());
                writer.append("\n");
            }
            writer.flush();
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File not found.");
        } catch (IOException ioException) {
            System.err.println("File working error.");
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println("Incorrect enter.");
        }
    }

    public static void arrayDequeSort() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter full filepath: ");
            String filepath = scanner.nextLine();
            File file = new File(filepath);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            int counter = 0;
            int amount = Integer.valueOf(reader.readLine());
            ArrayDeque arrayDeque = new ArrayDeque<>();
            while (counter < amount) {
                arrayDeque.add(Integer.valueOf(reader.readLine()));
                counter += 1;
            }
            Integer[] array = (Integer[]) arrayDeque.toArray(new Integer[0]);
            Arrays.sort(array);
            System.out.println("Sorted file content:");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File not found.");
        } catch (IOException ioException) {
            System.err.println("File reading error.");
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println("Incorrect enter.");
        }
    }

    public static void reverseOrder() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter full filepath: ");
            String filepath = scanner.nextLine();
            File file = new File(filepath);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            LinkedList linkedList = new LinkedList();
            while (!(line = reader.readLine()).equals("0")) {
                linkedList.add(Integer.valueOf(line));
            }
            System.out.println("Reversed file content:");
            Collections.reverse(linkedList);
            System.out.println(linkedList);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File not found.");
        } catch (IOException ioException) {
            System.err.println("File reading error.");
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println("Incorrect enter.");
        }
    }

}
