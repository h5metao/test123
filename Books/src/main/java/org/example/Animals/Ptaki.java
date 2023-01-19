package org.example.Animals;

public class Ptaki extends Animal {

    public String getPalce() {
        return palce;
    }

    public void setPalce(String palce) {
        this.palce = palce;
    }

    private String palce;


    public Ptaki(String name, String color, String palce) {
        super(name, color);
        this.palce = palce;
    }

    @Override
    void move() {
        System.out.println("Rusz się");
    }

    @Override
    public void eat() {
        System.out.println("Zjedz jedzenie");
    }

    @Override
    public void sleep() {
        System.out.println("Idz spać");
    }
    @Override
    public String toString() {
        return name +  color + palce;
    }


}
