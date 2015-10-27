package edu.elon.composite;

public abstract class CarComponent {

	public void add(CarComponent c) {
		throw new UnsupportedOperationException();
	}

	public void remove(CarComponent c) {
		throw new UnsupportedOperationException();
	}

	public double getPrice() {
		throw new UnsupportedOperationException();
	}

	public void print() {
		throw new UnsupportedOperationException();
	}
}
