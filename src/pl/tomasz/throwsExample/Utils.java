package pl.tomasz.throwsExample;

import pl.tomasz.ownthrows.EmailException;
import pl.tomasz.ownthrows.PasswordException;
import pl.tomasz.ownthrows.PeselException;

public final class Utils {

    public static String monthNameByNumber(int number) throws IllegalArgumentException {
        switch (number) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                throw new IllegalArgumentException();

        }
    }

    public static boolean isValidPassword(String pass1, String pass2) throws PasswordException{
        if(pass1.equals(pass2)){
            return true;
        }else {
            throw new PasswordException();
        }
    }

    public static boolean isValidEmail(String email) throws EmailException{
        if(email.length() > 10){
            return true;
        }else {
            throw new EmailException();
        }

    }

    public static boolean isValidPesel(String pesel) throws PeselException{
        boolean onlyDigits = true;
        for(int i = 0; i < pesel.length(); i++){
            if(pesel.charAt(i)>47 && pesel.charAt(i) < 58)
                onlyDigits = false;
        }

        if (pesel.length() == 11 && onlyDigits == true){
            return true;
        } else {
            throw new PeselException();
        }

    }
}
