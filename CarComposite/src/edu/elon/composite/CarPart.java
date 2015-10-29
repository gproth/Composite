package edu.elon.composite;

public class CarPart extends CarComponent {
	String partName;
	String description;
	double price;
	
	public CarPart(String name, String description, double price){
		partName = name;
		this.description = description;
		this.price = price;
	}
	
	
	
	public String getName(){
		return partName;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void print(){
		String part = partName + ":" + description + "         " + price;
	}
}
