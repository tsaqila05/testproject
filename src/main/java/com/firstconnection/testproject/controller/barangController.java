package com.firstconnection.testproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstconnection.testproject.model.Barangnya;
import com.firstconnection.testproject.service.BarangService;



@RestController
@RequestMapping("/judulbarang")
public class barangController {

    @Autowired
    BarangService barangService;

    @GetMapping("{Id_barang}")
    public Barangnya getBarangDetails(@PathVariable("Id_barang") String Id_barang)
    {
        return barangService.getBarangnya(Id_barang);
    }
    @GetMapping()
    public List<Barangnya> getAllBarangnyaDetails()
    {
        return barangService.getAllBarangnya();
    }
    @PostMapping
    public String createBarangDetails(@RequestBody Barangnya barang)
    {
        barangService.createBarangnya(barang);
        return "Barang berhasil ditambahkan";
    }
    @PutMapping
    public String updateBarangDetails(@RequestBody Barangnya barang)
    {
        barangService.updateBarangnya(barang);
        return "Barang berhasil diupdate";
    }
    @DeleteMapping
    public String deleteBarangDetails(@PathVariable("Id_barang") String Id_barang)
    {
        barangService.deleteBarangnya(Id_barang);
        return "Barang berhasil dihapus";
    }
}
