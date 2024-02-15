package com.pablo.order.transformer;


import com.pablo.order.domain.Order;
import com.pablo.order.domain.dto.OrderDTO;

public class MapperImpl implements IMapper{

    @Override
    public Order orderDTOtoOrder(OrderDTO orderDTO){
        return new Order();
    }

}
