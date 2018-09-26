package com.algorithm.problems;

import com.utils.json.CompareJson;
import org.json.JSONObject;

public class JsonCompareTest {

    public static void main (String[] args){
        String jsonObject1 = "{\"status\":\"Bad Request\",\"error\":\"header is missing/invalid\"," +
                "\"data\":null}";
        String jsonObject2 ="{\"status\":\"Bad Request\",\"error\":\"header is missing/invalid\"," +
                "\"data\":null}";
        CompareJson.execute(jsonObject1, jsonObject2, true);
    }
}
