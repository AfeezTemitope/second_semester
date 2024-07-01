public class Account{
    public static class InsufficientFunds extends Exception{
        public InsufficientFunds(String message){
            super(message);
        }
    }
    public static class InvalidPin extends Exception{
        public InvalidPin(String message){
            super(message);
        }
    }
    public static class InvalidAccountNumber extends Exception{
        public InvalidAccountNumber(String message){
            super(message);
        }
    }
    public static class InvalidPinLength extends Exception {
        public InvalidPinLength(String message) {
            super(message);
        }
    }

    private String firstname;
    private String lastname;
    private String pin;
    private int accountNumber;
    public double balance = 0;

    public Account(String firstname, String lastname, String pin, int accountNumber, double balance){
        this.firstname = firstname;
        this.lastname = lastname;
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public String getPin(){
        return pin;
    }
    public void setPin(String pin){
        this.pin = pin;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public  void deposit(double amount) throws InsufficientFunds{
        if(amount > 0){
            this.balance += amount;
            System.out.println("Deposit successful!!!. New balance: " + balance);
        } else {
            throw new InsufficientFunds("Invalid deposit amount. ");
        }
    }
    public  void withdraw(double amount)throws InsufficientFunds{
        if(amount > 0 && amount <= this.balance){
            this.balance -= amount;
            System.out.println("withdrawal successful. New balance: " + balance);
        }else{
            throw new InsufficientFunds("Invalid withdrawal amount. ");
        }
    }
	public  void transfer(Account targetAccount, double amount) throws InsufficientFunds {
    if(amount > 0 && amount <= this.balance){
        this.balance -= amount;
        targetAccount.balance += amount;
        System.out.println("Transfer successful. New balance: " + this.balance);
    }else{
        throw new InsufficientFunds("Invalid transfer amount. ");
    }
}
    public boolean validatePin(String pin) {
        return this.pin.equals(pin);
    }

}
