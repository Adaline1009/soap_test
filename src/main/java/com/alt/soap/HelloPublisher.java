package com.alt.soap;

import javax.xml.ws.Endpoint;

public class HelloPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:7779/ws/hello", new HelloWorldImpl());
    }
}
