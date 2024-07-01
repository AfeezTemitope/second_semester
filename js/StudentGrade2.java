import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class StudentGrade2 {
    public static void main(String... a){
        Scanner input = new Scanner(System.in);
        List<List<Integer>> studentScores = new ArrayList<>();

        System.out.print(" How many students do you have?  ");
        int studentNumber = input.nextInt();

        System.out.print(" How many subjects do they offer?  ");
        int numberOfSubject = input.nextInt();
        printPrompt();

        for (int i = 0; i < studentNumber; i++) {
            List<Integer> subjectScores = new ArrayList<>();
            for (int j = 0; j < numberOfSubject; j++) {
                System.out.println("Entering score for student " + (i + 1) + ": ");
                System.out.print("Enter score for subject " + (j + 1) + " for student " + (i + 1) + ": ");
                int subjectScore = input.nextInt();
                subjectScores.add(subjectScore);
            }
            studentScores.add(subjectScores);
            printPrompt();
        }

        printHeader();
        for (int i = 0; i < studentNumber; i++) {
            System.out.print("STUDENT " + (i + 1) + "\t");
            for (int j = 0; j < numberOfSubject; j++) {
                System.out.print(studentScores.get(i).get(j) + "\t");
            }
            System.out.println();
        }
    }

    public static void printPrompt() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");
    }

    public static void printHeader(){
        String Header = """
        ========================================================
        STUDENT    SUB1    SUB2    SUB3    TOT    AVE    POS
        ======================================================== """;
        System.out.println(Header);
    }
}
