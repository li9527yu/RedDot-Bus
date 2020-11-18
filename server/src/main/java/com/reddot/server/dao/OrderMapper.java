package com.reddot.server.dao;

import com.reddot.server.domain.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Trey
 * @since 2020/11/18
 */
@Mapper
public interface OrderMapper {

    @Insert("INSERT INTO order (user_id,start_location,end_location,money,start_time) VALUES (#{userId},#{startLocation},#{endLocation},#{money},#{startTime})")
    boolean createOrder();

    @Select("SELECT * FROM order WHERE user_id=#{userId} AND finished=0")
    List<Order> getUnfinishedOrder(int userId);

    @Select("SELECT * FROM order WHERE user_id=#{userId} AND finished=1")
    List<Order> getFinishedOrder(int userId);

    @Update("UPDATE order SET bus_Id=#{busId} WHERE order_Id=#{orderId}")
    boolean setBusId(int orderId,int busId);

    @Update("UPDATE order SET finished=1 WHERE order_Id=#{orderId}")
    boolean completeOrder(int orderId);
}
