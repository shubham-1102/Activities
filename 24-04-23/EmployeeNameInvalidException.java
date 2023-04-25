package exceptionhandling;

public class EmployeeNameInvalidException extends Exception {
	 public EmployeeNameInvalidException(String message)
     {
    	 super(message);
     }
}
