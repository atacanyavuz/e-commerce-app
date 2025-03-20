package com.atacanyavuz.ecommerce.dto;


import com.atacanyavuz.ecommerce.model.Address;

public record CustomerResponse(
        String id,
        String firstname,
        String lastname,
        String email,
        Address address
) {


}

