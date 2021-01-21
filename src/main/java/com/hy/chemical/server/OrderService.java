package com.hy.chemical.server;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hy.chemical.mapper.OrderMapper;
import com.hy.chemical.pojo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class OrderService extends ServiceImpl<OrderMapper, Orders> {
    @Autowired
    private OrderMapper orderMapper;

    public List<Orders> queryybysid(){
        return orderMapper.queryall();
    }
}
