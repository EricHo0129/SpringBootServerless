package eric.spring;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestUserController {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/user/{name}")
    public String hello(@PathVariable("name") String name) {
    	if (name == null) {
    		name = "Guest";
    	}
    	log.info("Hello {} !", name);
    	return "Hello "+name+" !";
    }
	
	@GetMapping("/user")
    public String me(HttpServletRequest request) {
    	log.info("Hello friend come from {} !", request.getRemoteAddr());
    	return "Hello friend come from "+ request.getServerName();
    }
}
