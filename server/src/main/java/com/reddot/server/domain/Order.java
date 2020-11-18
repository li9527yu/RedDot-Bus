package com.reddot.server.domain;

import java.time.LocalDateTime;

/**
 * @author Trey
 * @since 2020/11/18
 */

public class Order {
    private int id;
    private int user_id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private LocalDateTime createTime;
    private int finished;
    private int bus_id;
    private int assigned;
    private float money;
    private String startLocation;
    private String endLocation;

    public Order() {
    }

    public Order(int id, int user_id, LocalDateTime startTime, LocalDateTime endTime, LocalDateTime createTime, int finished, int bus_id, int assigned, float money, String startLocation, String endLocation) {
        this.id = id;
        this.user_id = user_id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.createTime = createTime;
        this.finished = finished;
        this.bus_id = bus_id;
        this.assigned = assigned;
        this.money = money;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public int getFinished() {
        return finished;
    }

    public void setFinished(int finished) {
        this.finished = finished;
    }

    public int getBus_id() {
        return bus_id;
    }

    public void setBus_id(int bus_id) {
        this.bus_id = bus_id;
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
