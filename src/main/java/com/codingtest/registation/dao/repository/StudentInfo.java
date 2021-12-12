package com.codingtest.registation.dao.repository;

import com.codingtest.registation.model.Student;

import java.util.Set;

public interface StudentInfo {
    Long getStudentId();

    String getStudentName();

    String getMobileNumber();

    String getAddress();

    Set<CourseInfo> getCourses();

    interface CourseInfo {
        Long getCourseId();

        String getCourseName();

        String getCourseDetails();

        String getCourseDuration();

        Set<Student> getStudents();
    }
}
