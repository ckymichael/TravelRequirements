package com.cx.travelrequirements.domain.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class TravelRequirements {
    String country;

    List<String> requirements;
}
