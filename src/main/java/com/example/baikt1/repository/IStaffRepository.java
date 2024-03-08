package com.example.baikt1.repository;


import com.example.baikt1.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStaffRepository extends JpaRepository<Staff, Long> {
    List<Staff> findByNameContaining(String name);
}