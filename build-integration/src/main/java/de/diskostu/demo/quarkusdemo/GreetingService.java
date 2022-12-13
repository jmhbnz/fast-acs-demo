package de.diskostu.demo.quarkusdemo;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        return String.format("hello %s", name);
    }
}
