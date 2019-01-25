package exceptionTest;

public class ExceptionTest {
    public static void main(String[] args) {

        try {

            throw new Exception("dsfd");

        } catch (Exception e) {
            new MyException(e);
        }

    }
}

class MyException extends RuntimeException {

    public MyException(Throwable cause) {
        super(cause);
        System.out.println(cause);
    }

    public MyException(String errMsg) {
        super(errMsg);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
        System.out.println(message + cause);
    }
}
