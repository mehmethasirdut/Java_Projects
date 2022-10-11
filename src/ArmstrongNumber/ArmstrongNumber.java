package ArmstrongNumber;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

// 0, 1, 153, 370, 371 and 407 are an Armstrong number list or all examples of Armstrong numbers. Let us check why?
//
// For 0, the operation is 0^1=0
//
// For 1, the operation is 1^1=1
//
// For 153, the operation is 1^3 5^3 3^3=153
//
// For 370 the operation is 3^3 7^3 0^3=370
//
// For 371 the operation is 3^3 7^3 1^3=371
//
// For 407 the operation is 4^3 0^3 7^3=407

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=sc.nextInt();

        // ********************number of digits
        int numberOfDigits=0;
        int fixed =1;
        int total=0;

        do {
            numberOfDigits++;
            int value=(number/fixed)%10;
            total+=fixed*value;
            fixed*=10;
        }while(total!=number);
      //  System.out.println("number of digits: "+numberOfDigits);


        // *************** number of Armstrong?
        total=0;
        fixed=1;
        int countNumberOfDigits=numberOfDigits;
        do {
            int prod=1;
            int stepValue=(number/fixed)%10;
            for (int i=0;i<countNumberOfDigits;i++){
                prod*=stepValue;
            }
            total+=prod;
            fixed*=10;
            numberOfDigits--;
        }while(0<numberOfDigits);

        System.out.println(total==number ? "Armstrong number" : "not Armstrong number");

    }
}
