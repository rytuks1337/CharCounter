package com.example.charcounter;

public class calculations {
    public static String calcWords(String text){
        int temp=1;
        for(int i=0;i<text.length();i++) {
            if (text.charAt(i) == ' ' || text.charAt(i) == '.' || text.charAt(i) == ',') {
                temp++;
                while(text.charAt(i+1)==' ' || text.charAt(i) == '.' || text.charAt(i) == ',') {
                    i++;
                }
            }
        }
        return String.valueOf(temp);
    }
    public static String calcChars(String text){

        return String.valueOf(text.length());
    }
}
