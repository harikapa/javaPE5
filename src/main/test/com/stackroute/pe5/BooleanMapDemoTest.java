package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BooleanMapDemoTest {

    public static BooleanMapDemo booleanMapDemo;

    @BeforeClass
    public static void setUp()
    {
        booleanMapDemo = new BooleanMapDemo();
    }

    @AfterClass
    public static void tearDown()
    {
        booleanMapDemo = null;
    }

    @Test
    public void givenNullShouldReturnBooleanMap()
    {
        assertNull(booleanMapDemo.getBooleanMap(null));
    }

    @Test
    public void givenEmptyStringShouldReturnBooleanMap()
    {
        Map<String,Boolean> result = new HashMap<>();

        result.put("",false);

        assertEquals(result,booleanMapDemo.getBooleanMap(new String[] {""}));
    }


    @Test
    public void givenStringArrayShouldReturnBooleanMap()
    {
        Map<String,Boolean> result = new HashMap<>();

        result.put("harika",true);
        result.put("ibm",false);
        result.put("stackroute",false);

        assertEquals(result,booleanMapDemo.getBooleanMap(new String[] {"harika","harika","ibm","stackroute"}));
    }

    @Test
    public void givenArrayShouldReturnBooleanMap()
    {
        Map<String,Boolean> result = new HashMap<>();

        result.put("harika",true);
        result.put("ibm",false);
        result.put("stackroute",false);

        assertEquals(result,booleanMapDemo.getBooleanMap(new String[] {"harika","harika","ibm","stackroute"}));
    }

}