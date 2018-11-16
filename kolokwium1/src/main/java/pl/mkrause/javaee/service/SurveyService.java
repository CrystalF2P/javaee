package pl.mkrause.javaee.service;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import pl.mkrause.javaee.domain.Form;

public class SurveyService {
	
	private List<Form> db = new ArrayList<>();
	
	public void add(Form form){
		db.add(form);
	}
	
	public void removeForm(Form form) {
        db.remove(form);
    }
	
	public List<Form> getAllForms(){
		return db;
	}

}
