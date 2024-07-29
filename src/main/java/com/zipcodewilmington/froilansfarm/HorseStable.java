package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class HorseStable extends Shelter {

    private String name;
    private ArrayList<Horse> horseList = new ArrayList<Horse>();

    public HorseStable() {
    }

    public HorseStable(String horseyCity) {

    }

    public void addHorse(Horse horse) {
        horseList.add(horse);
    }

    public Horse getHorse(String s) {
        return horseList.get(0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}