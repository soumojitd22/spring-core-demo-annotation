package com.demo.repository;

import com.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeRepository {

    @Autowired
    private Map<Integer, Employee> storage;

    public List<Employee> findAllEmployees() {
        return new ArrayList<>(storage.values());
    }

    public Employee findById(Integer id) {
        return storage.get(id);
    }

    public void save(Employee employee) {
        storage.put(employee.getId(), employee);
    }

    public void deleteById(int id) {
        storage.remove(id);
    }
}
