package org.sid.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class AppController {
	
	@ResponseBody
	@RequestMapping("/hey" )
	public String hello() {
		return "heeeeeeey " ;
	}
}
