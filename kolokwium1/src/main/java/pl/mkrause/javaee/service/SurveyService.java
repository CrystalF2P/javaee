package pl.mkrause.javaee.service;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import pl.mkrause.javaee.domain.Fish;

public class Storage {
	
	private List<Fish> db = new ArrayList<>();
	
	public void add(Fish fish){
		db.add(fish);
	}
	
	public void removeFish(Fish fish) {
        db.remove(fish);
    }
	
	public List<Fish> getAllFish(){
		return db;
	}

}
