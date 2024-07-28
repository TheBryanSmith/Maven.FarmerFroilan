package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CropFieldTest {

    @Test
    public void addCropRow(){

       CropField cropField = new CropField();
        ArrayList<CropRow>cropLine = new ArrayList<>();

        CropRow cropRow = new CropRow();

        CropRow cropRow1 = new CropRow();
         cropLine.add(cropRow);
         cropLine.add(cropRow1);






        Assert.assertEquals(2,cropLine.size());
    }

    @Test
    public void getCropRow(){
        CropField cropField = new CropField();
        ArrayList<CropRow>cropLine = new ArrayList<>();

        CropRow cropRow = new CropRow();

        CropRow cropRow1 = new CropRow();
        cropLine.add(cropRow);
        cropLine.add(cropRow1);



        Assert.assertEquals(cropRow,cropLine.get(0));
    }

    @Test
    public void removeCropRow(){
        CropField cropField = new CropField();

        ArrayList<CropRow>cropLine = new ArrayList<>();

        CropRow cropRow = new CropRow();

        CropRow cropRow1 = new CropRow();
        cropLine.add(cropRow);
        cropLine.add(cropRow1);

        cropLine.remove(cropRow);
        cropLine.remove(cropRow1);

        Assert.assertEquals(0,cropLine.size());
    }


}
