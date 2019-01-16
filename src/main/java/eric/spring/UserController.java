package eric.spring;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.TAIWAN);
		mav.addObject("name", request.getRemoteHost());
		mav.addObject("time", df.format(new Date()));
		
		return mav;
	}
}
