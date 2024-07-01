import java.util.Scanner;

public class Password{

	public static void main(String...args){
	Scanner badAfeez = new Scanner(System.in);

System.out.print("Enter username: ");
String userName = badAfeez.nextLine();

if (userName.length() > 10){
	System.out.print("Invalid Username !!! ");
} else {
	System.out.print("Enter password: ");
	String passWord = badAfeez.nextLine();

	System.out.print("Verify Password: ");
	String secondPassWord = badAfeez.nextLine();

	if (passWord.equals(secondPassWord) && passWord.length() > 6){
		System.out.print("Your Password is " + passWord + "\nYour user name is " + userName);
	} else {
		System.out.print("password mismatch ");
}
	}


	}
}