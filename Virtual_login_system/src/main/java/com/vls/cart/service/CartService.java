package com.vls.cart.service;

import com.vls.cart.model.CartModel;
import com.vls.cart.repo.CartRepository;
import com.vls.course.model.CourseModel;
import com.vls.course.service.CourseService;
import com.vls.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/** Business logic for in-memory cart. */
@Service
public class CartService {

    private final CartRepository cartRepository;
    private final CourseService courseService;

    public CartService(CartRepository cartRepository, CourseService courseService) {
        this.cartRepository = cartRepository;
        this.courseService = courseService;
    }

    public List<CartModel> getAll() {
        return cartRepository.findAll();
    }

    /** Adds a course by id into cart; validates it exists in DB. */
    public CartModel addCourse(Integer courseId) {
        CourseModel course = courseService.getById(courseId);
        if (Boolean.FALSE.equals(course.getAvailability())) {
            throw new ResourceNotFoundException("Course not available: " + courseId);
        }
        CartModel item = new CartModel(course.getCourseId(), course.getCourseName(),
                course.getAuthorName(), course.getDurationHours());
        return cartRepository.save(item);
    }

    public void removeCourse(Integer courseId) {
        if (!cartRepository.exists(courseId)) {
            throw new ResourceNotFoundException("Course not found in cart: " + courseId);
        }
        cartRepository.delete(courseId);
    }

    public void clear() {
        cartRepository.clear();
    }
}
