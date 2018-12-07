package pl.mkrause.rest.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ejb.Singleton;

import pl.mkrause.rest.domain.Fish;

@Singleton
public class FishManager {
	
	private List<Fish> db = Collections.synchronizedList(new ArrayList<>());

	public void addFish(Fish fish) {
		db.add(fish);
	}

	public void deleteFish(Fish fish){
		db.remove(fish);
 	}
	
	public Fish getFish(Integer id) {
		return new Fish("Bolek", 1976);
	}
	
	public List<Fish> getAllFish(){
		return db;
	}
	
	public void deleteAllFish(){
		db.clear();
	}

}
