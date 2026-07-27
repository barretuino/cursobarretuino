package pjAula13;

public class Demonstracao {
	public static void main(String[] args) {
		try{
			System.out.println(5/0);
		}catch(NumberFormatException e) {
		}catch(ArithmeticException e) {
		}
	}
}
