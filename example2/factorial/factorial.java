import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number whose factorial you want to calculate : ");
		int value = scanner.nextInt();
		int factorial =  1;
		while(value > 0) {
			factorial = factorial * value;
			value --;
		}
		
		System.out.println("factorial = "+factorial);
	}

}
