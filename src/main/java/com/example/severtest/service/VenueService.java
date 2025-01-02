package com.example.severtest.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class VenueService {

    public Map<String, Object> getOpenVenues() {
        Map<String, Object> response = new HashMap<>();

        response.put("status", "ok");
        response.put("message", null);
        response.put("total_count", null);
        response.put("result", List.of(
                Map.of(
                        "group_name", "test group",
                        "shop_id", 10,
                        "shop_name", "test",
                        "ip_address", "127.0.0.1",
                        "port", "8080",
                        "direction", "BOTH"
                ),
                Map.of(
                        "group_name", "group 2",
                        "shop_id", 11,
                        "shop_name", "shop 2",
                        "ip_address", "192.168.1.1",
                        "port", "9090",
                        "direction", "INBOUND"
                ),
                Map.of(
                        "group_name", "group 3",
                        "shop_id", 12,
                        "shop_name", "shop 3",
                        "ip_address", "10.0.0.1",
                        "port", "7070",
                        "direction", "OUTBOUND"
                ),
                Map.of(
                        "group_name", "group 4",
                        "shop_id", 13,
                        "shop_name", "shop 4",
                        "ip_address", "172.16.0.1",
                        "port", "6060",
                        "direction", "BOTH"
                )
        ));

        return response;
    }
}
