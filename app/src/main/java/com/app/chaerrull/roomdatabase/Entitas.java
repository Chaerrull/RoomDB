package com.app.chaerrull.roomdatabase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Entitas {

    @PrimaryKey
    private int uid;
    @ColumnInfo(name = "nama_Depan")
    private String namaDepan;
    @ColumnInfo(name = "nama_Belakang")
    private String namaBelakang;
    @ColumnInfo(name = "Pekerjaan")
    private String pekerjaan;

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public int getUid() {
        return uid;
    }
}
