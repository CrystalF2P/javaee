package com.example.restejbjpa.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@NamedQueries({
		@NamedQuery(name = "fish.all", query = "Select f from Fish f"),
		@NamedQuery(name = "fish.delete.all", query = "Delete from Fish ")
})
public class Fish {

	private long id;
	private String gatunek;
	private double waga;
	private Customer customer;
	
	public Fish(long id, String gatunek, double waga, Customer customer) {
		super();
		this.id = id;
		this.gatunek = gatunek;
		this.waga = waga;
		this.customer = customer;
	}
	public Fish(String gatunek, double waga) {
		super();
		this.gatunek = gatunek;
		this.waga = waga;
	}
	public Fish() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getGatunek() {
		return gatunek;
	}
	public void setGatunek(String gatunek) {
		this.gatunek = gatunek;
	}
	public double getWaga() {
		return waga;
	}
	public void setWaga(double waga) {
		this.waga = waga;
	}
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	@Override
	public String toString() {
		return gatunek + waga + customer.name;
		
	}
	
}
