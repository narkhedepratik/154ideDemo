package com.bitlogic.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnquiryController {

	@GetMapping
	public ResponseEntity<String> getMsg()
	{
		return new ResponseEntity<>("Hello",HttpStatus.OK);
	}
}
