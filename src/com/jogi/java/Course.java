package com.jogi.java;

import javax.persistence.*;

@Entity
@Table(name="course")
public class Course {


    Course(){}

    Course(String courseName,int duration)
    {
        this.courseName=courseName;
        this.duration=duration;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="courseId")
    private int courseId;

    @Column(name="CourseName")
    private String courseName;

    @Column(name="Duration")
    private int duration;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
