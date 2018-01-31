package com.jogi.bidirection;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int studentId;
    @Column
    private String name;
    @Column
    private String phone;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "courseId")
    private Course courseId;


    public Student(){}
    Student(String name,String phone)
    {
        this.name=name;
        this.phone=phone;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
    }
}
