package eric.spring;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/userpage")
	public ModelAndView userPage(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("name", request.getRemoteHost());
		log.info("user.page...");
		return mav;
	}
}
