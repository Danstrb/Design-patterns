package com.utgard.structuralPaterns.decorator;

public class DecoratorDemo {
    public void demo() {
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}
