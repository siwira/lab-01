package com.example.petshop;

import java.util.Date;

public class Monkey extends Pet{
    public Monkey(String name){
        super(name);
    }
    public Monkey(String name, Date birthDate){
        super(name, birthDate);
    }
    @Override
    public String speak(){
        return "oo oo ah ah"; // monkey sounds
    }
}
