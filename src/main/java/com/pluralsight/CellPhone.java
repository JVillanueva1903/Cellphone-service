package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private CellPhone.String owner;

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    private void setModel(String iPhoneX) {

    }

    private class String {
    }
}
public class CellPhone {

    private static java.lang.Object System
            ;
    // Data members (properties)
    private int serialNumber;      // 1000000 - 9999999
    private String model;          // ex: iPhone X
    private String carrier;        // ex: AT&T
    private String phoneNumber;    // ex: 800-555-5555
    private String owner;          // ex: Dana Wyatt

    // Parameterless constructor with default values
    public CellPhone() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    // Getter and Setter methods

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // Demo to show it working
    public static void main(String[] args) {

        // Create a CellPhone object using the parameterless constructor
        CellPhone myPhone = new CellPhone();

        // Set values using setter methods
        myPhone.setSerialNumber(1234567);
        myPhone.setModel("iPhone X");
        myPhone.setCarrier("AT&T");
        myPhone.setPhoneNumber("800-555-5555");
        myPhone.setOwner("Dana Wyatt");

        // Print values using getter methods
        System.out.println("Cell Phone Information:");
        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());
    }

    private class String {
    }
}