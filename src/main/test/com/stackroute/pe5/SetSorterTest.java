package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SetSorterTest {

    public static SetSorter setSorter;

    @BeforeClass
    public static void setUp() {
        setSorter = new SetSorter();

    }

    @AfterClass
    public static void tearDown() {
        setSorter = null;
    }

    @Test
    public void givenArrayShouldReturnSortedMap() {
        ArrayList<String> result = new ArrayList<>();
        result.add("Alice");
        result.add("Harika");
        result.add("Olive");
        result.add("harry");
        assertEquals(result, setSorter.sort(new String[] {"harry","Olive","Alice","Harika"}));
    }


    @Test
    public void givenNullShouldReturnNull() {
        assertNull(setSorter.sort(null));
    }

    @Test
    public void givenIntegersArrayShouldReturnSortedMap() {
        ArrayList<String> result = new ArrayList<>();
        result.add("1");
        result.add("2");
        result.add("3");
        result.add("76");
        result.add("a");
        assertEquals(result, setSorter.sort(new String[] {"3","2","76","1","a"}));
    }


}