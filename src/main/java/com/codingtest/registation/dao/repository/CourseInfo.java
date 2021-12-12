package com.codingtest.registation.dao.repository;

import com.codingtest.registation.model.Course;

import java.util.Set;

public interface CourseInfo {
    Long getCourseId();

    String getCourseName();

    String getCourseDetails();

    String getCourseDuration();

    Set<StudentInfo> getStudents();

    interface StudentInfo {
        Long getStudentId();

        String getStudentName();

        String getMobileNumber();

        String getAddress();

        Set<Course> getCourses();
    }
}
