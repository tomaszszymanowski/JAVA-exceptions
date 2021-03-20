import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            int result = a/b;
            result += 10;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("Nie można dzielić przez zero");
        }
        //nieoznaczony


        try{
            // oznaczony
            FileInputStream fileInputStream = new FileInputStream("/to/jest/sciezka/read.txt");
        }catch (FileNotFoundException e){
            System.out.println("Taki plik nie istnieje");
        }

    }

}
