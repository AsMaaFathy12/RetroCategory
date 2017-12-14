package com.example.asmaa.retrocategory.client;

import android.os.Environment;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by AsMaa on 12/13/2017.
 */

public  abstract class parent {
    public static final String Base_Url="https://newsapi.org/v2/";
    public  final int size_Of_Cach= 30*1024*1024;
    public  final int Time_Request= 10;

    public parent() {
        OkHttpCreate();
    }
    private void OkHttpCreate(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(Base_Url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(getClient())
                .build();
        setRetrofit(retrofit);

    }



    private OkHttpClient getClient() {
        OkHttpClient client=new OkHttpClient.Builder()
                .connectTimeout(Time_Request, TimeUnit.SECONDS)
                .readTimeout(Time_Request,TimeUnit.SECONDS)
                .writeTimeout(Time_Request,TimeUnit.SECONDS)
                .cache(getCach())
                .addInterceptor(getHeaderInterceptor())
                .addInterceptor(getLoggingInterceptor())
                .build();

        return client;
    }
    private Cache getCach() {
        File file = new File(Environment.getExternalStorageDirectory(), "res");
        return new Cache(file, size_Of_Cach);
    }

    public abstract Interceptor getLoggingInterceptor() ;
    public abstract Interceptor getHeaderInterceptor() ;
    public abstract  Retrofit getRetrofit();

    public abstract void setRetrofit(Retrofit retrofit);
    }



