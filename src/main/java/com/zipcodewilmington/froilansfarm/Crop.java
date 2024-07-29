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
    public Edible yields(Crop crop) {

                // Implement the logic to yield an Edible object here.
                if (crop.fertilize() && crop.hasBeenHarvested()) {
                    System.out.println("New plant has produced a tomato");
                    return new Edible();
                } else {
                    return null;
                }
        }
}
