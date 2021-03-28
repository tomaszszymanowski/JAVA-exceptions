import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            int result = a / b;
            result += 10;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Nie można dzielić przez zero");
        }
        //nieoznaczony


        try {
            // oznaczony
            FileInputStream fileInputStream = new FileInputStream("/to/jest/sciezka/read.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Taki plik nie istnieje");
        }


        Scanner scanner = new Scanner(System.in);
        try {


            System.out.print("Insert number 1: ");
            a = scanner.nextInt();
            System.out.print("Insert number 1: ");
            b = scanner.nextInt();
            scanner.nextLine();

            System.out.println(a / b);
            System.out.print("Insert path to file: ");
            String path = scanner.nextLine();
            FileInputStream fileInputStream = new FileInputStream(path);
        }catch (FileNotFoundException e){
            System.out.println("Not exist.");
        }catch (ArithmeticException e){
            System.out.println("Not divided by 0");
        }

    }
}
