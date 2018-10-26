package pl.mkrause.javaee.service;

import java.util.ArrayList;
import java.util.List;

import pl.mkrause.javaee.domain.Fish;

public class Storage {
	
	private List<Fish> db = new ArrayList<Fish>();
	
	public void add(Fish fish){
		Fish newFish = new Fish(fish.getGatunek(), fish.getDataZlowienia(), fish.getWaga());
		db.add(newFish);
	}
	
	public List<Fish> getAllFish(){
		return db;
	}

}
