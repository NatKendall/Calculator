
package kendallmlab2;

import java.util.Scanner;


public class KendallMLab2 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("This program will define and initialize two numbers.\n"
                + "The user will be asked to enter the two numbers.\n"
                + "The program will then do the calculations to show you\n "
                + "the sum, product, and difference of the two numbers.\n"
                + "It will also calculate the exponent value numberOne ^ numberTwo.\n"
                + "A sales price with tax rate of 6% will be calculated and displayed\n"
                + "Lastly, the program will demonstrate use of the increment and augmented operators.");

        System.out.println();
        int numberOne = 0, numberTwo = 0, numberThree = 0, numberFour = 0, sum = 0, difference = 0, product = 0;
        double quotient = 0, powerOf = 0, subTotal = 0, total = 0, tax = 0;
        final double TAX_RATE = .06;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        numberOne = in.nextInt();
        System.out.print("Enter another whole number: ");
        numberTwo = in.nextInt();
        System.out.println();
        sum = numberOne + numberTwo;
        difference = numberOne - numberTwo;
        product = numberOne * numberTwo;
        quotient = ((double) numberOne / (double) numberTwo);
        powerOf = Math.pow(numberOne, numberTwo);
        subTotal = numberOne + numberTwo + numberThree;
        total = subTotal + subTotal * TAX_RATE;

        System.out.println("The sum of " + numberOne + " + " + numberTwo
                + " = " + sum);
        System.out.println("The difference of " + numberOne + " - " + numberTwo
                + " = " + difference);
        System.out.println("The product of " + numberOne + " * " + numberTwo
                + " = " + product);
        System.out.println("The quotient of " + numberOne + " / " + numberTwo
                + " = " + quotient);
        System.out.println("The power of " + numberOne + " ^ " + numberTwo
                + " = " + powerOf);
        System.out.println();
        System.out.println("Sales data");
        System.out.println("The subtotal is " + subTotal);
        System.out.println("The total is " + total);
        System.out.println();
        System.out.println("Increment & decrement fun!");
        ++numberOne;
        numberTwo -= 3;
        numberThree = numberOne;
        numberFour = numberTwo;
        System.out.println("numberThree is numberOne increased by one: " + (double) numberThree);
        System.out.println("numberFour is numberTwo decreased by three: " + (double) numberFour);

    }

}
