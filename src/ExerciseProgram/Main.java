package ExerciseProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Scanner strSC=new Scanner(System.in);

        System.out.println("Welcome to İdman Programme");
        String idmans="Valid transactions\n"
                +"1- Burpee\n"+
                "2- Pushup\n"+
                "3- Situp\n"+
                "4- Squat\n";
        System.out.println(idmans);

        System.out.println("create a workout");

        System.out.print("Burpee number: ");
        int burpeeNumber=sc.nextInt();
        System.out.println();
        System.out.print("Pushup number: ");
        int pushupNumber=sc.nextInt();
        System.out.println();
        System.out.print("Situp number: ");
        int situpNumber=sc.nextInt();
        System.out.println();
        System.out.print("Squat number: ");
        int squatNumber=sc.nextInt();
        System.out.println();

        idman idman=new idman(burpeeNumber,pushupNumber,situpNumber,squatNumber);

        System.out.println("Starting idman");

        while (idman.idmanFinish()==false){
            System.out.println("type of movement: ");
            String movementType=strSC.nextLine();
            System.out.println("How many of these moves are you going to do?");
            int movementNumber=sc.nextInt();
            idman.makeAmove(movementType,movementNumber);
        }

    }
}
