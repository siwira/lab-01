package com.example.petshop;

import java.util.Date;

public class Sleepy extends Mood{
    public Sleepy(){
        super();
    }
    public Sleepy(Date dateArg){
        super(dateArg);
    }

    @Override
    public String emote() {
        return "*faints*";
    }
}
