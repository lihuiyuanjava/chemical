package com.hy.chemical.web;

import com.hy.chemical.pojo.Orders;
import com.hy.chemical.server.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderContral {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/queryorder")
    @ResponseBody
    public List<Orders> queryorder(){
        List<Orders> queryybysid = orderService.queryybysid();
        return queryybysid;
    }
}
