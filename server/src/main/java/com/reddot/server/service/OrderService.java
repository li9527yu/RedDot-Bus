package com.reddot.server.service;

import com.reddot.server.dao.OrderMapper;
import com.reddot.server.domain.Order;
import com.reddot.server.domain.ResponseWrapper;
import com.reddot.server.domain.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 订单业务层
 *
 * @author Trey
 * @since 2020/11/19
 */

@Service
public class OrderService {

    @Resource
    OrderMapper mapper;

    public ResponseWrapper createOrder(Order order) {
        order.setCreateTime(new Date());
        if (mapper.createOrder(order)) {
            return new ResponseWrapper(200, "订单创建成功");
        }
        return new ResponseWrapper(500, "订单创建失败");
    }

    public List<Order> getUnfinishedOrder(int userId) {
        return mapper.getUnfinishedOrder(userId);
    }

    public Map<String, List<Order>> getAll(int userId) {
        Map<String, List<Order>> map = new HashMap<>();
        map.put("unfinished", mapper.getUnfinishedOrder(userId));
        map.put("finished", mapper.getFinishedOrder(userId));
        return map;
    }

    public ResponseWrapper completeOrder(int orderId) {
        if (mapper.completeOrder(orderId)) {
            return new ResponseWrapper(200, "大功告成！");
        }
        return new ResponseWrapper(500, "操作失败");
    }
}
