package com.company;

import java.util.Objects;

public class Student {
    public String name;
    public String secondName;

    public Student(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name) && secondName.equals(student.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
