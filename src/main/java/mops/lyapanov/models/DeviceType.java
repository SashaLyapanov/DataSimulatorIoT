package mops.lyapanov.models;

import lombok.Data;

@Data
public class DeviceType {
    private String id;
    private String name;

    public DeviceType(String id, String name) {}
}
