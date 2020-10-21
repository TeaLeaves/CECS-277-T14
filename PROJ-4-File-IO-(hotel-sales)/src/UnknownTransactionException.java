/**
 * @author Matthew Chen, Ryan Ignasiak, Tina Vu
 * Due Date: 10/20/20
 * Professor Mimi Opkins
 * Custom exception for handling unknown transactions exceptions
 */
public class UnknownTransactionException extends Exception
{

    public UnknownTransactionException()
    {
    }

    public UnknownTransactionException(String message)
    {
        super(message);
    }
}