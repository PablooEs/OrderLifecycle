package com.pablo.order.transformer;

import com.pablo.order.domain.Order;
import com.pablo.order.domain.dto.OrderDTO;

public interface IMapper {
    Order orderDTOtoOrder(OrderDTO orderDTO);
}
