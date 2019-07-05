package com.stackroute.pe5;

//Write a program where an array of strings is input and output is a Map<​ String​ ,boolean> where
//each different ​ string​ is a key and its value is true if that ​ string​ appears 2 or more times in the array
//Input :​ ​ String​ arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
//Output - {“a” : true,”b” :false ,”c” :true,”d” : false}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class BooleanMapDemo {

    public BooleanMapDemo()
    {

    }

    public Map<String, Boolean> getBooleanMap(String content[])
    {
        Map<String, Long> result;

        Map<String,Boolean> booleanMap = new HashMap<>();

        if(content != null) {

            //get word frequency by using grouping
            result = Arrays.stream(content).collect(Collectors.groupingBy(s -> s, Collectors.counting()));

            //initializing iterator for map
            Iterator<Map.Entry<String,Long>> iterator = result.entrySet().iterator();

            while (iterator.hasNext())
            {
                Map.Entry<String,Long> entry = iterator.next(); //get each entry of map

                if(entry.getValue() > 1)
                {
                    booleanMap.put(entry.getKey(),true);
                }
                else
                {
                    booleanMap.put(entry.getKey(),false);
                }
            }
        }
        else
        {
            booleanMap = null;
        }

        return booleanMap;

    }

}
