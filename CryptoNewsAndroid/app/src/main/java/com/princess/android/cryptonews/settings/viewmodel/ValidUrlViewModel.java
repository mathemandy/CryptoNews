package com.princess.android.cryptonews.settings.viewmodel;

import android.arch.lifecycle.AndroidViewModel;

import com.princess.android.cryptonews.AppController;
import com.princess.android.cryptonews.injection.CryptoNewsComponents;
import com.princess.android.cryptonews.settings.repository.CheckValidUrlRepository;

/**
 * Created by numb3rs on 3/7/18.
 */

public class ValidUrlViewModel extends AndroidViewModel implements CryptoNewsComponents.Injectable {
    private  CheckValidUrlRepository checkValidUrlRepository;

    public ValidUrlViewModel(CheckValidUrlRepository repository) {
        super(AppController.getInstance());
        this.checkValidUrlRepository = repository;

    }

    public  boolean isValidUrl(String url){
        return  checkValidUrlRepository.isValidUrl(url);
    }


    @Override
    public void inject(CryptoNewsComponents cryptoNewsComponents) {
        cryptoNewsComponents.inject(this);

    }
}
