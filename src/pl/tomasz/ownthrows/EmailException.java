package pl.tomasz.ownthrows;

public class EmailException extends Exception{
    public EmailException() {
        super("Email incorrect.");
    }
}
