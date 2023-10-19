package com.composite.model.id;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CourseId implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Column(name = "COURSE_ID", nullable = false)
    private Long courseId;

    @Column(name = "COURSE_NUMBER_ID", nullable = false, length = 55)
    private String courseNumberId;
}
