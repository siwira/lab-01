package com.example.petshop;

import java.util.Date;

public class Falcon extends Pet {
    public Falcon(String name){
        super(name);
    }
    public Falcon(String name, Date birthDate){
        super(name, birthDate);
    }
    @Override
    public String speak(){
        return "Kakawww"; // bird sound
    }

}
