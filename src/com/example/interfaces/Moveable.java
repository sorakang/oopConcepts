package com.example.interfaces;

public interface Moveable {
  void go();

  default void stop() {
    System.out.println("Stopping");
  }
}
