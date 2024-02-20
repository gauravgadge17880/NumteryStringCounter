package com.example.demo.controller;

import java.nio.file.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StringModel;
import com.example.demo.service.StringService;

@RestController
public class HomeController {
	@Autowired
	StringService service;
	
	@PostMapping("/get")
	public  StringModel  get(@RequestBody String str) {
		
		
		return service.getString(str);
	}

}
