package edu.elon.composite;

public class CarComposite {
	static CarMenu colors;
	static CarMenu interior;
	static CarMenu exterior;
	static CarMenu electronics;
	
	static Car honda;
	
	static CarComponent exteriorColor;
	static CarComponent interiorColor;
	static CarComponent side_spoiler;
	static CarComponent armrest;
	static CarComponent xm_radio;
	static CarComponent handling;
	
	public static void main(String[] args){
		honda = new Car("2015 CR-Z EX","Manual", 21990.00);
		
		colors = new CarMenu("Colors", "Colors for the interior and exterior of the car");
		interior = new CarMenu("Interior", "Interior component choices");
		exterior = new CarMenu("Exterior", "Exterior component choices");
		electronics = new CarMenu("Electronics", "Electronic component choices");
		
		exteriorColor = new CarPart("Exterior: Milano Red", null, 0);
		interiorColor = new CarPart("Interior: Black/Rde", null, 0);
		side_spoiler = new CarPart("Side Spoilers", null, 520.00);
		armrest = new CarPart("Armrest", null, 393.00);
		xm_radio = new CarPart("XM Radio", null, 313.00);
		handling = new CarPart("Destination and handling", null, 820.00);
		
		colors.add(exteriorColor);
		colors.add(interiorColor);
		
		exterior.add(side_spoiler);
		interior.add(armrest);
		
		electronics.add(xm_radio);
		electronics.add(handling);
		
		honda.add(colors);
		honda.add(exterior);
		honda.add(interior);
		honda.add(electronics);
		
		honda.print();
		System.out.println("                     " + "Total MSRP as Build $" + honda.getPrice());
	}
}
