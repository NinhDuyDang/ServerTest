package com.example.severtest.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ScoreService {
    private final Map<String, Map<String, Object>> fakeData = new HashMap<>();

    public ScoreService() {
        Map<String, Object> score1 = new HashMap<>();
        score1.put("is_open", true);
        score1.put("quality", 1);

        Map<String, Object> score2 = new HashMap<>();
        score2.put("is_open", false);
        score2.put("quality", 0);
        fakeData.put("123", score1);
        fakeData.put("456", score2);

    }
    public boolean isScoreOpen(String scoreCode) {
        Map<String, Object> score = fakeData.get(scoreCode);
        if (score != null && (int) score.get("quality") == 1) {
            return (boolean) score.get("is_open");
        }
        return false;
    }
}
