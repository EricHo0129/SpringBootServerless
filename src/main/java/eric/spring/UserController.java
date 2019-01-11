package eric.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
public class UserController {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/user/{name}")
    public String hello(@PathVariable("name") String name) {
    	if (name == null) {
    		name = "Guest";
    	}
    	log.info("Hello {} !", name);
    	return "Hello "+name+" !";
    }
}
