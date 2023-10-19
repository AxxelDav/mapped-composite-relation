package com.composite.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TEACHER")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TEACHER_ID", nullable = false)
    private Long id;

    @OneToMany(mappedBy = "teacher")
    private List<Course> courses;

    @Column(name = "TEACHER_NAME")
    private String name;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "PHONE_NUMBER")
    private Integer phoneNumber;

    @Column(name = "EMAIL")
    private String email;

}
