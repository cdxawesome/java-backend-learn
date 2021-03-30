package java进阶.demo03CustomException;

public class RegisterException extends Exception
{
    public RegisterException()
    {
        super();
    }

    public RegisterException(String message)
    {
        super(message);
    }
}
