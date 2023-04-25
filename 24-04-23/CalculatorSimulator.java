package exceptionhandling;
import java.util.*;


class TaxCalculator{
	static double calculateTax(String empName,boolean isIndian,double empsal) throws CountryNotValidException, EmployeeNameInvalidException,TaxNotEligibleException{
		
		double TaxAmount=0;
		if(isIndian==true) {
		     if(empName.equals("null")||empName.isEmpty()){
		    	 throw new EmployeeNameInvalidException("Exception...The employee name cannot be empty");   
		     }
		     else{
		    	if(empsal>100000)
		    		 return TaxAmount = (empsal*8)/100;
		    	else if(empsal>50000 && empsal<=100000)
		    		 return TaxAmount = (empsal*6)/100;
		    	else if(empsal>=30000 && empsal<=50000)
		    		 return TaxAmount = (empsal*5)/100;
		    	else if(empsal>=10000 && empsal<30000)
		    		  return TaxAmount = (empsal*4)/100;
		    	else
		    		throw new TaxNotEligibleException("Exception.......The employee does not need to pay tax");
		     }
		}
		else {
			throw new CountryNotValidException("Exception.......The employee should be an Indian citizen for calculating tax");
		}
		
	}
}
public class CalculatorSimulator {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			TaxCalculator tc = new TaxCalculator();
           System.out.println("If you are Indian enter True else False");
           boolean flag = sc.nextBoolean();
           sc.nextLine();
           System.out.println("Enter Employee Name :");
           String str1= sc.nextLine();
           System.out.println("Enter Your Salary : ");
           double sal =sc.nextDouble();
           System.out.println("Tax Amount : "+tc.calculateTax(str1, flag, sal));
           
		}
		catch(CountryNotValidException e) {
           System.out.println(e.getMessage());			
		}
		catch(EmployeeNameInvalidException e) {
			System.out.println(e.getMessage());
		}
		catch(TaxNotEligibleException e) {
			System.out.println(e.getMessage());
		}


	}

}
