package com.vls.cart.model;

/** Simple cart item kept in memory (no DB). */
public class CartModel {
    private Integer courseId;
    private String courseName;
    private String authorName;
    private Integer durationHours;

    public CartModel() {}

    public CartModel(Integer courseId, String courseName, String authorName, Integer durationHours) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.authorName = authorName;
        this.durationHours = durationHours;
    }

    public Integer getCourseId() { return courseId; }
    public void setCourseId(Integer courseId) { this.courseId = courseId; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public String getAuthorName() { return authorName; }
    public void setAuthorName(String authorName) { this.authorName = authorName; }

    public Integer getDurationHours() { return durationHours; }
    public void setDurationHours(Integer durationHours) { this.durationHours = durationHours; }
}
