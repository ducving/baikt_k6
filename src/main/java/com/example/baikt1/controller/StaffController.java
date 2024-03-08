package com.example.baikt1.controller;

import com.example.baikt1.model.Staff;
import com.example.baikt1.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/staff")
public class StaffController {

    @Autowired
    private IStaffService service;

    @GetMapping
    public ResponseEntity findAllStudent(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody Staff staff){
        service.create(staff);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @PutMapping("/{id}")
    public ResponseEntity Update(@RequestBody Staff staff,@PathVariable Long id){
        staff.setId(id);
        service.update(staff);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity Delete(@PathVariable Long id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/findName")
    public ResponseEntity findStudent(@RequestParam String name){
        return new ResponseEntity<>(service.findByName(name), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id).get(),HttpStatus.OK);
    }
}