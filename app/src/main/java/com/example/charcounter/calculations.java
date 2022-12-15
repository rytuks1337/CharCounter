package com.example.charcounter;

import android.icu.text.SymbolTable;

import java.util.Objects;

public class calculations {
    public static String calcWords(String text){
        int temp=0;
        String[] words =text.trim().split("\\s+");
        return Integer.toString(words.length);

    }
    public static String calcChars(String text){

        return String.valueOf(text.length());
    }
}
