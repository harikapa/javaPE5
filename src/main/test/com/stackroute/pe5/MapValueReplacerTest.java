package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapValueReplacerTest {


    public static MapValueReplacer mapValueReplacer;

    @BeforeClass
    public static void setUp()
    {
        mapValueReplacer = new MapValueReplacer();
    }

    @AfterClass
    public static void tearDown()
    {
        mapValueReplacer = null;
    }

    @Test
    public void givenMapShouldReturnReplacedMap()
    {
        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("val1","java");
        inputMap.put("val2","python");
        inputMap.put("val3","spring");

        Map<String,String> resultMap = new HashMap<>();
        resultMap.put("val3","");
        resultMap.put("val2","spring");
        resultMap.put("val1","python");

        assertEquals(resultMap, mapValueReplacer.replaceMapValues(inputMap));
    }

    @Test
    public void givenMapWithDifferentShouldReturnReplacedMap()
    {
        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("1","111");
        inputMap.put("2","222");
        inputMap.put("3","333");

        Map<String,String> resultMap = new HashMap<>();
        resultMap.put("1","");
        resultMap.put("2","111");
        resultMap.put("3","222");

        assertEquals(resultMap, mapValueReplacer.replaceMapValues(inputMap));
    }

    @Test
    public void givenNullShouldReturnNull()
    {
        assertNull(mapValueReplacer.replaceMapValues(null));
    }
}