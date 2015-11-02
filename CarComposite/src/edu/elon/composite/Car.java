package edu.elon.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Car extends CarComponent{
	
	String model;
	String description;
	double price;
	ArrayList<CarComponent> options;
	
	
	public Car(String name, String description, double price){
		model = name;
		this.description = description;
		this.price = price;
		options = new ArrayList<CarComponent>();
	}
	
	public void add(CarComponent c){
		options.add(c);
	}
	
	public void remove(CarComponent c){
		options.remove(c);
	}
	
	public String getName(){
		return model;
	}
	
	public double getPrice(){
		double total = price;
		for(CarComponent item: options){
			total = total + item.getPrice();
		}
		return total;
	}
	
	public void print(){
		System.out.println("Summary");
		System.out.println("Model");
		System.out.println(model +"     " + description + "         $" + price);
		Iterator<CarComponent> iterator = options.iterator();
		while(iterator.hasNext()){
			CarMenu menu = (CarMenu) iterator.next();
			menu.print();
		}
	}
	
}
