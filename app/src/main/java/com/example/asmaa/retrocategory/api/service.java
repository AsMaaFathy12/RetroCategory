package com.example.asmaa.retrocategory.api;

import com.example.asmaa.retrocategory.client.client1;
import com.example.asmaa.retrocategory.model.Model;

import retrofit2.Call;

/**
 * Created by AsMaa on 12/14/2017.
 */

public class service {
    private client1 client;
    public static service mservice=null;
    public static service getservice(){
        if(mservice ==null){
            mservice=new service();
        }
        return mservice;

    }


  private service() {
       client=new client1();
    }
    public Call<Model> getArticles(String category){

        ApiClass api=client.getRetrofit().create(ApiClass.class);
        Call<Model> call=api.getHeadlines(category);
        return call;
}}
