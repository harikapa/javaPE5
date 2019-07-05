package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordFrequencyTest {

    public static WordFrequency wordFrequency;

    @BeforeClass
    public static void setUp()
    {
        wordFrequency = new WordFrequency();
    }

    @AfterClass
    public static void tearDown()
    {
        wordFrequency = null;
    }

    @Test
    public void givenStringShouldReturnMap()
    {
        Map<String, Long> result = new HashMap<>();

        result.put("one", Long.valueOf(5));
        result.put("two", Long.valueOf(2));
        result.put("three", Long.valueOf(2));

        assertEquals(result, wordFrequency.findWordFrequency("one one -one___two,,three,one @three*one?two"));

    }

    @Test
    public void givenEmptyStringShouldReturnNull()
    {
        assertNull(wordFrequency.findWordFrequency(""));

    }

    @Test
    public void givenNullShouldReturnNull()
    {
        assertNull(wordFrequency.findWordFrequency(null));

    }

    @Test
    public void givenNumberStringShouldReturnMap()
    {
        Map<String, Long> result = new HashMap<>();

        result.put("123", Long.valueOf(3));
        result.put("456", Long.valueOf(1));

        assertEquals(result, wordFrequency.findWordFrequency("123 123-456@123"));

    }



}