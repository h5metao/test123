package org.example.Animals;

abstract class Animal implements AnimalsInterface {
    private static int count = 0;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected String name;
    protected String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;

        setId(++count);
    }



    abstract void move();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




}
