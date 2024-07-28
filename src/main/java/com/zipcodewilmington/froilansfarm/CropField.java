package com.zipcodewilmington.froilansfarm;


import java.util.ArrayList;

public class CropField {

    ArrayList<CropRow> cropRows = new ArrayList<>();

    public void addCropRow(CropRow cropRow){
        cropRows.add(cropRow);
    }
}
