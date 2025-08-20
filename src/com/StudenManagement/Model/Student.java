package com.StudenManagement.Model;

public class Student {
    private int id;
    private String Name;
    private int age;
    private String Dept;
    private double marks;

    public Student(String name, int id, int age, String dept, double marks) {
        Name = name;
        this.id = id;
        this.age = age;
        Dept = dept;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + "\t" +Name + "\t" + age + "\t"+ Dept + "\t"+ marks;

    }

}
