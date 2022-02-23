package test;

public class ElectricCar extends Car {
	private int chargeStatus;
	
	public ElectricCar(int chargeStatus)
	{
		super();
		this.chargeStatus=chargeStatus;
	}
	
	public int getChargeStatus()
	{
		return this.chargeStatus;
	}
	
	public void setChargeStatus(int newCharge)
	{
		this.chargeStatus=newCharge;
	}
	
	public void chargeUp()
	{
		this.chargeStatus=100;
	}
	
	
}
