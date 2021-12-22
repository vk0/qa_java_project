package com.example;

import java.util.regex.Pattern;

public class Praktikum {
    public static void main(String[] args) {
        String fio = "Тимоти Шаламе";
        Account account = new Account(fio);
        System.out.println(account.checkNameToEmboss());
    }
}
