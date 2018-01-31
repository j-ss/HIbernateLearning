package com.jogi.java;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="student")
public class Student implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="phone")
    private String phone;

    public Course getCourseId() {
        return CourseId;
    }

    public void setCourseId(Course courseId) {
        this.CourseId = courseId;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CourseId")
    private Course CourseId;
    Student()
    {

    }

    Student(String name,String phone)
    {
        this.name=name;
        this.phone=phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
