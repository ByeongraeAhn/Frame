package com.anbr.frame;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MenuTestController {
	
	@RequestMapping(value="/boardTest", method=RequestMethod.GET)
	public String boardTest() {
		return "boardWrite";
	}
}
