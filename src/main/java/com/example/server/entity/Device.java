package com.example.server.entity;

import javax.persistence.*;

@Entity
@Table(name = "device")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "device_id", nullable = false)
    private Integer deviceId;

    @Column(name = "custom_name")
    private String customName;

    @Column(name = "ip", nullable = false, length = 45)
    private String ip;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer device_id) {
        this.deviceId = device_id;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

}