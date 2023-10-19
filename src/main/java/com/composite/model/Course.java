package com.composite.model;

import com.composite.model.id.CourseId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "COURSE")
public class Course {

    @EmbeddedId
    private CourseId id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "TEACHER_ID")
    private Teacher teacher;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "COURSE_STUDENT",
            joinColumns = {
                @JoinColumn(name = "COURSE_ID"),
                @JoinColumn(name = "COURSE_NUMBER_ID")
            },
            inverseJoinColumns = {@JoinColumn(name = "STUDENT_ID")}
    )
    private List<Student> students;

    @Column(name = "COURSE_NAME")
    private String name;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "DEPARTAMENT_CODE")
    private Long departmentCode;


}
