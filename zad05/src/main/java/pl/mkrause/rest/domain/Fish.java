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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gatunek == null) ? 0 : gatunek.hashCode());
		long temp;
		temp = Double.doubleToLongBits(waga);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fish other = (Fish) obj;
		if (gatunek == null) {
			if (other.gatunek != null)
				return false;
		} else if (!gatunek.equals(other.gatunek))
			return false;
		if (waga != other.waga)
			return false;
		return true;
	}
	
	
	
}