package com.app.chaerrull.roomdatabase;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
/*
Mohammad Chaerrull Febriansyah
10117171 - IF5

01 Mei 2020 : Membuat Keseluruhan Aplikasi dan Memperbaiki Error
 */

@Dao
public interface ImpDAO {
    @Query("SELECT * FROM Entitas")
    List<Entitas> tampilSemua();

    @Query("SELECT * FROM Entitas WHERE Pekerjaan LIKE :kerja")
    List<Entitas> listPekerjaan(String kerja);

    @Insert
    void tambahData(Entitas entitas);

}
