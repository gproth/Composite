package edu.elon.composite;

import java.util.ArrayList;
import java.util.Iterator;

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
		double total = 0.0;
		for(CarComponent item: choices){
			total = total + item.getPrice();
		}
		return total;
	}
	
	public void print(){
		Iterator iterator = choices.iterator();
		while(iterator.hasNext()){
			CarMenu menu = (CarMenu) iterator.next();
			menu.print();
		}
	}
}
