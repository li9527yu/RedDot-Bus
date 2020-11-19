package com.reddot.server.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * @author Trey
 * @since 2020/11/18
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Bus {
    private int id;
    private String number;
    private int driverId;
    private int status;
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }



    public Bus() {
    }

    public Bus(int id, String number, int driverId, int status, int type) {
        this.id = id;
        this.number = number;
        this.driverId = driverId;
        this.status = status;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
