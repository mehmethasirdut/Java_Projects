package AutomaticTellerMachine_OOP;

public class main {
    public static void main(String[] args) {

        Account account=new Account("John","12345",2000);

        ATM atm=new ATM();
        atm.run(account);
        System.out.println("please take your card...");
    }
}
