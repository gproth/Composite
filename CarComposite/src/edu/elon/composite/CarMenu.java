package edu.elon.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class CarMenu extends CarComponent{
	
	ArrayList<CarComponent> choices;
	private String partName;
	private String description;
	
	public CarMenu(String name, String description){
		partName = name;
		this.description = description;
		choices = new ArrayList<CarComponent>();
	}
	public void add(CarComponent c){
		choices.add(c);
	}
	
	public void remove(CarComponent c){
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
		System.out.println(partName);
		Iterator<CarComponent> iterator = choices.iterator();
		while(iterator.hasNext()){
			CarComponent menu = (CarComponent) iterator.next();
			menu.print();
		}
	}
}
