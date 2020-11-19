package com.reddot.server.service.admin;

import com.reddot.server.dao.OrderMapper;
import com.reddot.server.domain.ResponseWrapper;
import com.reddot.server.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Trey
 * @since 2020/11/19
 */

@Service
public class AdminOrderService extends OrderService {
    @Resource
    OrderMapper mapper;

//    public ResponseWrapper assignBus(int orderId, int busId) {
//        if(mapper.setBusId(orderId,busId)){
//            return new ResponseWrapper(200, "操作成功");
//        }
//        return new ResponseWrapper(500, "操作失败");
//    }

}
