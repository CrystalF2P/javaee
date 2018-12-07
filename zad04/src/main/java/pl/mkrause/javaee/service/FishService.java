package pl.mkrause.javaee.service;

import java.util.HashMap;
import java.util.Map;

import pl.mkrause.javaee.domain.Fish;


public class FishService {

	public int licznik = 0;
	private Map<Integer, Fish> map = new HashMap<>();
    public void addFish(Fish fish) {
        fish.setId(licznik);
        map.put(licznik, fish);
        licznik++;
    }
    public Fish getFish(int id) {return map.get(id); }
   
    public void removeFish(int id) {
        map.remove(id);
    }

    public Map<Integer, Fish> getMap() {
        return map;
    }

}
