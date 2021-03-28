package pl.tomasz.throwsExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{
            System.out.print("number 1: ");
            int num1 = Math.getMyNumber();

            System.out.print("number 2: ");
            int num2 = Math.getMyNumber();

            int result = Math.div(num1, num2);
            System.out.println(num1 + "/" + num2 + "=" + result);


        }catch (InputMismatchException e) {
            System.out.println("bad type of input");
        }catch (ArithmeticException e){
            System.out.println("not divided by 0");
        }
    }
}
