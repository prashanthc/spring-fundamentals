import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.service.CustomerService;
import com.app.service.CustomerServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		return new CustomerServiceImpl();	
	}

}
