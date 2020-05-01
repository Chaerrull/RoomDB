package com.app.chaerrull.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.*;


import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
/*
Mohammad Chaerrull Febriansyah
10117171 - IF5

01 Mei 2020 : Membuat Keseluruhan Aplikasi dan Memperbaiki Error
 */

public class MainActivity extends AppCompatActivity {

    private Entitas entitas;
    public static Database db;

    List<Entitas> entities = new ArrayList<>();
    List<Entitas> entitasListbyWork = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = Room.databaseBuilder(getApplicationContext(),Database.class,"Data Diri")
                .allowMainThreadQueries().build();

        entitas = new Entitas();
        entitas.setUid(1);
        entitas.setNamaDepan("Chaerrull");
        entitas.setNamaBelakang("Febriansyah");
        entitas.setPekerjaan("Mahasiswa");
        Log.d("TAMBAH","  Tambah Data Diri  ");
        Log.d("TAMBAH","====================");
        Log.d("TAMBAH","ID            : "+ entitas.getUid());
        Log.d("TAMBAH","Nama Depan    : "+ entitas.getNamaDepan());
        Log.d("TAMBAH","Nama Belakang : "+ entitas.getNamaBelakang());
        Log.d("TAMBAH","Pekerjaan     : "+ entitas.getPekerjaan());


        entitas.setUid(2);
        entitas.setNamaDepan("Doni");
        entitas.setNamaBelakang("Suparna");
        entitas.setPekerjaan("Supir");
        Log.d("TAMBAH","  Tambah Data Diri  ");
        Log.d("TAMBAH","====================");
        Log.d("TAMBAH","ID            : "+ entitas.getUid());
        Log.d("TAMBAH","Nama Depan    : "+ entitas.getNamaDepan());
        Log.d("TAMBAH","Nama Belakang : "+ entitas.getNamaBelakang());
        Log.d("TAMBAH","Pekerjaan     : "+ entitas.getPekerjaan());


        entitas.setUid(3);
        entitas.setNamaDepan("Sophie");
        entitas.setNamaBelakang("Warren");
        entitas.setPekerjaan("Mahasiswa");

        Log.d("TAMBAH","  Tambah Data Diri  ");
        Log.d("TAMBAH","====================");
        Log.d("TAMBAH","ID            : "+ entitas.getUid());
        Log.d("TAMBAH","Nama Depan    : "+ entitas.getNamaDepan());
        Log.d("TAMBAH","Nama Belakang : "+ entitas.getNamaBelakang());
        Log.d("TAMBAH","Pekerjaan     : "+ entitas.getPekerjaan());
        db.impDao().tambahData(entitas);

        Log.d("Tampil", " Tampil Seluruh Data ");
        Log.d("Tampil", "=====================");
        entities = db.impDao().tampilSemua();

        Log.e("PEKERJAAN", "Data Diri Berdasarkan Pekerjaan");
        Log.e("PEKERJAAN", "===============================");
        entitasListbyWork = db.impDao().listPekerjaan("Mahasiswa");

    }
}
