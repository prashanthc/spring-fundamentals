import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.service.CustomerService;
import com.app.service.CustomerServiceImpl;

public class Application {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService service = applicationContext.getBean("customerService", CustomerService.class);
		
		System.out.println(service.findAll().get(0).getUsername());
	}
}
