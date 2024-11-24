package com.example.main;

import com.example.interfaces.Moveable;

abstract class Playable {
  String name;

  Playable(String name) {
    this.name = name;
  }

  public abstract void start();

  void end() {
    System.out.println(name + " is ending");
  }
}

class Game extends Playable {
  Game(String name) {
    super(name);
  }

  @Override
  public void start() {
    System.out.println("Playing");
  }
}

class ToyCar extends Playable implements Moveable {
  ToyCar(String name) {
    super(name);
  }

  @Override
  public void start() {
    System.out.println(name + " is turning on");
  }

  public void go() {
    System.out.println(name + " is moving");
  }

  @Override
  public void end() {
    System.out.println(name + " is turning off");
  }
}

public class Inheritance {
  public static void main(String[] args) {
    Game game = new Game("Super Mario Bros");
    game.start(); // Playing
    game.end();   // Super Mario Bros is ending

    ToyCar toyCar = new ToyCar("Hot Wheels");
    toyCar.start(); // Hot Wheels is turning on
    toyCar.go();    // Hot Wheels is moving
    toyCar.stop();  // Stopping
    toyCar.end();   // Hot Wheels is turning off
  }
}
