package pl.tomasz.throwsExample;

import java.util.Scanner;

public class ThrowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Podaj numer miesiąca: ");
            int getNumberFromUser = scanner.nextInt();

            try {
                System.out.println(Utils.monthNameByNumber(getNumberFromUser));
            }catch (IllegalArgumentException e){
                System.out.println("Month not found");
            }
        }while (true);
    }
}
