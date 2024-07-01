import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.InputMismatchException;

public class BankeBankAtmMachine {
    public static void main(String...a) {
        while(true) {
            printOptions();
            switch(chooseOption()) {
        case 1:
            accountCreations();
            break;
        case 2:
            closeAccount();
             break;
		case 3:
		    depositFunds();
		    break;
		case 4:
            withdrawFunds();
            break;
        case 5:
            checkBalance();
            break;
        case 6:
		    transferFunds();
		    break;
        case 7:
            changePin();
            break;
                default:
                    return;
            }
        }
    }

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> users = new ArrayList<>();
    static Random random = new Random();

    public static void printOptions() {
        String bankMenu = """
        ============================
          ||||BANKE BANK MENU||||            
        ============================
        >1. CREATE ACCOUNT         
        first name, last name, pin 
        >2. CLOSE ACCOUNT          
	    >3. DEPOSIT             
	    >4. WITHDRAW           
        >5. CHECK BALANCE          
        >6. TRANSFER FUND          
        >7. CHANGE PIN             
        ============================
        """;
        System.out.println(bankMenu);
    }

    public static int chooseOption() {    
        System.out.print("Choose an option between (1-7): ");
        int options = scanner.nextInt();
        scanner.nextLine();
        return options;
    }

    public static void accountCreations() {
        System.out.print("Enter firstName: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter lastName: ");
        String lastName = scanner.nextLine();

        while(true) {
            System.out.print("Choose your personal 4-digit code: ");
            String pin = scanner.nextLine();
            if(pin.length() != 4) {
                System.out.println("Invalid pin, please enter a valid 4-digit code");
            } else {
                System.out.println("Pin successfully created");

                int accountNumber = random.nextInt(1000,9999);
                users.add(firstName + " " + lastName + "\nYour pin: " + pin + "\nYour account number is: " + accountNumber + "\nBalance: 0");
                System.out.println("Your details: " + users);
                return;
            }
        }
    }

    public static void closeAccount() {
        System.out.print("Enter the account number of the account to close: ");
        int accountNumberToClose = 0;
        try {
            accountNumberToClose = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine(); 
            return;
        }

        for (int index = 0; index < users.size(); index++) {
            String userInfo = users.get(index);
            int accountNumber = Integer.parseInt(userInfo.split("\n")[2].split(": ")[1]);

            if (accountNumber == accountNumberToClose) {
                users.remove(index);
                System.out.println("Account closed successfully.");
                return;
            }
        }
        System.out.println("Account not found");
    }

    public static void transferFunds() {
	try {
        System.out.print("Enter your account number: ");
        int senderAccountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your pin: ");
        String senderPin = scanner.nextLine();

        System.out.print("Enter the recipient's account number: ");
        int recipientAccountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the amount to transfer: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        String senderInfo = null;
        String recipientInfo = null;

        for (String userInfo : users) {
            String[] userInfoParts = userInfo.split("\n");
            int accountNumber = Integer.parseInt(userInfoParts[2].split(": ")[1].trim());
            String pin = userInfoParts[1].split(": ")[1].trim();

            if (accountNumber == senderAccountNumber && pin.equals(senderPin)) {
                senderInfo = userInfo;
            } else if (accountNumber == recipientAccountNumber) {
                recipientInfo = userInfo;
            }
        }

        if (senderInfo == null) {
            System.out.println("Invalid account number or pin.");
            return;
        }

        if (recipientInfo == null) {
            System.out.println("Invalid recipient account number.");
            return;
        }

        double senderBalance = Double.parseDouble(senderInfo.split("\n")[3].split(": ")[1]);
        double recipientBalance = Double.parseDouble(recipientInfo.split("\n")[3].split(": ")[1]);

        if (senderBalance < amount) {
            System.out.println("Insufficient funds.");
            return;
        }

        senderBalance -= amount;
        recipientBalance += amount;

        senderInfo = senderInfo.split("\n")[0] + "\n" + senderInfo.split("\n")[1] + "\n" + senderInfo.split("\n")[2] + "\nBalance: " + senderBalance;
        recipientInfo = recipientInfo.split("\n")[0] + "\n" + recipientInfo.split("\n")[1] + "\n" + recipientInfo.split("\n")[2] + "\nBalance: " + recipientBalance;

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).split("\n")[2].split(": ")[1].equals(String.valueOf(senderAccountNumber))) {
                users.set(i, senderInfo);
            } else if (users.get(i).split("\n")[2].split(": ")[1].equals(String.valueOf(recipientAccountNumber))) {
                users.set(i, recipientInfo);
            }
        }

        System.out.println("Transfer successful.");
	} catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter the correct type of value.");
        scanner.nextLine(); 
    }
}

public static void depositFunds() {
    try {
        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your pin: ");
        String pin = scanner.nextLine();

        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        String userInfo = null;
        for (String user : users) {
            String[] userInfoParts = user.split("\n");
            int userAccountNumber = Integer.parseInt(userInfoParts[2].split(": ")[1].trim());
            String userPin = userInfoParts[1].split(": ")[1].trim();
            if (userAccountNumber == accountNumber && userPin.equals(pin)) {
                userInfo = user;
                break;
            }
        }
        if (userInfo == null) {
            System.out.println("Invalid account number or pin.");
            return;
        }
        double balance = Double.parseDouble(userInfo.split("\n")[3].split(": ")[1]);
        balance += amount;
        userInfo = userInfo.split("\n")[0] + "\n" + userInfo.split("\n")[1] + "\n" + userInfo.split("\n")[2] + "\nBalance: " + balance;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).split("\n")[2].split(": ")[1].equals(String.valueOf(accountNumber))) {
                users.set(i, userInfo);
            }
        }
        System.out.println("Deposit successful. Your new balance is: " + balance);
	} catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter the correct type of value.");
        scanner.nextLine(); 
    }
}
public static void withdrawFunds() {
    try {
        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your pin: ");
        String pin = scanner.nextLine();

        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        String userInfo = null;
        for (String user : users) {
            String[] userInfoParts = user.split("\n");
            int userAccountNumber = Integer.parseInt(userInfoParts[2].split(": ")[1].trim());
            String userPin = userInfoParts[1].split(": ")[1].trim();
            if (userAccountNumber == accountNumber && userPin.equals(pin)) {
                userInfo = user;
                break;
            }
        }
        if (userInfo == null) {
            System.out.println("Invalid account number or pin.");
            return;
        }
        double balance = Double.parseDouble(userInfo.split("\n")[3].split(": ")[1]);
        if (balance < amount) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
        userInfo = userInfo.split("\n")[0] + "\n" + userInfo.split("\n")[1] + "\n" + userInfo.split("\n")[2] + "\nBalance: " + balance;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).split("\n")[2].split(": ")[1].equals(String.valueOf(accountNumber))) {
                users.set(i, userInfo);
            }
        }
        System.out.println("Withdrawal successful. Your new balance is: " + balance);
    } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter the correct type of value.");
        scanner.nextLine(); 
    }
}
public static void checkBalance() {
    try {
        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your pin: ");
        String pin = scanner.nextLine();

        String userInfo = null;
        for (String user : users) {
            String[] userInfoParts = user.split("\n");
            int userAccountNumber = Integer.parseInt(userInfoParts[2].split(": ")[1].trim());
            String userPin = userInfoParts[1].split(": ")[1].trim();
            if (userAccountNumber == accountNumber && userPin.equals(pin)) {
                userInfo = user;
                break;
            }
        }
        if (userInfo == null) {
            System.out.println("Invalid account number or pin.");
            return;
        }
        double balance = Double.parseDouble(userInfo.split("\n")[3].split(": ")[1]);
        System.out.println("Your current balance is: " + balance);
    } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter the correct type of value.");
        scanner.nextLine(); 
    }
}
public static void changePin() {
    try {
        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your current pin: ");
        String currentPin = scanner.nextLine();

        String userInfo = null;
        for (String user : users) {
            String[] userInfoParts = user.split("\n");
            int userAccountNumber = Integer.parseInt(userInfoParts[2].split(": ")[1].trim());
            String userPin = userInfoParts[1].split(": ")[1].trim();
            if (userAccountNumber == accountNumber && userPin.equals(currentPin)) {
                userInfo = user;
                break;
            }
        }
        if (userInfo == null) {
            System.out.println("Invalid account number or pin.");
            return;
        }

        while(true) {
            System.out.print("Enter your new 4-digit pin: ");
            String newPin = scanner.nextLine();
            if(newPin.length() != 4) {
                System.out.println("Invalid pin, please enter a valid 4-digit code");
            } else {
                System.out.println("Pin successfully changed");
                userInfo = userInfo.split("\n")[0] + "\nYour pin: " + newPin + "\n" + userInfo.split("\n")[2] + "\n" + userInfo.split("\n")[3];
                for (int i = 0; i < users.size(); i++) {
                    if (users.get(i).split("\n")[2].split(": ")[1].equals(String.valueOf(accountNumber))) {
                        users.set(i, userInfo);
                    }
                }
                return;
            }
        }
    } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter the correct type of value.");
        scanner.nextLine(); 
    }
}



}