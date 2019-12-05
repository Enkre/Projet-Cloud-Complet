package fr.efrei.TestJPA;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public abstract class Vehicule {

	private String plateNumber;
		
	public Vehicule() {
		super();
	}
	
	@OneToMany(targetEntity = Rent.class, mappedBy = "vehicule", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Vehicule> vehicule = new ArrayList<>();
	
	public Vehicule(String plateNumber) {
		super();
		this.setPlateNumber(plateNumber); 
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
}
