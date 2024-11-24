package com.example.interfaces;

public interface AstrologyDates {
  void getInfo();

  default int convertMonthToInt(String month) {
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

  default Boolean isAries(int month, int day) {
    return (month == 3 && day >= 21 && day <= 31) || (month == 4 && day <= 19);
  }

  default Boolean isAries(String month, int day) {
    int monthInt = convertMonthToInt(month);
    return isAries(monthInt, day);
  }

  default Boolean isTaurus(int month, int day) {
    return (month == 4 && day >= 20 && day <= 30) || (month == 5 && day <= 20);
  }

  default Boolean isTaurus(String month, int day) {
    int monthInt = convertMonthToInt(month);
    return isTaurus(monthInt, day);
  }

  default Boolean isGemini(int month, int day) {
    return (month == 5 && day >= 21 && day <= 31) || (month == 6 && day <= 21);
  }

  default Boolean isGemini(String month, int day) {
    int monthInt = convertMonthToInt(month);
    return isGemini(monthInt, day);
  }

  default Boolean isCancer(int month, int day) {
    return (month == 6 && day >= 22 && day <= 30) || (month == 7 && day <= 22);
  }

  default Boolean isCancer(String month, int day) {
    int monthInt = convertMonthToInt(month);
    return isCancer(monthInt, day);
  }

  default Boolean isLeo(int month, int day) {
    return (month == 7 && day >= 23 && day <= 31) || (month == 8 && day <= 22);
  }

  default Boolean isLeo(String month, int day) {
    int monthInt = convertMonthToInt(month);
    return isLeo(monthInt, day);
  }

  default Boolean isVirgo(int month, int day) {
    return (month == 8 && day >= 23 && day <= 31) || (month == 9 && day <= 22);
  }

  default Boolean isVirgo(String month, int day) {
    int monthInt = convertMonthToInt(month);
    return isVirgo(monthInt, day);
  }

  default Boolean isLibra(int month, int day) {
    return (month == 9 && day >= 23 && day <= 30) || (month == 10 && day <= 23);
  }

  default Boolean isLibra(String month, int day) {
    int monthInt = convertMonthToInt(month);
    return isLibra(monthInt, day);
  }

  default Boolean isScorpio(int month, int day) {
    return (month == 10 && day >= 24 && day <= 31) || (month == 11 && day <= 21);
  }

  default Boolean isScorpio(String month, int day) {
    int monthInt = convertMonthToInt(month);
    return isScorpio(monthInt, day);
  }

  default Boolean isSagittarius(int month, int day) {
    return (month == 11 && day >= 22 && day <= 30) || (month == 12 && day <= 21);
  }

  default Boolean isSagittarius(String month, int day) {
    int monthInt = convertMonthToInt(month);
    return isSagittarius(monthInt, day);
  }

  default Boolean isCapricorn(int month, int day) {
    return (month == 12 && day >= 22 && day <= 31) || (month == 1 && day <= 19);
  }

  default Boolean isCapricorn(String month, int day) {
    int monthInt = convertMonthToInt(month);
    return isCapricorn(monthInt, day);
  }

  default Boolean isAquarius(int month, int day) {
    return (month == 1 && day >= 20 && day <= 31) || (month == 2 && day <= 18);
  }
  
  default Boolean isAquarius(String month, int day) {
    int monthInt = convertMonthToInt(month);
    return isAquarius(monthInt, day);
  }

  default Boolean isPisces(int month, int day) {
    return (month == 2 && day >= 19 && day <= 29) || (month == 3 && day <= 20);
  }

  default Boolean isPisces(String month, int day) {
    int monthInt = convertMonthToInt(month);
    return isPisces(monthInt, day);
  }
}
