package com.sicc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControllerForView {
	@RequestMapping("/view")
	public String hello(HttpServletRequest request) {
		System.out.println("view work~!");		
		request.setAttribute("message", "HelloSpringBoot for View");
		return "hello";
	}
}

