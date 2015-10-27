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
		return null;
	}
	
	public double getPrice(){
		return 0.0;
	}
	
	public void print(){
		
	}
}
