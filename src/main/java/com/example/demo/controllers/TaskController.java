package com.example.demo.controllers;

import java.util.List;

import com.example.demo.entities.Task;
import com.example.demo.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/taskapi")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class TaskController {
	@Autowired
	private TaskRepository taskRepository;

	@GetMapping("/tasks")
	public List<Task> getTasks() {
		return taskRepository.findAll();
	}

}