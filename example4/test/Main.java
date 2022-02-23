package test;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("colour : "+ car1.getColour() + ", model : " + car1.getModel()+ ", cant : " + car1.getCant());
		
		ElectricCar electricCar1 = new ElectricCar(50);
		System.out.println("colour : "+ electricCar1.getColour() + ", model : " + electricCar1.getModel()+ ", cant : " + electricCar1.getCant()+", charge : "+electricCar1.getChargeStatus());
		
		electricCar1.setChargeStatus(60);
		System.out.println(electricCar1.getChargeStatus());
		electricCar1.chargeUp();
		System.out.println(electricCar1.getChargeStatus());
		
		GasolineCar gasolineCar1  = new GasolineCar(30);
		System.out.println("colour : "+ gasolineCar1.getColour() + ", model : " + gasolineCar1.getModel()+ ", cant : " + gasolineCar1.getCant()+", fuel : "+ gasolineCar1.getFuelStatus());
		
		gasolineCar1.setFuelStatus(70);
		System.out.println(gasolineCar1.getFuelStatus());
	}

}
