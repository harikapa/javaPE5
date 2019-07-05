package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapValueReplacer {

    public MapValueReplacer()
    {

    }

    public Map<String,String> replaceMapValues(Map<String,String> inputMap)
    {
        if(inputMap != null) {

            Iterator<Map.Entry<String, String>> iterator = inputMap.entrySet().iterator();

            String tempValue1 = "";
            String tempValue2 = "";

            while (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                tempValue2 = entry.getValue();
                inputMap.replace(entry.getKey(), tempValue1);
                tempValue1 = tempValue2;
            }
        }

        return inputMap;
    }
}
