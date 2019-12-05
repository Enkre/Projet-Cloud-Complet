package fr.efrei.TestJPA;
import javax.persistence.*;

@Entity

public class Car extends Vehicule {
	private int numberOfSeats;
	
	protected Car() {
	}
	
	public Car (String plateNumber, int numberOfSeats) {
		
		super(plateNumber);
		this.numberOfSeats = numberOfSeats;
	}
		
	public int getNumberOfSeats() {
		
		return numberOfSeats;
	}
	
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

}

