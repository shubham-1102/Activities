package exceptionhandling;

public class TaxNotEligibleException extends Exception {
	public TaxNotEligibleException (String message)
	   {
		   super(message);
	   }
}
