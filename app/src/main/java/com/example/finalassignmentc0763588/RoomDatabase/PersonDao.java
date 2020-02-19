package com.example.finalassignmentc0763588.RoomDatabase;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;


import com.example.finalassignmentc0763588.Person;

import java.util.List;

@Dao
public interface PersonDao {



        @Insert
        void insert(Person person);

        @Delete
        void delete(Person person);

        @Update
        void update(Person person);

        @Query("Select count(id) from person")
        Integer count();

        @Query("Select count(id) from person")
        LiveData<Integer> countLive();

        @Query("Select * from person")
        LiveData<List<Person>> getUserDetails();

        @Query("Select * from person")
        List<Person> getDefault();


    }

