
import java.util.UUID;

public class SBIAccount implements Bank{
    private String accountHolderName;
    private String accountID;
    private int balance;

    private String password;
    private Double rateOfInterest;

    public SBIAccount(String accountHolderName, int balance, String password) {//constructor
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.password = password;

        this.rateOfInterest = 8.0;

        this.accountID = String.valueOf(UUID.randomUUID());//generate universal unique identifier
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

        return "bhut badiya";
    }

    @Override
    public String withdraw(int amount,String enteredPassword) {
        if(enteredPassword.equals(this.password)) {
            if (amount > balance) return "nhi he paise";
            balance -= amount;
            return "nhi";
        }
        return "aapka aacount nhi hai";
    }

    @Override
    public double calculateInterest(int time) {
        return (balance*rateOfInterest*time)/100.0 ;
    }
}
