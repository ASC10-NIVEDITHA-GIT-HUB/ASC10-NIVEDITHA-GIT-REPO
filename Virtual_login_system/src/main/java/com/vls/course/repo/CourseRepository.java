package com.vls.course.repo;

import com.vls.course.model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/** JPA repository for CourseModel with simple search methods. */
public interface CourseRepository extends JpaRepository<CourseModel, Integer> {
    List<CourseModel> findByAuthorNameContainingIgnoreCase(String authorName);
    List<CourseModel> findByCourseNameContainingIgnoreCase(String courseName);
    List<CourseModel> findByAuthorNameContainingIgnoreCaseOrCourseNameContainingIgnoreCase(String author, String name);
}
