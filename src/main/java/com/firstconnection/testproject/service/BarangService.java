package com.firstconnection.testproject.service;

import java.util.List;

import com.firstconnection.testproject.model.Barangnya;

public interface BarangService{
    public String createBarangnya(Barangnya barang);
    public String updateBarangnya(Barangnya barang);
    public Barangnya getBarangnya(String id_barang);
    public String deleteBarangnya(String id_barang);
    public List<Barangnya> getAllBarangnya();
    
}