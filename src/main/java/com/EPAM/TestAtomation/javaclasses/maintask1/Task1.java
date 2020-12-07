package com.EPAM.TestAtomation.javaclasses.maintask1;

import java.time.LocalDate;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        Student[] students = generateStudents();

        List<Student> filteredStudentsByFaculty = StudentFilter.filterByFaculty(students,"Economic");

        List<Student> filteredStudentsByFacultyandCourse = StudentFilter.sortByFacultyAndCourse(students);

        List<Student> filteredStudentsByDate = StudentFilter.filterByBirthdayIsAfter(
                students, LocalDate.of(1991, 3, 1));

        List<Student> filteredStudentsByGroup = StudentFilter.filterByGroup(students,203);



        printStudent(filteredStudentsByFaculty);
        System.out.println();
        printStudent(filteredStudentsByDate);
        System.out.println();
        printStudent(filteredStudentsByFacultyandCourse);
        System.out.println();
        printStudent(filteredStudentsByGroup);
    }

    public static void printStudent(List<Student> students)
    {
        for (Student student : students)
        {
            System.out.println(student);
        }
    }

    public static Student[] generateStudents()
    {
        Student petya = new Student(1, "Волков", "Петя", "Владимирович",
                LocalDate.of(1990, 3, 30), "Минск", 337720362, "Economic",
                3, 301);
        Student vasya = new Student(2, "Иванов", "Вася", "Петрович",
                LocalDate.of(1992, 6, 1), "Брест", 295437655, "Law",
                2, 203);
        Student kolya = new Student(3, "Марков", "Коля", "Степанович",
                LocalDate.of(1993, 8, 5), "Гродно", 445498650, "Law",
                1, 215);
        Student gleb = new Student(4, "Громов", "Глеб", "Михайлович",
                LocalDate.of(1990, 10, 24), "Гомель", 259720365, "Economic",
                3, 301);
        Student katya = new Student(5, "Новикова", "Катя", "Андреева",
                LocalDate.of(1993, 9, 1), "Витебск", 442398650, "Law",
                2, 203);

        Student[] students = new Student[5];
        students[0] = petya;
        students[1] = vasya;
        students[2] = kolya;
        students[3] = gleb;
        students[4] = katya;

        return students;
    }
}
