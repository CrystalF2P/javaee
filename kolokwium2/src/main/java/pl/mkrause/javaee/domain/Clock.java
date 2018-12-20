package pl.mkrause.javaee.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {
	
	private int id;
	private Date dataKupienia;
	private String cyfry;
	private double cena;
	private Boolean czerwony;
	private Boolean niebieski;
	private Boolean bialy;

	
	public Clock(Date dataKupienia, String cyfry, double cena, Boolean czerwony, Boolean niebieski, Boolean bialy) {
		super();
		this.dataKupienia = dataKupienia;
		this.cyfry = cyfry;
		this.cena = cena;
		this.czerwony = czerwony;
		this.niebieski = niebieski;
		this.bialy = bialy;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
		
	public String getDataKupienia() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		return sdf.format(dataKupienia).toString();
	}
	public void setDataKupienia(Date dataKupienia) {
		this.dataKupienia = dataKupienia;
	}
	
	public Double getCena() {
		return cena;
	}
	
	public void setCena(double cena) {
		this.cena = cena;
	}
	
	public String getCyfry() {
		return cyfry;
	}
	public void setCyfry(String czestosc) {
		this.cyfry = cyfry;
	}

	public Boolean getCzerwony() {
		return czerwony;
	}
	public void setCzerwony(Boolean czerwony) {
		this.czerwony = czerwony;
	}
	
	public Boolean getNiebieski() {
		return niebieski;
	}
	public void setNiebieski(Boolean niebieski) {
		this.niebieski = niebieski;
	}
	
	public Boolean getBialy() {
		return bialy;
	}
	public void setBialy(Boolean bialy) {
		this.bialy = bialy;
	}
	
}