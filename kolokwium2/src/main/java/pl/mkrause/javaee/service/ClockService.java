package pl.mkrause.javaee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import pl.mkrause.javaee.domain.Clock;


public class ClockService {

	public int licznik = 0;
	public int temp = 0;
	private List<Clock> list = new ArrayList<Clock>();
	private List<Clock> orderList = new ArrayList<Clock>();
	
    public void addClock(Clock clock) {
        clock.setId(licznik);
        list.add(clock);
        licznik++;
    }

    public void addClockOrder(Clock clock) {
    	clock.setId(temp);
    	orderList.add(clock);
    	temp++;
    }
    
    
    public void remove(int i) {
    	list.remove(i);
    	licznik--;
    }
    
    public void removeClock(int i) {
    	
    	for(Iterator<Clock> iterator = list.listIterator(); iterator.hasNext(); ) {
    		Clock c = iterator.next();
    		if (c.getId() == i) {
    			iterator.remove();
    		}
    		licznik--;
    	}
    }
    

    public List<Clock> getList() {
        return list;
    }

    public List<Clock> getOrderList() {
		return orderList;
	}
}
