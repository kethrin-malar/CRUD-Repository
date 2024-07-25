package com.example.demo.service;

import com.example.demo.model.Database1;
import com.example.demo.repository.DatabaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatabaseService {
	@Autowired
	private DatabaseRepo databaseRepo;

	public List<Database1> getAllEntities() {
		return databaseRepo.findAll();
	}
}
