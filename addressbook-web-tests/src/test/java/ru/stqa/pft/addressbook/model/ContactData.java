package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String name;
  private final String surname;
  private final String position;
  private final String company;
  private final String address;
  private final String phone;
  private final String email;
  private final String day;
  private final String month;
  private final String year;

  public ContactData(String name, String surname, String position, String company, String address, String phone, String email, String day, String month, String year) {
    this.name = name;
    this.surname = surname;
    this.position = position;
    this.company = company;
    this.address = address;
    this.phone = phone;
    this.email = email;
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getPosition() {
    return position;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getPhone() {
    return phone;
  }

  public String getEmail() {
    return email;
  }

  public String getDay() {
    return day;
  }

  public String getMonth() {
    return month;
  }

  public String getYear() {
    return year;
  }
}
