package com.example;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        boolean result = true;

        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        String finalName = name.trim();
        if (finalName.length()<3 || finalName.length()>19) result = false;
        if (countSpace(finalName)!=1) result = false;
        return result;
    }

    public static int countSpace(String s){
        String text;
        int let = 0;
        int dig = 0;
        int space= 0;

        char[]arr=s.toCharArray();

        for(int i=0;i<s.length();i++) {
            if (Character.isDigit(arr[i])) {
                dig++;
            } else if (Character.isLetter(arr[i])) {
                let++;
            } else if (Character.isWhitespace(arr[i])) {
                space++;
            }
        }
        return space;
    }

}
