package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner intSc=new Scanner(System.in);   // To be used for Integer statements
        Scanner BoolSc=new Scanner(System.in);  // To be used for Boolean statements
        Boolean selection=true;

        System.out.println("********** Welcome to Calculator *************");

        while (true) {

            System.out.println("Please select a transaction");
            System.out.println("1- Addition"+
                    "\n2- Subtraction"+"\n3- Multiplication"+
                    "\n4- Division"+"\n5- Square Root"+
                    "\n6- Exponent");

            int intSellect=intSc.nextInt();
            switch (intSellect) {
                case 1:
                    System.out.print("first value: ");
                    int firstV = intSc.nextInt();
                    System.out.print("second value: ");
                    int secondV = intSc.nextInt();
                    System.out.println("Conclusion: " + Math.addExact(firstV, secondV));
                    break;
                case 2:
                    System.out.print("big value: ");
                    int bigV = intSc.nextInt();
                    System.out.print("small value: ");
                    int smallV = intSc.nextInt();
                    System.out.println("Conclusion: " + Math.subtractExact(bigV, smallV));
                    break;
                case 3:
                    System.out.print("first value: ");
                    firstV = intSc.nextInt();
                    System.out.print("second value: ");
                    secondV = intSc.nextInt();
                    System.out.println("Conclusion: " + Math.multiplyExact(firstV, secondV));
                    break;
                case 4:
                    System.out.print("first value: ");
                    firstV = intSc.nextInt();
                    System.out.print("second value: ");
                    secondV = intSc.nextInt();
                    System.out.println("Conclusion: " + Math.divideExact(firstV, secondV));
                    break;
                case 5:
                    System.out.print("Enter the square root value: ");
                    int value = intSc.nextInt();
                    System.out.println("Conclusion: " + Math.sqrt(value));
                    break;
                case 6:
                    System.out.print("Enter base value: ");
                    firstV = intSc.nextInt();
                    System.out.print("Enter exponent value: ");
                    secondV = intSc.nextInt();
                    System.out.println("Conclusion: " + Math.pow(firstV, secondV));
                    break;
                default:
            }

            System.out.println("Do you have any other action? true/false");
            selection=BoolSc.nextBoolean();
            if (selection==false)
                break;
        }
    }
}
