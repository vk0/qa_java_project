package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        return Pattern.matches("^(\\S)+(\\s{1})(\\S)+$",name.trim()) && Pattern.matches("^.{3,19}$",name.trim());
    }
}
