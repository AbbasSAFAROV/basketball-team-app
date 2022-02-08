package com.producter.basketballteam.service;

import com.producter.basketballteam.entity.Hello;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloService {

    private final List<Hello> list = new ArrayList();

    public List<Hello> getAll() {
        return list;
    }

    public Hello add(String message) {
        Hello hello = new Hello();
        hello.setMessage(message);
        list.add(hello);
        return hello;
    }
}
