package com.example.demo.controller;

import com.example.demo.model.Database1;
import com.example.demo.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DatabaseController {
	@Autowired
	private DatabaseService DatabaseService;

	@GetMapping("/entities")
	public List<Database1> getAllEntities() {
		return DatabaseService.getAllEntities();
	}
}
