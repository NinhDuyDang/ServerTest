package com.example.severtest.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StoreService {
    private final Map<String, Map<String, Object>> fakeData = new HashMap<>();

    public StoreService() {
        Map<String, Object> store1 = new HashMap<>();
        store1.put("is_open", true);
        store1.put("quality", 1);

        Map<String, Object> store2 = new HashMap<>();
        store2.put("is_open", true);
        store2.put("quality", 1);

        Map<String,Object> store3 = new HashMap<>();
        store3.put("is_open", false);
        store3.put("quality", 0);

        Map<String,Object> store4 = new HashMap<>();
        store4.put("is_open", false);
        store4.put("quality", 0);

        fakeData.put("10", store1);
        fakeData.put("11", store2);
        fakeData.put("12", store3);
        fakeData.put("13", store4);

    }
    public boolean isScoreOpen(String storeCode) {
        Map<String, Object> stcore = fakeData.get(storeCode);
        if (stcore != null && (int) stcore.get("quality") == 1) {
            return (boolean) stcore.get("is_open");
        }
        return false;
    }
}
