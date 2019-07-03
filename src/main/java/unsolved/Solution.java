package unsolved;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static final String TEXT =  "I am a {0} account with {1,number,#} units of {2} currency";

    public static void main(String args[] ) throws Exception {

        List<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new SavingsAccount("USD",3));//Savings
        accounts.add(new SavingsAccount("EUR",2));//Savings
        accounts.add(new CheckingAccount("HUF",100));//Checking
        accounts.add(new CheckingAccount("COP",10000));//Checking
        accounts.add(new BrokerageAccount("GBP",2));//Brokerage
        accounts.add(new BrokerageAccount("INR",600));//Brokerage

        accounts.stream().forEach(
                account -> System.out.println(
                        MessageFormat.format(TEXT,
                                new Object[]{
                                        account.getAccountType().getName(),//make this work
                                        account.getUnits(),//make this work
                                        account.getCurrency()//make this work
                                })));
    }
}
class AccountType{
    private String name = this.getClass().getName().replace("Account",""); ;

    public AccountType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class BankAccount{

 private AccountType accountType = new AccountType(this.getClass().getName().replace("Account",""));



    public AccountType getAccountType() {
        return accountType;
    }


    private String currency;
    private long units;



    public String getCurrency() {
        return currency;
    }

    public BankAccount(String currency, long units) {
        this.currency = currency;
        this.units = units;

    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getUnits() {
        return units;
    }

    public void setUnits(long units) {
        this.units = units;
    }

}

class SavingsAccount extends BankAccount
{
    public SavingsAccount(String curr, long amount) {
        super(curr, amount);
    }
}

class CheckingAccount extends BankAccount
{
    public CheckingAccount(String curr, long amount) {
        super(curr, amount);
    }
}

class BrokerageAccount extends BankAccount
{
    public BrokerageAccount(String curr, long amount) {
        super(curr, amount);
    }
}