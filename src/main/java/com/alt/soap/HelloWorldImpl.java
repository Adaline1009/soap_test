package com.alt.soap;

import javax.jws.WebService;

@WebService(endpointInterface = "com.alt.soap.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }
}
