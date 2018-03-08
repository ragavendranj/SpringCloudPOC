package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FetchController {

	@Value("${howareyou:raga}")
	 private String howareyou;

	 @RequestMapping("/")
	 String getMessage() {
		 System.out.println(howareyou);
		return howareyou;
	 }
}
