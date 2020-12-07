package com.EPAM.TestAtomation.javaclasses.maintask1;

import java.time.LocalDate;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private LocalDate birthday;
    private String address;
    private int phoneNumber;
    private String faculty;
    private int course;
    private int group;

    public Student(String surname, String name, String faculty, int course, int group) {
        this.surname = surname;
        this.name = name;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(int id, String surname, String name, String middleName, LocalDate birthday, String address,
                   int phoneNumber, String faculty, int course, int group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() { return faculty; }

    public void setFaculty(String faculty) { this.faculty = faculty; }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}
