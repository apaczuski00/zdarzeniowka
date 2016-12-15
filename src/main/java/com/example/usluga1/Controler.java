package com.example.usluga1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usluga1.service.Service;


@RestController
@RequestMapping("/controler")
public class Controler {

	@Autowired
	Service service;
	

	@RequestMapping("/get")
	public String home() {
		String result = service.funkcjsaTest();
		return result;
	}
	


}