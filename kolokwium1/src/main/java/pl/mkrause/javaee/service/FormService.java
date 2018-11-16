package pl.mkrause.javaee.service;

import java.util.HashMap;
import java.util.Map;

import pl.mkrause.javaee.domain.Form;


public class FormService {

	public int licznik = 0;
	private Map<Integer, Form> map = new HashMap<>();
    public void addForm(Form form) {
        form.setId(licznik);
        map.put(licznik, form);
        licznik++;
    }
    public Form getForm(int id) {return map.get(id); }
   
    public void removeForm(int id) {
        map.remove(id);
    }

    public Map<Integer, Form> getMap() {
        return map;
    }

}
