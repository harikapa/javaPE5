package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayListReplacerTest {

    public static ArrayListReplacer arrayListReplacer;

    @BeforeClass
    public static void setUp()
    {
        arrayListReplacer = new ArrayListReplacer();
    }

    @AfterClass
    public static void tearDown()
    {
        arrayListReplacer = null;
    }

    @Test
    public void givenListShouldReturnReplacedList()
    {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("html");
        list.add("css");

        List<String> result = new ArrayList<>();
        result.add("python");
        result.add("html");
        result.add("css");

        assertEquals(result, arrayListReplacer.replaceArrayList(list, "python",0));
    }

    @Test
    public void givenListShouldReturnClearList()
    {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("html");
        list.add("css");

        List<String> resultList = new ArrayList<>();
        resultList.clear();

        assertEquals(resultList, arrayListReplacer.clearArrayList(list));
    }

    @Test
    public void givenNullShouldReturnErrorList()
    {
        List<String> resultList = new ArrayList<>();

        resultList.add("list should not be null");

        assertEquals(resultList, arrayListReplacer.replaceArrayList(null, "python",1));
    }


    @Test
    public void givenNullShouldReturnErrorListCallingClearMethod()
    {
        List<String> resultList = new ArrayList<>();

        resultList.add("list should not be null");

        assertEquals(resultList, arrayListReplacer.clearArrayList(null));
    }

    @Test
    public void givenListWithOutOfRangeIndexShouldReturnNull()
    {
        List<String> list = new ArrayList<>();

        list.add("one");

        assertNull(arrayListReplacer.replaceArrayList(list, "python",10));
    }

}