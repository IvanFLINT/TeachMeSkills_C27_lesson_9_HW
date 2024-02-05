package com.teachmeskills.lesson9.task_3.clients;

/**
 * The Client class contains the main client description fields
 */
public class Client {
    private String name;
    private String surName;
    private String passportId;
    private String dateOfBirth;
    private int mailId;
    private String country;
    private String sity;
    private String street;
    private int houseNumber;

    public Client(String name, String surName, String passportId, String dateOfBirth,
                  int mailId, String country, String sity, String street, int houseNumber) {
        this.name = name;
        this.surName = surName;
        this.passportId = passportId;
        this.dateOfBirth = dateOfBirth;
        this.mailId = mailId;
        this.country = country;
        this.sity = sity;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public int getMailId() {
        return mailId;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getPassportId() {
        return passportId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public String getSity() {
        return sity;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }
}
