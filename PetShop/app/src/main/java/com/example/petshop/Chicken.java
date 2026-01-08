package com.example.petshop;

import java.util.Date;

public class Chicken extends Pet implements Pettable {
    public Chicken(String name){
        super(name);
    }
    public Chicken(String name, Date birthDate){
        super(name, birthDate);
    }
    @Override
    public String speak(){
        return "Cock-a-doodle-doo"; // rooster/chicken sounds
    }

    @Override
    public void pet() { // i think you can pet a chicken, at least i have
    }
}
