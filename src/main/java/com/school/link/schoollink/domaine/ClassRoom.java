package com.school.link.schoollink.domaine;



import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="class_room")
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public List<SchoolLinkUser> getStudents() {
        return students;
    }

    public void setStudents(List<SchoolLinkUser> students) {
        this.students = students;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany
    private List<SchoolLinkUser> students;

}
