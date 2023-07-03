package com.firstconnection.testproject.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Barangnya
{
    private String Id_barang;
    private String Nama_barang;
    private String Jumlah_barang;

    public Barangnya(String Id_barang, String Nama_barang, String Jumlah_barang){
        this.Id_barang = Id_barang;
        this.Nama_barang = Nama_barang;
        this.Jumlah_barang = Jumlah_barang;
    }
}
