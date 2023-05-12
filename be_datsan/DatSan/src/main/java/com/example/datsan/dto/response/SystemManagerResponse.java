package com.example.datsan.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SystemManagerResponse {
    private Long id;
    private String name;
    private OwnerResponse owner;
    private Float rate;
    private String city;
    private String district;
    private String ward;
    private String addressDetail;
}
