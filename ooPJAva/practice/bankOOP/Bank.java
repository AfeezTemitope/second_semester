import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
 public class Bank{
   private static ArrayList<Account>accounts = new ArrayList<>();
	public static void main(String...a) throws Account.InvalidPinLength{
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	

        while(true) {
            displayMenu();
            System.out.println("choose any banking option:. ");
            int menuOption = scanner.nextInt();scanner.nextLine();
            
switch(menuOption){
case 1:
	System.out.print("Enter your first name: "); String firstname = scanner.nextLine();
        System.out.print("Enter your last name: "); String lastname = scanner.nextLine();
        try{
        System.out.print("Enter your pin: "); String pin = scanner.nextLine();
        if(pin.length() != 4){
        throw new Account.InvalidPinLength("PIN must be exactly 4 digits long.");
        }
        int accountNumber = random.nextInt(900) + 100;
        Account newAccount = new Account(firstname, lastname, pin, accountNumber, 0); 
        accounts.add(newAccount);
        System.out.println("Account created successfully. And your account number is: "+ accountNumber);
        } catch(Account.InvalidPinLength e) { 
        System.out.println(e.getMessage());
        }
                    break;
                
case 2:
        System.out.print("Enter your account number: "); int accountNumber = scanner.nextInt();
        System.out.print("Enter your pin: "); String pin = scanner.next();
        try{
        Account account = getAccount(accountNumber, pin);
        closeAccount(account); 
        System.out.println("Account closed successfully ");
        } catch(Account.InvalidAccountNumber | Account.InvalidPin e) {
        System.out.println(e.getMessage());
        }
                    break;
case 3:
	System.out.print("Enter your account number: "); accountNumber = scanner.nextInt();
	System.out.print("Enter your pin: ");  pin = scanner.next();
	System.out.print("Enter deposit amount: "); double amount = scanner.nextDouble();
	try{
	Account account = getAccount(accountNumber, pin);
	account.deposit(amount);
	}catch(Account.InvalidAccountNumber | Account.InvalidPin | Account.InsufficientFunds e){
	System.out.println(e.getMessage());
	}
		break;                
case 4:
	System.out.print("Enter your account number: "); accountNumber = scanner.nextInt();
	System.out.print("Enter your pin: ");  pin = scanner.next();
	System.out.print("Enter amount you want to withdraw: "); amount = scanner.nextDouble();
	try{
	Account account = getAccount(accountNumber, pin);
	account.withdraw(amount);
	}catch(Account.InvalidAccountNumber | Account.InvalidPin | Account.InsufficientFunds e){
	System.out.println(e.getMessage());
	}
		break;
case 5:
        System.out.print("Enter your account number: "); accountNumber = scanner.nextInt();
        System.out.print("Enter your pin: "); pin = scanner.next();
        try{
        Account account = getAccount(accountNumber, pin);
        System.out.println("Your balance is: " + account.getBalance());
        } catch(Account.InvalidAccountNumber | Account.InvalidPin e){
        System.out.println(e.getMessage());
	}
                break;
case 6:
       System.out.print("Enter your account number: "); accountNumber = scanner.nextInt();
       System.out.print("Enter your pin: "); pin = scanner.next();
       System.out.print("Enter reciever account number: "); int targetAccountNumber = scanner.nextInt();
       System.out.print("Enter reciever pin: "); String targetPin = scanner.next();
System.out.print("Enter transfer amount: "); amount = scanner.nextDouble();
       try{
       Account account = getAccount(accountNumber, pin);
       Account targetAccount = getAccount(targetAccountNumber, targetPin);
       account.transfer(targetAccount, amount);
       } catch(Account.InvalidAccountNumber | Account.InvalidPin| Account.InsufficientFunds e){
       System.out.println(e.getMessage());
       }
       		break;
case 7:
       System.out.print("Enter your account number: "); accountNumber = scanner.nextInt();
       System.out.print("Enter your old pin: "); String oldPin = scanner.next();
       System.out.print("Enter your new pin: "); String newPin = scanner.next();
       try{
       Account account = getAccount(accountNumber, oldPin);
       account.validatePin(newPin);
       account.setPin(newPin);
       System.out.println("Pin changed successfully.");
       } catch(Account.InvalidAccountNumber | Account.InvalidPin e){
       System.out.println(e.getMessage());
       }
                break;
case 8:
	System.out.print("Enter your account number: ");  accountNumber = scanner.nextInt();
	System.out.print("Enter your pin: ");  pin = scanner.next();
	showAccountDetails(accountNumber, pin);
		break;

	
default: 
                    System.out.print("invalid input exiting now!!!");
                    return;
            }
        }
    }
	public static void displayMenu() {
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
8>. VIEW MY INFORMATION            
============================ 
        """;
        System.out.println(bankMenu);
    }
	public static Account getAccount(int accountNumber, String pin)throws Account.InvalidAccountNumber, Account.InvalidPin{
	for(Account account: accounts){
	if(account.getAccountNumber() == accountNumber){
	if(account.validatePin(pin)){
		return account;
	}else{
		throw new Account.InvalidPin("Invalid pin");
	}
	}
	}
		throw new Account.InvalidAccountNumber("Invalid account number");
	}
	public static void closeAccount(Account account){
		accounts.remove(account);
	}
	public static void showAccountDetails(int accountNumber, String pin) {
	try {
        Account account = getAccount(accountNumber, pin);
        System.out.println("Account Details:");
        System.out.println("First Name: " + account.getFirstname());
        System.out.println("Last Name: " + account.getLastname());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
	} catch(Account.InvalidAccountNumber | Account.InvalidPin e) {
        System.out.println(e.getMessage());
    }
}



}
