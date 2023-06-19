package com.example.studentmanagementportal;

public class Student {

   private String name;
  private   int age;
   private int admnno;
  private String course;

    public Student() {
    }

    public Student(String name, int age, int admnno, String course) {
        this.name = name;
        this.age = age;
        this.admnno = admnno;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAdmnno() {
        return admnno;
    }

    public void setAdmnno(int admnno) {
        this.admnno = admnno;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", admnno=" + admnno +
                ", course='" + course + '\'' +
                '}';
    }
}
