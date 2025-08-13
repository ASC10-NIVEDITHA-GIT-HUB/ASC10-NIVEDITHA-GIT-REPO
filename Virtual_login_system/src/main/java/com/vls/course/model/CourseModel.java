package com.vls.course.model;

import javax.persistence.*;

/** Entity mapped to SQL Server table Course */
@Entity
@Table(name = "Course")
public class CourseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Integer courseId;

    @Column(name = "course_name", nullable = false, length = 100)
    private String courseName;

    @Column(name = "author_name", nullable = false, length = 100)
    private String authorName;

    @Column(name = "duration_hours", nullable = false)
    private Integer durationHours;

    @Column(name = "availability", nullable = false)
    private Boolean availability;

    public CourseModel() {}

    public CourseModel(String courseName, String authorName, Integer durationHours, Boolean availability) {
        this.courseName = courseName;
        this.authorName = authorName;
        this.durationHours = durationHours;
        this.availability = availability;
    }

    public Integer getCourseId() { return courseId; }
    public void setCourseId(Integer courseId) { this.courseId = courseId; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public String getAuthorName() { return authorName; }
    public void setAuthorName(String authorName) { this.authorName = authorName; }

    public Integer getDurationHours() { return durationHours; }
    public void setDurationHours(Integer durationHours) { this.durationHours = durationHours; }

    public Boolean getAvailability() { return availability; }
    public void setAvailability(Boolean availability) { this.availability = availability; }
}
