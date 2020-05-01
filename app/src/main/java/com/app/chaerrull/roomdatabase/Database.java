package com.app.chaerrull.roomdatabase;
import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {Entitas.class}, version = 2, exportSchema = false)
        public abstract class Database extends RoomDatabase {
    public abstract ImpDAO impDao();
}
