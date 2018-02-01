package onetomany_manytoone;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="instructor")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="instruction_detail_Id")
    private Instructor_Details instructionDetails;

    @OneToMany
            (mappedBy = "instructor",cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    private List<Course> courses;

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email +
                '}';
    }

    public Instructor(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Instructor() {
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Instructor_Details getInstructionDetails() {
        return instructionDetails;
    }

    public void setInstructionDetails(Instructor_Details instructionDetails) {
        this.instructionDetails = instructionDetails;
    }


    public void add(Course course)
    {
        if(courses==null)
            courses=new ArrayList<Course>();
        courses.add(course);
        course.setInstructor(this);
    }
}
