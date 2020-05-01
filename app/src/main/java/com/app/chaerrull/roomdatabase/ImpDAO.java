package com.app.chaerrull.roomdatabase;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;


@Dao
public interface ImpDAO {
    @Query("SELECT * FROM Entitas")
    List<Entitas> tampilSemua();

    @Query("SELECT * FROM Entitas WHERE Pekerjaan LIKE :kerja")
    List<Entitas> listPekerjaan(String kerja);

    @Insert
    void tambahData(Entitas entitas);

}
