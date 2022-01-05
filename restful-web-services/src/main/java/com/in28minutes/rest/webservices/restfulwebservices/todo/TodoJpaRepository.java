package com.in28minutes.rest.webservices.restfulwebservices.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoJpaRepository extends JpaRepository<Todo, Long>{
	List<Todo> findTodosByUserName(String userName);
}
