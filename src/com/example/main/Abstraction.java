package com.example.main;

import com.example.interfaces.Moveable;

abstract class Human implements Moveable {
  String name;
  int age;

  abstract void printHumanInfo();
}

class Baby extends Human {
  Baby(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  void printHumanInfo() {
    System.out.println(name + " is " + age + " years old");
  }

  public void go() {
    System.out.println(name + " is crawling");
  }
}

class Vehicle implements Moveable {
  String make;
  String model;

  void printVehicleInfo() {
    System.out.println("The vehicle is a " + make + " " + model);
  }

  public void go() {
    System.out.println("Driving");
  }

  public void stop() {
    System.out.println("Braking");
  }
}

class Car extends Vehicle {
  Car(String make, String model) {
    this.make = make;
    this.model = model;
  }

  public void printVehicleInfo() {
    System.out.println("The car is a " + make + " " + model);
  }
}

public class Abstraction {
  public static void main(String[] args) {
    Baby baby1 = new Baby("Thomas", 1);
    Baby baby2 = new Baby("Sally", 2);
    baby1.printHumanInfo(); // Thomas is 1 years old
    baby1.go();             // Thomas is crawling
    baby1.stop();           // Stopping
    baby2.printHumanInfo(); // Sally is 2 years old
    baby2.go();             // Sally is crawling
    baby2.stop();           // Stopping

    Car car1 = new Car("Toyota", "Corolla");
    Car car2 = new Car("Honda", "Civic");
    car1.printVehicleInfo();  // The car is a Toyota Corolla
    car1.go();                // Driving
    car1.stop();              // Braking
    car2.printVehicleInfo();  // The car is a Honda Civic
    car2.go();                // Driving
    car2.stop();              // Braking
  }
}
