package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class CropTest {

    @Test
    public void cropHasBeenFertilizedTest(){
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


    //ASK whats the data type for yeilds

    @Test
    public void hasBeenHarvestedFalseTest(){
        Crop corn = new EarCorn();
        Tractor tractor = new Tractor();


        Assert.assertFalse(corn.hasBeenHarvested());
    }

//    @Test
//    public void yeilds(){
//        Crop tomatoPlant = new TomatoPlant();
//        TomatoPlant tomato = new Tomato();
//
//    }
}
