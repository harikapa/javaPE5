package com.stackroute.pe5;

//Write a Java program to update specific array element by given element and empty the ​ array list​ .
//Input: [Apple, Grape, Melon, Berry]
//Output: [Kiwi, Grape, Mango, Berry]

import java.util.ArrayList;
import java.util.List;

public class ArrayListReplacer {

    public ArrayListReplacer()
    {

    }

    public List<String> replaceArrayList(List<String> arrayList, String replaceString, int index)
    {
        try {
            List<String> resultList = new ArrayList<>();

            if (arrayList != null) {

                resultList = arrayList; // assigning the list

                resultList.set(index, replaceString); //replace specific index

            } else {

                resultList.add("list should not be null");
            }

            return resultList;
        }
        catch (Exception exception)
        {
            return null;
        }
    }

    public List<String> clearArrayList(List<String> arrayList)
    {
        List<String> resultList = new ArrayList<>();

        if(arrayList != null) {

            resultList = arrayList;

            resultList.clear(); //clear the list
        }
        else
        {
            resultList.add("list should not be null");
        }

        return resultList;
    }
}
