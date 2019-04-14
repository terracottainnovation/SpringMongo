package com.terracottainnovation.application.controller;

import com.terracottainnovation.application.entity.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping (path="/welcome", produces ="application/json")
	public @ResponseBody
	Result welcomeString() {
		Result r = new Result();
		r.setData("Hi Tejas");
		return r;
		
	}
}
 