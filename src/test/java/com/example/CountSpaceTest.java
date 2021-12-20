package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CountSpaceTest {

    private final String fio;
    private final int expected;

    public CountSpaceTest(String fio, int expected) {
        this.fio = fio;
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static Object[][] dataForTest() {
        return new Object[][]{
                {"Тимоти Шаламе", 1},
                {"Тимоти  Шаламе", 2},
                {"", 0},
                {"ТШ", 0}, //3
                {"  Тимоти  Шаламе  ", 6},
        };
    }

    @Test
    public void verifyAccountCheckNameToEmboss(){
        Assert.assertEquals(expected, Account.countSpace(fio));
    }

}
