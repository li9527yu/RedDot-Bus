package com.reddot.server.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Trey
 * @since 2020/11/18
 */

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Order {
    private int id;
    private int userId;
    @JsonFormat( pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;
    @JsonFormat( pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;
    @JsonFormat( pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private int finished;
    private int busId;
    private int assigned;
    private float money;
    private String startLocation;
    private String endLocation;
    private int passengerNumber;

    public Order(int id, int userId, Date startTime, Date endTime, Date createTime, int finished, int busId, int assigned, float money, String startLocation, String endLocation, int passengerNumber) {
        this.id = id;
        this.userId = userId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.createTime = createTime;
        this.finished = finished;
        this.busId = busId;
        this.assigned = assigned;
        this.money = money;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.passengerNumber = passengerNumber;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getFinished() {
        return finished;
    }

    public void setFinished(int finished) {
        this.finished = finished;
    }

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public int getAssigned() {
        return assigned;
    }

    public void setAssigned(int assigned) {
        this.assigned = assigned;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }
}
