package exceptionhandling;

public class CountryNotValidException extends Exception	 {
	public CountryNotValidException(String message) {
		super(message);
	}
}
