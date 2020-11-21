package com.reddot.server.controller;

import com.reddot.server.domain.Order;
import com.reddot.server.domain.ResponseWrapper;
import com.reddot.server.domain.User;
import com.reddot.server.service.OrderService;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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

    @Resource
    OrderService orderService;

    //用户下单接口
    @PostMapping("/create")
    public ResponseWrapper createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @GetMapping("/unfinished/{user_id}")
    public List<Order> getUnfinishedOrder(@PathVariable("user_id") int userId) {
        return orderService.getUnfinishedOrder(userId);
    }

    @GetMapping("/get/all/{user_id}")
    public Map<String, List<Order>> getAll(@PathVariable("user_id") int userId) {
        return orderService.getAll(userId);
    }

    //司机验票接口
    @GetMapping("/complete")
    public ResponseWrapper completeOrder(@RequestParam String token) {
        return orderService.completeOrder(token);
    }
}
