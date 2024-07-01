public enum AccountType {
    SAVINGS(6),
    CURRENT(1),
    FIXED(13);

    private int interestRate;
    AccountType(int interestRatee) {
      this.interestRate = interestRatee;
    }
    public void setInterestRate(int interestRates) {
        interestRate = interestRates;
    }
}
