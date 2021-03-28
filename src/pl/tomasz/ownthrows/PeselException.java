package pl.tomasz.ownthrows;

public class PeselException extends Exception{
    public PeselException() {
        super("Pesel incorrect.");
    }
}
