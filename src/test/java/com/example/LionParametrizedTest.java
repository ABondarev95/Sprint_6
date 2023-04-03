package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final String sex;
    private final boolean hasMane;

    public LionParametrizedTest(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getLionSex() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
                {"Тест", false},
        };
    }

    @Test
    public void lionMaleSexTest(){
        try {
            Lion lion = new Lion(sex);
            Assert.assertEquals(hasMane, lion.doesHaveMane());
            System.out.println("Выбран пол - " + sex);
            System.out.println("Наличие гривы = " + lion.doesHaveMane());
        } catch (Exception e) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }
}