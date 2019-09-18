package com.sicc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller
 * @author Woongs
 */
@Controller
public class SIccController {
	@RequestMapping("/view")
	public String hello(HttpServletRequest request) {
		request.setAttribute("message", "HelloSpringBoot for View");
		return "hello";
	}
}

