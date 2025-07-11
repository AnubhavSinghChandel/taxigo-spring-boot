package com.project.taxiGo.taxiGoApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RiderDTO {

    private Long id;
    private Double rating;
    private UserDTO user;
}
