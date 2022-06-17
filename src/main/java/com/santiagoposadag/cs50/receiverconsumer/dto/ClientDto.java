package com.santiagoposadag.cs50.receiverconsumer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto {
    private String id;
    private String name;
    private String passport;
    private String phone;
    private String routingKey;
}
