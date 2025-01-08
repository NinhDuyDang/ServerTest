package com.example.severtest.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TransferPayService {
    public Map<String, Object> getOrderDetails(double value, String storeCode) {
        Map<String, Object> response = new HashMap<>();

        // Xử lý logic dựa trên storeCode
        if ("10".equals(storeCode) || "11".equals(storeCode)) {
            response.put("Business Date", "2025-01-01");
            response.put("Store Group Code", "SGC001");
            response.put("Store Code", storeCode);
            response.put("Ticket No", "TCK12345");
            response.put("Shift", "Morning");
            response.put("Person in Charge", "John Doe");
            response.put("Table No", "12");
            response.put("Order Date", "2025-01-01");
            response.put("Order Time", "10:30:00");
            response.put("Customer Code", "CUST001");
            response.put("Customer Name 1", "Nguyen Van A");
            response.put("Customer Name 2", "Tran Thi B");
            response.put("Number of People 1", 2);
            response.put("Number of People 2", 3);
            response.put("Number of People 3", 0);
            response.put("Number of People 4", 1);

            List<Map<String, Object>> details = new ArrayList<>();

            Map<String, Object> detail = new HashMap<>();
            detail.put("Order", "Order001");
            detail.put("Unit Price", 100.0);
            detail.put("Quantity", 2);
            detail.put("Menu Code", "MNU001");
            detail.put("Menu Name 1", "Pho Bo");
            detail.put("Menu Name 2", "Beef Noodles");
            detail.put("Kitchen Category", "Main Dish");
            detail.put("OS Sales History ID", "OSH123");
            detail.put("KMS Ticket Item History ID", "KMS123");
            detail.put("KMS Ticket History ID", "KMST123");
            detail.put("Status", "Served");

            List<Map<String, Object>> courseBreakdown = new ArrayList<>();
            Map<String, Object> courseDetail = new HashMap<>();
            courseDetail.put("Parent Menu Code", "PMNU001");
            courseDetail.put("Menu Code", "MNU002");
            courseDetail.put("Quantity Before Change", 1);
            courseDetail.put("Quantity After Change", 2);
            courseDetail.put("Order Sequence", 1);

            courseBreakdown.add(courseDetail);
            detail.put("Course Breakdown Array", courseBreakdown);

            details.add(detail);
            response.put("Details", details);

            response.put("status", "OK");
            response.put("message", "Data fetched successfully");
            response.put("total_count", details.size());
        } else if ("12".equals(storeCode) || "13".equals(storeCode)) {
            response.put("status", "NG");
            response.put("message", "Invalid store code");
        } else {
            response.put("status", "NG");
            response.put("message", "Store code not recognized");
        }

        return response;
    }
}
