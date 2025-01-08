package com.example.severtest.controller;

import com.example.severtest.service.TransferPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController("/api")
public class TransferPayController {
    @Autowired
    private TransferPayService transferPayService;
    @GetMapping("/getOrderDetails")
    public Map<String, Object> getOrderDetails(@RequestParam double value, @RequestParam String storeCode) {
        return transferPayService.getOrderDetails(value, storeCode);
    }
}
