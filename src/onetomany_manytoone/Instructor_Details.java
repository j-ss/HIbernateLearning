package onetomany_manytoone;

import javax.persistence.*;

@Entity
@Table(name="instructorDetails")
public class Instructor_Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "channel")
    private String channel;
    @Column(name ="hobby")
    private String hobby;


    @OneToOne(mappedBy = "instructionDetails",cascade = CascadeType.ALL)
    private Instructor instructor;

    @Override
    public String toString() {
        return "Instructor_Details{" +
                "id=" + id +
                ", channel='" + channel + '\'' +
                ", hobby='" + hobby +
                '}';
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    Instructor_Details(){}

    public Instructor_Details(String channel, String hobby) {
        this.channel = channel;
        this.hobby = hobby;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
