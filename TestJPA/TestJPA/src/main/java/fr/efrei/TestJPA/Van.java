package fr.efrei.TestJPA;

import javax.persistence.*;

@Entity
public class Van extends Vehicule {
	
	private double maxWeight;
	
	protected Van() {
	}
	
	public Van(String plateNumber, double maxWeight) {
		
		super(plateNumber);
		this.maxWeight = maxWeight;
	}
	
	public double getMaxWeight() {
		
		return maxWeight; 
	}
	
	public void setMaxWeight(double maxWeight) {
		
		this.maxWeight = maxWeight;
	}

}
