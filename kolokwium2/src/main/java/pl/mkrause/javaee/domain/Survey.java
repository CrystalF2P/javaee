package pl.mkrause.javaee.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Survey {
	
	private int id;
	private Date dataKupienia;
	private Date dataZjedzenia;
	private String czestosc;
	private Boolean nieswieza;
	private Boolean niesmaczna;
	private Boolean cena;


	
	public Survey(Date dataKupienia, Date dataZjedzenia, String czestosc, Boolean nieswieza, Boolean niesmaczna, Boolean cena) {
		super();
		this.dataKupienia = dataKupienia;
		this.dataZjedzenia = dataZjedzenia;
		this.czestosc = czestosc;
		this.nieswieza = nieswieza;
		this.niesmaczna = niesmaczna;
		this.cena = cena;
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
	
	
	public String getDataZjedzenia() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		return sdf.format(dataZjedzenia).toString();
	}
	public void setDataZjedzenia(Date dataZjedzenia) {
		this.dataZjedzenia = dataZjedzenia;
	}
	
	public String getCzestosc() {
		return czestosc;
	}
	public void setCzestosc(String czestosc) {
		this.czestosc = czestosc;
	}

	public Boolean getNieswieza() {
		return nieswieza;
	}
	public void setNieswieza(Boolean nieswieza) {
		this.nieswieza = nieswieza;
	}
	
	public Boolean getNiesmaczna() {
		return niesmaczna;
	}
	public void setNiesmaczna(Boolean niesmaczna) {
		this.niesmaczna = niesmaczna;
	}
	
	public Boolean getCena() {
		return cena;
	}
	public void setCena(Boolean cena) {
		this.cena = cena;
	}
	
}