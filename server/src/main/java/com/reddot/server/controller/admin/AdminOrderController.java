package com.reddot.server.controller.admin;

import com.reddot.server.domain.ResponseWrapper;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Trey
 * @since 2020/11/18
 */

@RestController
@RequestMapping("/admin/order")
public class AdminOrderController {

    @PutMapping("/{id}")
    public ResponseWrapper matchBusAndOrder() {
        return null;
    }
}
