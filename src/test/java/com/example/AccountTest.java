package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTest {
    private final String fio;
    private final boolean expected;

    public AccountTest(String fio, boolean expected) {
        this.fio = fio;
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static Object[][] dataForTest() {
        return new Object[][]{
                {"Тимоти Шаламе", true},
                {"Тимоти  Шаламе", false},
                {"  Тимоти Шаламе ", false},
                {"Т Ш", true}, //3
                {"Тимоти Шаламеблабла", true}, //19
                {"Т ", false}, //2
                {"Тимотиииии Шаламеееее", false}, //21
                {"Тимоти", false},
                {"", false},
                {"     ", false},
        };
    }

    @Test
    public void verifyAccountCheckNameToEmboss(){
        Account account = new Account(fio);
        Assert.assertEquals(expected, account.checkNameToEmboss());

    }
}
