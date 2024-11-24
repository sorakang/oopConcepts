package com.example.main;

import java.util.ArrayList;

class Student {
  private String name;
  private int grade;
  private ArrayList<String> courses = new ArrayList<>();

  Student(String name, int grade) {
    this.name = name;
    this.grade = grade;
  }

  String getName() {
    return name;
  }

  void setName(String name) {
    this.name = name;
  }

  int getGrade() {
    return grade;
  }

  void setGrade(int grade) {
    this.grade = grade;
  }

  void addCourse(String course) {
    courses.add(course);
  }

  void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("Grade: " + grade);
    System.out.println("Courses:");
    for (String course : courses) {
      System.out.println(course);
    }
  }
}

public class Encapsulation {
  public static void main(String[] args) {
    Student student1 = new Student("Alice", 12);
    student1.addCourse("Math");
    student1.addCourse("Science");
    student1.addCourse("History");
    student1.printDetails(); // Name: Alice, Grade: 12, Courses: Math, Science, History

    Student student2 = new Student("Bob", 11);
    student2.addCourse("English");
    student2.addCourse("Art");
    student2.addCourse("Music");
    student2.printDetails(); // Name: Bob, Grade: 11, Courses: English, Art, Music

    Student student3 = new Student("Charlie", 10);
    student3.setName("David");
    student3.setGrade(9);
    student3.addCourse("Spanish");
    student3.addCourse("Dance");
    student3.addCourse("Gym");
    student3.printDetails(); // Name: David, Grade: 9, Courses: Spanish, Dance, Gym
  }
}
