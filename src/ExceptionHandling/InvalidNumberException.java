package ExceptionHandling;

public class InvalidNumberException extends RuntimeException {
    public InvalidNumberException(String pleaseEnterValidNumber) {
        System.out.println("Please enter valid number");
    }
}
