package test;

public class Car {
	private String colour;
	private String model="Audi";
	private String cant;
	
	public Car(String colour, String cant)
	{
		this.colour=colour;
		this.cant=cant;
	}
	
	public Car() 
	{
		this("Black","Steel");
	}
	
	public String getColour()
	{
		return this.colour;
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	public String getCant()
	{
		return this.cant;
	}
	
	public void setColour(String newColour)
	{
		this.colour=newColour;
	}
	
	public void setModel(String newModel)
	{
		this.model=newModel;
	}
	
	public void setCant(String newCant)
	{
		this.cant=newCant;
	}

	
	
}
