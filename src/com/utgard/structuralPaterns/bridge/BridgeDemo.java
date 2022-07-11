package com.utgard.structuralPaterns.bridge;

public class BridgeDemo {
    public void demo() {
        var remote = new AdvancedRemoteControl(new SamsungTv());
        remote.turnOn();
        remote.setChannel(1);
        remote.turnOff();

    }
}
