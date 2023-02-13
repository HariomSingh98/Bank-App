import java.util.UUID;

public class UnionAccount implements Bank  {
    private String accountHolderName;
    private String accountID;
    private int balance;

    private String password;
    private Double rateOfInterest;

    public UnionAccount(String accountHolderName, int balance, String password) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.password = password;
        this.rateOfInterest= 9.8;

        this.accountID = String.valueOf(UUID.randomUUID());
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(Double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance +=amount;
        String out =  "Your Account is Credited with"+" "+ amount;
        return out;
    }

    @Override
    public String withdraw(int amount, String enteredPassword) {
        if(amount<0 || !enteredPassword.equals(this.password)){
           return  "Please enter correct details";
        }
        if(amount>balance)return "Insufficient Balance";
        balance -=amount;
        String out = "Your Account is Debited with"+" "+ amount;
        return out;

    }

    @Override
    public double calculateInterest(int time) {
        return (balance*rateOfInterest*time)/100.0;
    }
}
