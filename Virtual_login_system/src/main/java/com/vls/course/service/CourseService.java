package com.vls.course.service;

import com.vls.course.model.CourseModel;
import com.vls.course.repo.CourseRepository;
import com.vls.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/** Business logic for courses. */
@Service
public class CourseService {

    private final CourseRepository courseRepository;
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<CourseModel> listAll() {
        return courseRepository.findAll();
    }

    public CourseModel getById(Integer id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found: " + id));
    }

    public List<CourseModel> search(String author, String name) {
        if ((author == null || author.trim().isEmpty()) && (name == null || name.trim().isEmpty())) {
            return listAll();
        }
        if (author != null && !author.trim().isEmpty() && name != null && !name.trim().isEmpty()) {
            return courseRepository.findByAuthorNameContainingIgnoreCaseOrCourseNameContainingIgnoreCase(author, name);
        }
        if (author != null && !author.trim().isEmpty()) {
            return courseRepository.findByAuthorNameContainingIgnoreCase(author);
        }
        return courseRepository.findByCourseNameContainingIgnoreCase(name);
    }

    // Optional CRUD for moderators (add/update/delete)
    public CourseModel create(CourseModel model) {
        return courseRepository.save(model);
    }

    public CourseModel update(Integer id, CourseModel updated) {
        CourseModel existing = getById(id);
        existing.setCourseName(updated.getCourseName());
        existing.setAuthorName(updated.getAuthorName());
        existing.setDurationHours(updated.getDurationHours());
        existing.setAvailability(updated.getAvailability());
        return courseRepository.save(existing);
    }

    public void delete(Integer id) {
        CourseModel cm = getById(id);
        courseRepository.delete(cm);
    }
}
