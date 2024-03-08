package com.example.baikt1.service;

import com.example.baikt1.model.Staff;
import com.example.baikt1.repository.IStaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StaffService implements IStaffService{
    @Autowired
    IStaffRepository repository;
    @Override
    public List<Staff> findAll() {
        return  repository.findAll();
    }

    @Override
    public List<Staff> findByName(String name) {
        return repository.findByNameContaining(name);
    }

    @Override
    public Optional<Staff> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Staff staff) {
        repository.save(staff);
    }

    @Override
    public void create(Staff staff) {
        repository.save(staff);
    }
//    @Autowired
//    private IStaffRepository repository;
//    @Override
//    public Iterable<Staff> findAll() {
//        return repository.findAll();
//    }
//
//    @Override
//    public Optional<Staff> findById(Long id) {
//        return repository.findById(id);
//    }
//
//    @Override
//    public Staff save(Staff staff) {
//        return repository.save(staff);
//    }
//
//    @Override
//    public void remove(Long id) {
//        repository.deleteById(id);
//    }
//
//    @Override
//    public List<Staff> findByName(String name) {
//        return repository.findByFullNameContaining(name);
//    }
}
