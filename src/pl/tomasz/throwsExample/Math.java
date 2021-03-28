package pl.tomasz.throwsExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Math {


    public static int getMyNumber() throws InputMismatchException{
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
         return result;
    }

    public static int div(int a, int b) throws ArithmeticException {

        return a/b;
    }
        /*int result;
        try{
            result = a/b;
        }catch (ArithmeticException e){
            result = -1;
        }
        return result;*/

}
