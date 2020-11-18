package com.reddot.server.controller;

import com.reddot.server.domain.Order;
import com.reddot.server.domain.ResponseWrapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 与订单有关的操作
 *
 * @author Trey
 * @since 2020/11/18
 */

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping("/create")
    public ResponseWrapper createOrder() {
        return null;
    }

    @GetMapping("/unfinished/{user_id}")
    public List<Order> getUnfinishedOrder() {
        return null;
    }

    @GetMapping("/get/all")
    public Map<String, List<Order>> getAll() {
        return null;
    }

    @GetMapping("/complete/{order_id}")
    public ResponseWrapper completeOrder() {
        return null;
    }
}
