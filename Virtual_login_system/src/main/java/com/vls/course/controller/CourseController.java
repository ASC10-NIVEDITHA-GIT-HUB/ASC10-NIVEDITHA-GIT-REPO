package com.vls.course.controller;

import com.vls.course.model.CourseModel;
import com.vls.course.service.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/** Endpoints for listing/searching/CRUD courses. */
@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseService courseService;
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    /** GET /api/courses */
    @GetMapping
    public ResponseEntity<List<CourseModel>> getAll() {
        return ResponseEntity.ok(courseService.listAll());
    }

    /** GET /api/courses/{id} */
    @GetMapping("/{id}")
    public ResponseEntity<CourseModel> getOne(@PathVariable Integer id) {
        return ResponseEntity.ok(courseService.getById(id));
    }

    /** GET /api/courses/search?author=...&name=... (any param optional) */
    @GetMapping("/search")
    public ResponseEntity<List<CourseModel>> search(@RequestParam(required = false) String author,
                                                    @RequestParam(required = false, name = "name") String name) {
        return ResponseEntity.ok(courseService.search(author, name));
    }

    /** POST /api/courses (create new course) */
    @PostMapping
    public ResponseEntity<CourseModel> create(@RequestBody CourseModel model) {
        return ResponseEntity.ok(courseService.create(model));
    }

    /** PUT /api/courses/{id} (update course) */
    @PutMapping("/{id}")
    public ResponseEntity<CourseModel> update(@PathVariable Integer id, @RequestBody CourseModel model) {
        return ResponseEntity.ok(courseService.update(id, model));
    }

    /** DELETE /api/courses/{id} */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        courseService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
