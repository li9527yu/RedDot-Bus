package com.reddot.server.controller.admin;

import com.reddot.server.domain.ResponseWrapper;
import com.reddot.server.service.admin.AdminOrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Trey
 * @since 2020/11/18
 */

@RestController
@RequestMapping("/admin/order")
public class AdminOrderController {
    @Resource
    AdminOrderService service;
//
//    @PutMapping("/{order_id}")
//    public ResponseWrapper assignBus(@PathVariable("order_id") int orderId, @RequestParam("bus_id") int busId) {
//        return service.assignBus(orderId,busId);
//    }
}
