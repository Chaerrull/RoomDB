package com.app.chaerrull.roomdatabase;
import androidx.room.RoomDatabase;
/*
Mohammad Chaerrull Febriansyah
10117171 - IF5

01 Mei 2020 : Membuat Keseluruhan Aplikasi dan Memperbaiki Error
 */

@androidx.room.Database(entities = {Entitas.class}, version = 2, exportSchema = false)
        public abstract class Database extends RoomDatabase {
    public abstract ImpDAO impDao();
}
