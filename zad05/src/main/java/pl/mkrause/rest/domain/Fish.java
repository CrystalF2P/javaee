package pl.mkrause.rest.domain;

public class Fish {
	
	private int id;
	private String gatunek;
	private double waga;

	public Fish() {
		super();
	}

	
	public Fish(String gatunek, double waga) {
		super();
		this.gatunek = gatunek;
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
	
	
	
	public double getWaga() {
		return waga;
	}
	public void setWaga(double waga) {
		this.waga = waga;
	}
	
	
	
	
}