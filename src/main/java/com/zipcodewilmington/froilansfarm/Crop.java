package com.zipcodewilmington.froilansfarm;

public class Crop implements Produce {
    @Override
    public boolean fertilize() {
        return true;
    }

    @Override
    public boolean hasBeenHarvested() {
        Crop crop = new EarCorn();
        Tractor tractor = new Tractor();


        if (tractor.getCropArrayList().size() >= 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean yeilds(Crop crop) {
        return false;
    }
//    @Override
//    public void yeilds(Crop crop) {
//        Crop tomatoPlant = new TomatoPlant();
//        TomatoPlant tomato = new Tomato();
//
//        tomatoPlant.equals(tomato);
//    }
}
