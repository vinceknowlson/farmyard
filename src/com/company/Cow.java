package com.company;

public class Cow extends Animal {

    private String lastFed;

    public Cow(String name, int age, String breed, String lastFed) {
        super(name, age, breed);
        this.lastFed = lastFed;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", lastFed='" + lastFed + '\'' +
                '}';
    }

    public String getLastFed() {
        return lastFed;
    }

    public void setLastFed(String lastFed) {
        this.lastFed = lastFed;
    }
}
