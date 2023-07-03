package com.firstconnection.testproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstconnection.testproject.model.Barangnya;

public interface BarangRepository extends JpaRepository<Barangnya, String> {
    default List<Barangnya> gelAllBarangnya(){
        return findAll();
    }
}
