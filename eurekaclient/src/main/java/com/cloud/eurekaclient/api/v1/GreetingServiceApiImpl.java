package com.cloud.eurekaclient.api.v1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class GreetingServiceApiImpl implements GreetingServiceApi{
 
	
	@Value("${greeting.message}")
	private String msg;
	@GetMapping("/greet")
	@Override
	public String getMessage() {
		
		return msg; 
	}

}
