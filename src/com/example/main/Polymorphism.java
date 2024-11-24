package com.example.main;

import com.example.interfaces.AstrologyDates;

class AstrologyCalculator implements AstrologyDates {
  void getSign(int month, int day) {
    if (isAries(month, day)) {
        System.out.println("Aries");
    } else if (isTaurus(month, day)) {
        System.out.println("Taurus");
    } else if (isGemini(month, day)) {
        System.out.println("Gemini");
    } else if (isCancer(month, day)) {
        System.out.println("Cancer");
    } else if (isLeo(month, day)) {
        System.out.println("Leo");
    } else if (isVirgo(month, day)) {
        System.out.println("Virgo");
    } else if (isLibra(month, day)) {
        System.out.println("Libra");
    } else if (isScorpio(month, day)) {
        System.out.println("Scorpio");
    } else if (isSagittarius(month, day)) {
        System.out.println("Sagittarius");
    } else if (isCapricorn(month, day)) {
        System.out.println("Capricorn");
    } else if (isAquarius(month, day)) {
        System.out.println("Aquarius");
    } else if (isPisces(month, day)) {
        System.out.println("Pisces");
    } else {
        System.out.println("Invalid date");
    }
  }

  void getSign(String month, int day) {
    if (isAries(month, day)) {
      System.out.println("Aries");
    } else if (isTaurus(month, day)) {
      System.out.println("Taurus");
    } else if (isGemini(month, day)) {
      System.out.println("Gemini");
    } else if (isCancer(month, day)) {
      System.out.println("Cancer");
    } else if (isLeo(month, day)) {
      System.out.println("Leo");
    } else if (isVirgo(month, day)) {
      System.out.println("Virgo");
    } else if (isLibra(month, day)) {
      System.out.println("Libra");
    } else if (isScorpio(month, day)) {
      System.out.println("Scorpio");
    } else if (isSagittarius(month, day)) {
      System.out.println("Sagittarius");
    } else if (isCapricorn(month, day)) {
      System.out.println("Capricorn");
    } else if (isAquarius(month, day)) {
      System.out.println("Aquarius");
    } else if (isPisces(month, day)) {
      System.out.println("Pisces");
    } else {
      System.out.println("Invalid date");
    }
  }

  @Override
  public void getInfo() {
    System.out.println("This is Astrology Calculator. Your zodiac sign is determined by your birth month and day.");
  }
}

public class Polymorphism {
  public static void main(String[] args) {
    AstrologyCalculator calculator = new AstrologyCalculator();

    calculator.getInfo(); // This is Astrology Calculator. Your zodiac sign is determined by your birth month and day.
    calculator.getSign(3, 21);          // Aries
    calculator.getSign("march", 21);    // Aries
    calculator.getSign("January", 1);   // Capricorn
    calculator.getSign(8, 29);          // Virgo
    calculator.getSign("october", 31);  // Scorpio
    calculator.getSign("December", 21); // Sagittarius
  }
}