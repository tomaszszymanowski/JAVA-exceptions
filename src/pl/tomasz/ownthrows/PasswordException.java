package pl.tomasz.ownthrows;

public class PasswordException extends Exception{
    public PasswordException() {
        super("Password incorrect.");
    }
}
