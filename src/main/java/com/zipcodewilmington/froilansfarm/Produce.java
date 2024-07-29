package com.zipcodewilmington.froilansfarm;

public interface Produce {
    boolean fertilize();

    boolean hasBeenHarvested();




    Edible yields(Crop crop);
}
