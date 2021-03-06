package com.techfirebase.android.mvvmdemo.data.local.db.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.techfirebase.android.mvvmdemo.data.domain.entity.Word;

import java.util.List;

/** Created by DUKE SINGH on 24-03-2018. */
@Dao
public interface WordDao {
//  @Insert(onConflict = OnConflictStrategy.REPLACE)
  @Insert
  void insert(Word word);

  @Query("DELETE from Word")
  void deleteAll();

  @Query("SELECT * from Word ORDER BY word ASC")
  LiveData<List<Word>> getAllWords();
}
