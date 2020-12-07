package com.EPAM.TestAtomation.javaclasses.maintask1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentFilter {

    public static List<Student> filterByFaculty (Student[] students, String faculty) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students){
            if (student.getFaculty().equals(faculty))
            {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }

    public static List<Student> sortByFacultyAndCourse(Student[] students) {

        List<Student> studentList = Arrays.asList(students);

        Comparator<Student> studentComparator = Comparator.comparing(Student::getFaculty)
                .thenComparing(Student::getCourse);

        studentList.sort(studentComparator);
        return studentList;
    }

    public static List<Student> filterByBirthdayIsAfter(Student[] students, LocalDate date){
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students){
            if(student.getBirthday().isAfter(date))
            {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }
    public static List<Student> filterByGroup (Student[] students, int group) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students){
            if (student.getGroup() == group)
            {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }
}
