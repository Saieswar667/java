package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.student;


@Repository
public interface userRepository extends JpaRepository<student, String>{
	@Query("select c from student c where c.name=?1 and c.password=?2")
	public student checklogin(String name,String password);
	@Query("select c from student c where c.name=?1 and c.password=?2")
public student checklogin1(String name,String password);

}
