package com.example.baikt1.service;

import com.example.baikt1.model.Staff;

import java.util.List;
import java.util.Optional;

public interface IStaffService  {
    Iterable<Staff> findAll();
    List<Staff>findByName(String name);
    Optional<Staff> findById(Long id);
    void delete(Long id);
    void update(Staff student);
    void create(Staff student);

//    List<Staff>findByName(String name);

}