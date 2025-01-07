package com.example.severtest.controller;

import com.example.severtest.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class StoreAliveController {
    @Autowired
    private StoreService scoreService;

    @GetMapping("/u0000psr/api/isStoreAlive")
    public Boolean isStoreOpen(@RequestParam String storeCode) {
        return scoreService.isScoreOpen(storeCode);
    }
}
