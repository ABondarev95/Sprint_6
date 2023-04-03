package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class LionModuleTest {
    @Spy
    Feline feline;

    @Test
    public void getKittensTest(){
        Lion lion = new Lion(feline);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFood() {
        Lion lion = new Lion(feline);
        try {
            Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),lion.getFood());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}