package fr.efrei.TestJPA;

import java.util.*;
import javax.persistence.*;
import org.springframework.lang.NonNull;

public class Rent {
	
	private Date beginRent;
	private Date endRent;
	
	@ManyToOne
	private Vehicule vehicule;
	
	@OneToMany(targetEntity = Person.class, mappedBy = "rent", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Rent> rents = new ArrayList <>();
	private Person person;
	
	protected Rent() {
	}
	
	public Rent(Date beginRent, Date endRent, Person person, Vehicule vehicule) {
		super();
		this.beginRent = beginRent;
		this.endRent = endRent;
		this.person = person;
		this.vehicule = vehicule;
	}
		
	public Date getbeginDate() {
		return beginRent;
	}
	
	public Date getendDate() {
		return endRent;
	}
	
	public void setbeginRent(Date beginDate) {
		this.beginRent = beginDate;
	}
	
	public void setendRent(Date endDate) {
		this.endRent = endDate;
	}
}
