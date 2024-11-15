package mops.lyapanov.models;

import lombok.Data;

import java.lang.reflect.Type;

@Data
public class Device {
    private String id;
    private String name;
    private DeviceType type;
}
