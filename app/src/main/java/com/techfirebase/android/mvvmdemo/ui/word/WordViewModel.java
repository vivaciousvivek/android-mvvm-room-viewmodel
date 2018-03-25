package com.techfirebase.android.mvvmdemo.ui.word;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.techfirebase.android.mvvmdemo.data.AppRepository;
import com.techfirebase.android.mvvmdemo.data.domain.entity.Word;

import java.util.List;

/**
 * Created by DUKE SINGH on 24-03-2018.
 */
public class WordViewModel extends AndroidViewModel{
    private AppRepository repository;

    public WordViewModel(@NonNull Application application) {
        super(application);
        repository = new AppRepository(application);
    }

    public LiveData<List<Word>> getAllWords() {
        return repository.getAllWords();
    }

    public void insert(Word word) {
        repository.insert(word);
    }
}
