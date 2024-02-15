package com.pablo.order.domain.dto;

import com.pablo.order.domain.Address;
import com.pablo.order.domain.Client;
import com.pablo.order.domain.Product;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class OrderDTO {
    private Long orderNumber;
    private Client client;
    private List<Product> products;
    private BigDecimal total;
    private Address shippingAddress;
}
