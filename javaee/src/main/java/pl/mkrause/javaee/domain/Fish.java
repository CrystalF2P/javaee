package pl.mkrause.javaee.domain;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Fish {
	
	private long id;
	private String gatunek;
	private SimpleDateFormat dataZlowienia = null;
	private double waga;

	public Fish() {
		super();
	}

	
	public Fish(String gatunek, SimpleDateFormat dataZlowienia, double waga) {
		super();
		this.gatunek = gatunek;
		this.dataZlowienia = dataZlowienia;
		this.waga = waga;	
	}
	
	
	
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
	
	
	public SimpleDateFormat getDataZlowienia() {
		return dataZlowienia;
	}
	public void setDataZlowienia(SimpleDateFormat dataZlowienia) {
		this.dataZlowienia = dataZlowienia;
	}
	
	
	public double getWaga() {
		return waga;
	}
	public void setWaga(double waga) {
		this.waga = waga;
	}
	
	
	
	
}