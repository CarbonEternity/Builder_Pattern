package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<SportCar> list = new ArrayList<>();
	   //SportCar sportCar = new SportCar.Builder("Audi R8").setColor("black").setMaxSpeed(320).build();
        list.add(new SportCar.Builder("Audi R8").setColor("black").setMaxSpeed(320).build());
        System.out.println(list);

    }
}

class SportCar{
    private String name, color;
    private int maxSpeed;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    private SportCar(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
    }

    static class Builder{
        private String name, color;
        private int maxSpeed;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public SportCar build(){
            return new SportCar(this);
        }
    }


}