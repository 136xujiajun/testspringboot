package com;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestURL {
    public static void main(String[] args) throws IOException {
        String url = "http://ip:port/cip-cas/search";
        String sendData = "{\"appId\":\"***\",\"contentName\":\"人民的名义\",\"equipmentId\":\"***\",\"requestSeq\":\"***\",\"requestType\":\"1\",\"userId\":\"***\"}";
        StringBuilder resultBuilder = new StringBuilder();
        Map<String,String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json; charset=utf-8");
//        UrlConnectionHelper.post(url, sendData, "UTF-8", 8000, headers, resultBuilder);
        System.out.println(resultBuilder.toString());
    }
}
