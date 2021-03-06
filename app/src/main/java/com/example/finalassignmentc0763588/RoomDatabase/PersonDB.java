package com.example.finalassignmentc0763588.RoomDatabase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.finalassignmentc0763588.Person;


@Database(entities = Person.class , exportSchema = false , version = 4)

public abstract class PersonDB extends RoomDatabase {


        public static final String DB_NAME = "user_db";

        private static PersonDB uInstance;


        public static PersonDB getInstance(Context context)
        {
            if(uInstance == null)
            {
                uInstance = Room.databaseBuilder(context.getApplicationContext(), PersonDB.class, PersonDB.DB_NAME).allowMainThreadQueries().fallbackToDestructiveMigration().build();
            }
            return uInstance;
        }


        public abstract PersonDao daoObjct();
    }

