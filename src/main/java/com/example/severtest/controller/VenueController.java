package com.example.severtest.controller;


import com.example.severtest.service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
@RestController
public class VenueController {
    @Autowired
    private VenueService venueService;
    @GetMapping("/u0000psr/api/getOpenVenues")
    public Map<String, Object> getOpenVenues() {
        return venueService.getOpenVenues();
    }
}
