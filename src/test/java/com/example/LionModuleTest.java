package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


@RunWith(MockitoJUnitRunner.class)
public class LionModuleTest {
    @Spy
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самка",feline);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void getLionFoodTest() throws Exception {
        Lion lion = new Lion("Самка",feline);
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),lion.getFood());
    }

    @Test
    public void anotherSexOfLionTest() {
        Exception e = assertThrows(Exception.class, () -> new Lion("Тест", feline));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
    }
}