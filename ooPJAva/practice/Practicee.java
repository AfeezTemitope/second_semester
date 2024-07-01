import java.util.Scanner;

public class Practicee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String name = scanner.nextLine();
        char character = name.charAt(2);

        System.out.print(character);
    }
}

