import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char operator;
		BigDecimal number1, number2, result=BigDecimal.ZERO;
		
		Scanner input= new Scanner(System.in); 
		input .useLocale(Locale.US);
		
		System.out.println("Choose an operator: +, -, *, / or %");
		operator=input.next().charAt(0);
		
		System.out.println("Enter first number");
		number1=input.nextBigDecimal();
		
		System.out.println("Enter second numner");
		number2=input.nextBigDecimal();
		
		switch(operator) {
		case '+':;
		result=Operation.sum(number1, number2);
		break;
		
		case '-':;
		result=Operation.sub(number1, number2);
		break;

		case '*':;
		result=Operation.mul(number1, number2);
		break;

		case '/':;
		result=Operation.div(number1, number2);
		break;

		case '%':;
		result=Operation.mod(number1, number2);
		break;
		default:
			System.out.println("Invalid operator!");

		}
		input.close();
		
		System.out.println(number1.doubleValue() + " " +  String.valueOf(operator) + " " + number2.doubleValue() + " = " + result.doubleValue());

		
		
	}

}
