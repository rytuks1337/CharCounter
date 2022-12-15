package com.example.charcounter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void calculateWordsWithSpace() {
        final String starting_text="Hello World I am creator";
        final String expected_result= "5";
        assertEquals(expected_result,calculations.calcWords(starting_text));
    }
    @Test
    public void calculateOneWord() {
        final String starting_text="Megatastic";
        final String expected_result= "1";
        assertEquals(expected_result,calculations.calcWords(starting_text));
    }
    @Test
    public void calculateWordsWithExtraSpacesAndNumbersAndSpecialCharacters() {
        final String starting_text="Nothing    is true, everything  is perm$tted.";
        final String expected_result= "6";
        assertEquals(expected_result,calculations.calcWords(starting_text));
    }
    @Test
    public void calculateWordsWithNumbers() {
        final String starting_text="Player FalcCon45 has entered the Game";
        final String expected_result= "6";
        assertEquals(expected_result,calculations.calcWords(starting_text));
    }
    @Test
    public void calculateCharsWithSpacesAndSpecialCharacters() {
        final String starting_text="I am the one who knocks!";
        final String expected_result= "24";
        assertEquals(expected_result,calculations.calcChars(starting_text));
    }
}