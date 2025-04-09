package com.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todolist.models.Task;


public interface TaskRepository extends JpaRepository<Task, Long>{
	
	

}
