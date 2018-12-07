package pl.mkrause.javaee.domain;

import java.util.Date;

public class Fish {
	
	private int id;
	private String gatunek;
	private Date dataZlowienia;
	private double waga;

	public Fish() {
		super();
	}

	
	public Fish(String gatunek, Date dataZlowienia, double waga) {
		super();
		this.gatunek = gatunek;
		this.dataZlowienia = dataZlowienia;
		this.waga = waga;	
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getGatunek() {
		return gatunek;
	}
	public void setGatunek(String gatunek) {
		this.gatunek = gatunek;
	}
	
	
	public Date getDataZlowienia() {
		return dataZlowienia;
	}
	public void setDataZlowienia(Date dataZlowienia) {
		this.dataZlowienia = dataZlowienia;
	}
	
	
	public double getWaga() {
		return waga;
	}
	public void setWaga(double waga) {
		this.waga = waga;
	}
	
	
	
	
}