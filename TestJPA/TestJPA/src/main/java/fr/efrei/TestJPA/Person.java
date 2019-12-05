package fr.efrei.TestJPA;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import org.springframework.lang.NonNull;

@Entity
public class Person {
	
	private Long id;
	private String name;
	
	@OneToMany(targetEntity = Rent.class, mappedBy = "person", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Rent> rents = new ArrayList <>();
	
	
	protected Person() {
	}
	
	public Person(String name) {
		
		this.name = name;
	}
	
	public Long getid() {
		return id;
	}
	
	public void setid(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

