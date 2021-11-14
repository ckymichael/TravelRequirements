package com.cx.travelrequirements.interfaces.controller;

import com.cx.travelrequirements.domain.models.TravelRequirements;
import com.cx.travelrequirements.domain.services.TravelRequirementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.Set;

@RestController
public class TravelRequirementsController {
    @Autowired
    private TravelRequirementsService travelRequirementsService;

    @GetMapping("getAllCountries")
    public Set<String> getAllCountries() {
        return travelRequirementsService.getCountries();
    }

    @GetMapping("getTravelRequirements")
    public Optional<TravelRequirements> getTravelRequirements(@RequestParam String country) {
        return travelRequirementsService.getTravelRequirementsByCountry(country);
    }
}
