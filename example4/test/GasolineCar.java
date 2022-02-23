package test;

public class GasolineCar extends Car {
	private int fuelStatus;
	
	public GasolineCar(int fuelStatus)
	{
		super("Grey","Normal");
		this.fuelStatus = fuelStatus;
	}
	
	public int getFuelStatus()
	{
		return this.fuelStatus;
	}
	
	public void setFuelStatus(int newFuel)
	{
		this.fuelStatus=newFuel;
	}
	
	
}
