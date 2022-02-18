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
		
		// BMI < 18.5  weak
		// 18.5 <= BMI <= 25 normal
		// 25 < BMI < 30 overweight
		// BMI >= 30 obese
		double bmi = weight / (height * height);
		System.out.println("BMI = "+ bmi);	
		//aaaaaaaaaaaaaaaaaaaaa
		if (bmi < 18.5) {
			System.out.println("weak");
		}else if((bmi>=18.5) && (bmi <= 25)) {
			System.out.println("normal");
		}else if((bmi>25) && (bmi <30 )) {
			System.out.println("overweight");
		}else if(bmi >= 30) {
			System.out.println("obese");
		}
	} 
}
