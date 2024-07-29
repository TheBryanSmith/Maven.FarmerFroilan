package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class CropTest {

    @Test
    public void cropHasBeenFertilizedTest() {
        Crop tomatoPlant = new TomatoPlant();


        Assert.assertTrue(tomatoPlant.fertilize());
    }

//    @Test
//    public void hasBeenHarvestedTrueTest(){
//        Crop corn = new EarCorn();
//        Tractor tractor = new Tractor();
//
//        tractor.harvest(corn);
//
//        Assert.assertTrue(corn.hasBeenHarvested());
//    }


    //ASK what's the data type for yields

    @Test
    public void hasBeenHarvestedFalseTest() {
        Crop corn = new EarCorn();
        Tractor tractor = new Tractor();


        Assert.assertFalse(corn.hasBeenHarvested());
    }

    @Test
    public void yields() {
        Crop tomatoPlant = new TomatoPlant();


       tomatoPlant.fertilize();
       tomatoPlant.hasBeenHarvested();

            new Tomato();


        }
}
