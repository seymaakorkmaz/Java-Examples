import java.util.Scanner;
public class prime_numbers {
	
	public static boolean is_it_prime(int sayi) {
		for(int i=2;i<sayi;i++) {
			if(sayi % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("You want to see prime numbers from 1 to which number?");
		int number = scanner.nextInt();
		
		for(int i=2;i<=number;i++) {
			if(is_it_prime(i) == true) {
				System.out.print(i+", ");
			}
		}
		
	}
	
	
}
