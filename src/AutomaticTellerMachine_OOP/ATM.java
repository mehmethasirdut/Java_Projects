package AutomaticTellerMachine_OOP;

import java.util.Scanner;

public class ATM {
    public void run(Account account){

        Login login=new Login();
        Scanner strSc=new Scanner(System.in);
        Scanner intSc=new Scanner(System.in);

        System.out.println("Welcome the Bank of UK");

        System.out.println("************");
        System.out.println("Account login");
        System.out.println("************");
        int rightOfEntry=3;
        while (true){
            if (login.login(account)){
                System.out.println("Entry success");
            break;}else
            {System.out.println("Entry failed");
                rightOfEntry--;
                System.out.println("Your Right of Entry: "+rightOfEntry);
            }

            if (rightOfEntry==0){
                System.out.println("Your login has expried");
                return;
            }
        }

        while (true){

            transactions();

            int trans=intSc.nextInt();

            if (trans==4)
                break;
            switch (trans){
                case 1:
                    System.out.println(account.getBalance())
                    ; break;
                case 2:
                    System.out.println("how much will you deposit");
                    int amount=intSc.nextInt();
                    account.depositMoney(amount);
                    break;
                case 3:
                    System.out.println("how much money do you want to withdraw");
                    amount =intSc.nextInt();
                    account.withDrawMoney(amount);
                    break;
                default:
                    System.out.println("press wrong entry");
                    break;
            }

        }
    }

    public void transactions(){

        System.out.println("************");
        String transactions="1- Balance View"+
                "\n2- Deposit"+"\n3- Withdraw money"
                +"\n4- Press 4 to exit";
        System.out.println(transactions);

    }
}
