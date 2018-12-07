package pl.mkrause.javaee.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.Calendar;

import pl.mkrause.javaee.domain.Fish;
import pl.mkrause.javaee.service.FishService;

import java.util.Date;
import java.util.GregorianCalendar;

@WebListener
	public class Config implements ServletContextListener {

	    public void contextInitialized(ServletContextEvent event) {
	        FishService fishService = new FishService();
	        
	        Calendar cal = GregorianCalendar.getInstance();
	        cal.set(2018, 10, 10);
	        fishService.addFish(new Fish("Sledz", cal.getTime(), 2.3));
	        cal.set(2018, 9, 12);
	        fishService.addFish(new Fish("Okon", cal.getTime(), 4.2));
	        cal.set(2018, 4, 22);
	        fishService.addFish(new Fish("Sum", cal.getTime(), 4.7));
	        event.getServletContext().setAttribute("fishService",fishService);
	    }

	    public void contextDestroyed(ServletContextEvent event) {
	    }

	}
