package pl.tomasz.throwsExample;

import pl.tomasz.ownthrows.EmailException;
import pl.tomasz.ownthrows.PasswordException;
import pl.tomasz.ownthrows.PeselException;

public class MyExceptionMain {
    public static void main(String[] args) {

        String pass1 = "abc";
        String pass2 = "abc";
        String pesel = "a1234567891";

        try {
            Utils.isValidPassword(pass1,pass2);
            Utils.isValidEmail("tomaszSzymanowski@gmail.com");
            Utils.isValidPesel(pesel);


        } catch (PasswordException | EmailException | PeselException e) {
            System.out.println(e.getMessage());
        }
    }
}
