import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FirstException {
    public static void main(String[] args) throws FileNotFoundException {
        int a = 5;
        int b = 0;

        //nieoznaczony
        int result = a/b;
        result += 10;
        System.out.println(result);

        // oznaczony
        FileInputStream fileInputStream = new FileInputStream("/to/jest/sciezka/read.txt");
    }



}
