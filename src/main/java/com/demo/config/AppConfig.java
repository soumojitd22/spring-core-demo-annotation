package com.demo.config;

import com.demo.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class AppConfig {

    @Bean
    public Map<Integer, Employee> storage() {
        Employee e1 = new Employee();
        e1.setId(100);
        e1.setName("Ram");
        e1.setSalary(30000);

        Employee e2 = new Employee();
        e2.setId(101);
        e2.setName("Rahim");
        e2.setSalary(40000);

        Map<Integer, Employee> storage = new HashMap<>();
        storage.put(e1.getId(), e1);
        storage.put(e2.getId(), e2);
        return storage;
    }
}
