package com.in28minutes.learnspringboot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.learnspringboot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
