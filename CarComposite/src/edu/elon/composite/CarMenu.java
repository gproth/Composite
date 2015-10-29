package edu.elon.composite;

import java.util.ArrayList;

public class CarMenu extends CarComponent{
	
	ArrayList<CarComponent> choices;
	private String partName;
	private String description;
	private double price;
	
	public CarMenu(String name, String description, double price){
		partName = name;
		this.description = description;
		this.price = price;
		choices = new ArrayList<CarComponent>();
	}
	public void add(CarMenu c){
		choices.add(c);
	}
	
	public void remove(CarMenu c){
		choices.remove(c);
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
