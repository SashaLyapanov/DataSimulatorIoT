package mops.lyapanov.services;

import mops.lyapanov.models.Device;
import mops.lyapanov.models.DeviceType;
import mops.lyapanov.models.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MessageGenerator {

    static DeviceType phone = new DeviceType("71b0af32-887c-4903-bc54-af3f96481e9e", "phone");
    static DeviceType computer = new DeviceType("1e89d773-7b06-4b2c-825c-44208229ae8a", "computer");
    static DeviceType laptop = new DeviceType("c5ef842e-61e3-4183-9992-45ed24fb68ba", "laptop");

    static List<DeviceType> devicesTypes = new ArrayList<>(){{
        add(phone);
        add(computer);
        add(laptop);
    }};

    static Random random = new Random();

    public static List<Device> generateDevices() {
        List<Device> devices = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int id = random.nextInt(100, 999);
            Device device = new Device();
            device.setId(Integer.toString(id));
            device.setName("Device " + i);
            device.setType(devicesTypes.get(random.nextInt(3)));
            devices.add(device);
        }
        return devices;
    }

    public static List<Message> generateMessages() {
        List<Message> messages = new ArrayList<>();
        List<Device> devices = generateDevices();

        for(Device device: devices) {
            Message message = new Message();
            message.setMessage(random.nextInt(-10, 10));
            message.setDevice(device);
            messages.add(message);
        }

        return messages;
    }


}
