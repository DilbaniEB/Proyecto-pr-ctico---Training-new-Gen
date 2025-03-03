package com.globant.project.foodAplication.commons.dto;

import com.globant.project.foodAplication.model.client.Client;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class DeliveryDto {

    private Long product_id;
    private Client client_id;
    private Integer quantity;
    private String extraInformation;
}
