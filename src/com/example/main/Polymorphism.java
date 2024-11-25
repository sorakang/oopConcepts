package com.example.main;

import java.util.ArrayList;
import java.util.List;

class AstrologyDates {
  String name;
  int startMonth;
  int startDay;
  int endMonth;
  int endDay;

  AstrologyDates(String name, int startMonth, int startDay, int endMonth, int endDay) {
    this.name = name;
    this.startMonth = startMonth;
    this.startDay = startDay;
    this.endMonth = endMonth;
    this.endDay = endDay;
  }

  boolean isDateInRange(int month, int day) {
    if (month == startMonth && day >= startDay && day <= 31) {
      return true;
    } else if (month == endMonth && day <= endDay) {
      return true;
    } else if (month > startMonth && month < endMonth) {
      return true;
    } else {
      return false;
    }
  }
}

class MonthConverter {
  int convertMonthToInt(String month) {
    switch (month.toLowerCase()) {
      case "january":
        return 1;
      case "february":
        return 2;
      case "march":
        return 3;
      case "april":
        return 4;
      case "may":
        return 5;
      case "june":
        return 6;
      case "july":
        return 7;
      case "august":
        return 8;
      case "september":
        return 9;
      case "october":
        return 10;
      case "november":
        return 11;
      case "december":
        return 12;
      default:
        throw new IllegalArgumentException("Invalid month: " + month);
    }
  }
}

class AstrologyCalculator {
  List<AstrologyDates> zodiacSigns;

  AstrologyCalculator() {
    zodiacSigns = new ArrayList<>();
    zodiacSigns.add(new AstrologyDates("Aries", 3, 21, 4, 19));
    zodiacSigns.add(new AstrologyDates("Taurus", 4, 20, 5, 20));
    zodiacSigns.add(new AstrologyDates("Gemini", 5, 21, 6, 21));
    zodiacSigns.add(new AstrologyDates("Cancer", 6, 22, 7, 22));
    zodiacSigns.add(new AstrologyDates("Leo", 7, 23, 8, 22));
    zodiacSigns.add(new AstrologyDates("Virgo", 8, 23, 9, 22));
    zodiacSigns.add(new AstrologyDates("Libra", 9, 23, 10, 23));
    zodiacSigns.add(new AstrologyDates("Scorpio", 10, 24, 11, 21));
    zodiacSigns.add(new AstrologyDates("Sagittarius", 11, 22, 12, 21));
    zodiacSigns.add(new AstrologyDates("Capricorn", 12, 22, 1, 19));
    zodiacSigns.add(new AstrologyDates("Aquarius", 1, 20, 2, 18));
    zodiacSigns.add(new AstrologyDates("Pisces", 2, 19, 3, 20));
  }

  void getSign(int month, int day) {
    for (AstrologyDates sign : zodiacSigns) {
      if (sign.isDateInRange(month, day)) {
        System.out.println(sign.name);
        return;
      }
    }
    System.out.println("Invalid date");
  }

  void getSign(String month, int day) {
    MonthConverter converter = new MonthConverter();
    int monthInt = converter.convertMonthToInt(month);
    for (AstrologyDates sign : zodiacSigns) {
      if (sign.isDateInRange(monthInt, day)) {
        System.out.println(sign.name);
        return;
      }
    }
    System.out.println("Invalid date");
  }

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