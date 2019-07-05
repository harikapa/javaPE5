package com.stackroute.pe5;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {

    public WordFrequency()
    {

    }

    public Map<String, Long> findWordFrequency(String content)
    {
        Map<String, Long> result;

        if(content != null && !content.isEmpty()) {

            //replace all the special characters
            content = content.replaceAll("[^a-zA-Z0-9 ]", " ").replaceAll(" +", " ");

            //get word frequency by using grouping
            result = Arrays.stream(content.split(" ")).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        }
        else
        {
            result = null;
        }

        return result;
    }
}
