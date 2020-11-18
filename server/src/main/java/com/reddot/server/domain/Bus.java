package com.reddot.server.domain;

/**
 * @author Trey
 * @since 2020/11/18
 */

public class Bus {
    private int id;
    private String number;
    private int driverId;
    private int status;

    public Bus() {
    }

    public Bus(int id, String number, int driverId, int status) {
        this.id = id;
        this.number = number;
        this.driverId = driverId;
        this.status = status;
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
