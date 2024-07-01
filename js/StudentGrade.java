import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many students do you have? ");
        int studentNumber = input.nextInt();

        System.out.print("How many subjects do they offer? ");
        int numberOfSubjects = input.nextInt();

        int[][] subjectScores = new int[studentNumber][numberOfSubjects];
        double[] averages = new double[studentNumber];

        for (int i = 0; i < studentNumber; i++) {
            System.out.println("Entering scores for student " + (i + 1) + ":");
            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print("Enter score for subject " + (j + 1) + ": ");
                subjectScores[i][j] = input.nextInt();
            }
        }

        printHeader();
        printScores(studentNumber, numberOfSubjects, subjectScores, averages);
        printBase();
    }

    public static void printPrompt() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");
    }

    public static void printHeader() {
        System.out.print("==============================================================\n");
        System.out.print("STUDENT\t\t");
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("SUB" + i + "\t");
        }
        System.out.println("TOT\tAVE\tPOS");
        System.out.println("==============================================================");
    }

    public static void printBase() {
        String base = """
        ========================================================
        
        ======================================================== """;
        System.out.println(base);
    }

    public static void printScores(int studentNumber, int numberOfSubjects, int[][] scores, double[] averages) {
        for (int i = 0; i < studentNumber; i++) {
            int total = 0;
            System.out.print("Student " + (i + 1) + "\t");
            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print(scores[i][j] + "\t");
                total += scores[i][j];
            }
            double average = (double) total / numberOfSubjects;
            averages[i] = average;
            System.out.printf(total + "\t" + "%.2f" + "\t", average);
            printPositions(averages, i);
        }
    }

    public static void printPositions(double[] averages, int index) {
        double[] sortedAverages = Arrays.copyOf(averages, averages.length);
        Arrays.sort(sortedAverages);
        for (int i = 0; i < sortedAverages.length / 2; i++) {
            double temp = sortedAverages[i];
            sortedAverages[i] = sortedAverages[sortedAverages.length - i - 1];
            sortedAverages[sortedAverages.length - i - 1] = temp;
        }
        int position = Arrays.binarySearch(sortedAverages, averages[index]) + 1;
        System.out.println(position);
    }
}
