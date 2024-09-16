package com.example.onetomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Mobile {
	@Id
	private int id;
	private String name;
	private String Ram;
	private double cost;
	
	@OneToMany
	private List <Sim> sim;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRam() {
		return Ram;
	}

	public void setRam(String ram) {
		Ram = ram;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public List<Sim> getSim() {
		return sim;
	}

	public void setSim(List<Sim> sim) {
		this.sim = sim;
	}
	
	
}
