package AutomaticTellerMachine_OOP;

import java.util.Scanner;

public class Login {
    public boolean login(Account account){
        Scanner sc=new Scanner(System.in);
        String client_name;
        String account_password;

        System.out.println("Client name: ");
        client_name=sc.nextLine();

        System.out.println("Account password: ");
        account_password=sc.nextLine();

        if (client_name.equals(account.getClient_name())&&
                account_password.equals(account.getAccount_password()))
            return true;
        else return false;
    }
}
