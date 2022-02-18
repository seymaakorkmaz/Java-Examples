import java.util.Scanner;
public class bmi {

	public static void main(String[] args) {
		//BMI (Body Mass Index) = weight/height*height
		// kg ,m 
		
		System.out.print("Enter your weight (kg) : ");
		Scanner scanner=new Scanner(System.in);
		int weight = scanner.nextInt();
		System.out.print("Enter your height (m) : ");
		double height = scanner.nextDouble();
		
		//BMI
		
		double bmi = weight / (height * height);
		System.out.println("BMI = "+ bmi);	
	} 
}
