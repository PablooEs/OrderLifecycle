package com.pablo.order.service.impl;

import com.pablo.order.domain.Order;
import com.pablo.order.domain.dto.OrderDTO;
import com.pablo.order.repository.OrderRepository;
import com.pablo.order.service.IOrderService;
import com.pablo.order.transformer.IMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements IOrderService {

    private static final Logger LOG = LogManager.getLogger(OrderServiceImpl.class);

    private final OrderRepository orderRepository;
    private final IMapper mapper;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository, IMapper mapper){
        this.orderRepository = orderRepository;
        this.mapper = mapper;
    }

    public ResponseEntity createOrder(OrderDTO orderDTO){
        Optional<Order> order = orderRepository.findByOrderNumber(orderDTO.getOrderNumber());
        if(order.isPresent()){
            return new ResponseEntity("Order already exists",HttpStatus.CONFLICT);
        }

        Order newOrder = mapper.orderDTOtoOrder(orderDTO);

        return new ResponseEntity(HttpStatus.CREATED);
    }

}
