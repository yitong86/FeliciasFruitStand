package com.sophia;

public class Fruit {
    private String name;
    private double price;
public Fruit(String name,double price) {
    this.name = name;
    this.price = price;
}
    @Override
    public String toString() {
        System.out.println("This is a " + this.name+" and it costs" +this.price);
        return "This is a" +this.name+ " and it costs " +this.price;
}
//System.out.println(fruit.toString());
}
