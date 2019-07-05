package com.stackroute.pe5;

import java.util.*;

public class SetSorter {

    public SetSorter()
    {

    }

    public ArrayList<String> sort(String[] content)
    {
        if(content != null) {
            Set<String> inputSet = new TreeSet<>(Arrays.asList(content));
            ArrayList<String> arrayList = new ArrayList<>(inputSet);
            return arrayList;
        }
        else {
            return null;
        }

    }

}
