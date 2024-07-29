package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FarmHouseTest {

    List<Person> froiboysHouse = new ArrayList<>();
    Person froiBoy = new Farmer() {
        @Override
        public String mount(Aircraft<Pilot> aircraft) {
            return "";
        }

        @Override
        public String dismount(Aircraft<Pilot> aircraft) {
            return "";
        }
    };





    @Test
    public void testFarmHouseArrayListAdd(){

        froiboysHouse.add(froiBoy);

        Assert.assertEquals(1,froiboysHouse.size());
    }

    @Test
    public void testFarmHouseArrayListRemove(){

        froiboysHouse.add(froiBoy);
        froiboysHouse.remove(0);

        Assert.assertEquals(0,froiboysHouse.size());
    }

    @Test
    public void testFarmHouseArrayListGet(){

       }


    @Test
    public void  testFarmHouseArrayListIsEmpty() {




    }


}
