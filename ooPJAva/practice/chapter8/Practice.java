import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter student score count "); int studentScore = scanner.nextInt();
        System.out.print("how many student "); int studentCount = scanner.nextInt();
        System.out.print("wach subject score "); int subjectScore = scanner.nextInt();
        int[][][] array = new int[studentScore][studentCount][subjectScore];
    

       for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            for (int k = 0; k < array[i][j].length; k++) {
                array[i][j][k] = scanner.nextInt();
            }
        }
    }

    for (int i = 0; i < array.length; i++) {
        int sum = 0;
        for (int j = 0; j < array[i].length; j++) {
            for (int k = 0; k < array[i][j].length; k++) {
                sum += array[i][j][k];
            }
        }
        System.out.println("Student " + (i + 1) + " sum: " + sum);
    }
}
}
