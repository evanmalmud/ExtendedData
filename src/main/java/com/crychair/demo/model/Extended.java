package com.crychair.demo.model;

public class Extended<T> {

    public String name;

    public T customData;

    public Extended() {
    }

    public Extended(String name, T customData) {
        this.name = name;
        this.customData = customData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getCustomData() {
        return customData;
    }

    public void setCustomData(T customData) {
        this.customData = customData;
    }

    @Override
    public String toString() {
        return "Extended{" +
                "name='" + name + '\'' +
                ", customData=" + customData +
                '}';
    }
}
