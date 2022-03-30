package com.xpcodehub.helloWorldTask.question1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloWorldTest {

    HelloWorld helloWorld = new HelloWorld();

    @Test
    void mustSendHelloWorld() {
        String result = helloWorld.sendHelloWorld();
        Assertions.assertEquals("Hello World", result);
    }
}
