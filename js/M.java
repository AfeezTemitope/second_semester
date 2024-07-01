
import java.util.Scanner;

public class M {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("What is your name");
        String name = scanner.nextLine();
String[] questions = {
	"A. expend energy, enjoy groups         B. Conserve energy, enjoy one-on-one",
	"A. More outgoing, think out loud         B. More reserved, think to yourself",
	"A. Seek many tasks, Public activities, Interaction with Others         B. Seek private, Solitary activities with quiet to concentrate",
	"A. External, Communicate, Express yourself         B. Internal, Reticent, keep to yourself",
	"A. Active, Initiate         B. Reflective, Deliberate"
        };
	for (String question : questions) {
	System.out.println(question);
        char answer = scanner.next().charAt(0);

	if (answer == 'A' || answer == 'a') {
        	selectionA1++;
        } else if (answer == 'B' || answer == 'b') {
        	selectionB1++;
        } else {
        System.out.println("Error expected A or B as a response");
        }
        }

        System.out.println("Number of A selected is: " + selectionA1);
        System.out.println("Number of B selected is: " + selectionB1);


	}


}