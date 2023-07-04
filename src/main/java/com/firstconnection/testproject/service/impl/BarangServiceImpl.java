package com.firstconnection.testproject.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.firstconnection.testproject.model.Barangnya;
import com.firstconnection.testproject.repository.BarangRepository;
import com.firstconnection.testproject.service.BarangService;

@Service
public class BarangServiceImpl implements BarangService {
    BarangRepository barang_repository;

    public BarangServiceImpl(BarangRepository barang_repository){
        this.barang_repository = barang_repository;
    }

    @Override
    public String createBarangnya(Barangnya barang){
    barang_repository.save(barang);
    return "Success";
    }
    @Override
    public String updateBarangnya(Barangnya barang){
    barang_repository.save(barang);
    return "Success";
    }
    @Override
    public String deleteBarangnya(String Id_barang){
    barang_repository.deleteById(Id_barang);
    return "Success";
    }
    @Override
    public Barangnya getBarangnya(String Id_barang){
    return barang_repository.findById(Id_barang).get();
    }
    @Override
    public List<Barangnya> getAllBarangnya() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllBarangnya'");
    }

}
