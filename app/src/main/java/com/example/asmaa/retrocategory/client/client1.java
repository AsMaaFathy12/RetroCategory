package com.example.asmaa.retrocategory.client;

import com.example.asmaa.retrocategory.interceptor.header;

import java.util.HashMap;
import java.util.Map;

import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

/**
 * Created by AsMaa on 12/13/2017.
 */

public class client1 extends parent {
    Retrofit retrofit;
    @Override
    public Interceptor getLoggingInterceptor() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        return logging;

    }

    @Override
    public Interceptor getHeaderInterceptor() {
        Map<String,String> map=new HashMap<>();
        map.put("X-Api-Key","7e9737cbf47d498f97dee197078a8257");
        return new header(map);

    }

    @Override
    public Retrofit getRetrofit() {

        return retrofit;
    }

    @Override
    public void setRetrofit(Retrofit retrofit) {
        this.retrofit= retrofit;

    }
}
