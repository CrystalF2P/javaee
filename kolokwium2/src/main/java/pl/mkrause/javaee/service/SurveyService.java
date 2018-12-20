package pl.mkrause.javaee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import pl.mkrause.javaee.domain.Survey;


public class SurveyService {

	public int licznik = 0;
	public int temp=0;
	private List<Survey> list = new ArrayList<Survey>();
	
    public void addSurvey(Survey survey) {
        survey.setId(licznik);
        list.add(survey);
        licznik++;
    }

    
    public void removeSurvey(int i) {
    	
    	for(Iterator<Survey> iterator = list.listIterator(); iterator.hasNext(); ) {
    		Survey s = iterator.next();
    		if (s.getId() == i) {
    			iterator.remove();
    		}
    	}
    }

    public List<Survey> getList() {
        return list;
    }

}
