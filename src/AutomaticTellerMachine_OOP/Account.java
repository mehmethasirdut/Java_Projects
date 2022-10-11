package AutomaticTellerMachine_OOP;

public class Account {
    private String client_name;
    private String account_password;
    private int balance;

    public Account(String client_name, String account_password, int balance) {
        setClient_name(client_name);
        setAccount_password(account_password);
        setBalance(balance);
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getAccount_password() {
        return account_password;
    }

    public void setAccount_password(String account_password) {
        this.account_password = account_password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void depositMoney(int money){
        balance+=money;
        System.out.println("new balance: "+balance);
    }

    public void withDrawMoney(int money){
        if (balance>=money){
        balance-=money;
        System.out.println("new balance: "+balance);
        }else{ System.out.println("Withdrawable amount not available on account");
            System.out.println("balance: "+balance);}
    }
}
