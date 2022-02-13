package com.crychair.demo.model;

public class DnisData {

    public String name;

    public String number;

    public DnisData() {
    }

    public DnisData(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "DnisData{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
