package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NoiseMakerTest {

    private NoiseMaker tractor;
    private NoiseMaker horse;

    @BeforeEach
    public void setUp(){
        tractor = new Tractor();
        horse = new Horse();
    }

    //Test Tractor's ability to makeNoise()
    @Test
    public void TestTractorNoise(){
        //Given
        String expected = "Vroom";

        //When
        String actual = tractor.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestHorseNoise(){
        //Given
        String expected = "Neigh!";

        //When
        String actual = horse.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
