package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class MyDatabaseService {
    @Service
    public class myDatabaseService {
        // 여기에는 어떤 Bean을 주입시켜줘야 하는지??

        @Autowired
        CrudRepository repository;
    }

}
