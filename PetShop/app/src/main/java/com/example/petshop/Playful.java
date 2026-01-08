package com.example.petshop;
import java.util.Date;
public class Playful extends Mood{
    public Playful(){
        super();
    }
    public Playful(Date dateArg){
        super(dateArg);
    }

    @Override
    public String emote() {
        return "*jumping energetically*";
    }
}
