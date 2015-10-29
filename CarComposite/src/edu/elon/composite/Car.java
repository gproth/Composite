package edu.elon.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Car extends CarComposite{
	
	String model;
	String description;
	double price;
	ArrayList<CarMenu> options;
	CarMenu colors;
	CarMenu interior;
	CarMenu exterior;
	
	public Car(String name, String description, double price){
		model = name;
		this.description = description;
		this.price = price;
		options = new ArrayList<CarMenu>();
	}
	
	public void add(CarMenu c){
		options.add(c);
	}
	
	public void remove(CarMenu c){
		options.remove(c);
	}
	
	public String getName(){
		return model;
	}
	
	public double getPrice(){
		double total = 0;
		for(CarMenu item: options){
			total = item.getPrice();
		}
		return total;
	}
	
	public void print(){
		Iterator iterator = options.iterator();
		while(iterator.hasNext()){
			
			CarMenu menu = (CarMenu) iterator.next();
			menu.print();
		}
	}
	
}
