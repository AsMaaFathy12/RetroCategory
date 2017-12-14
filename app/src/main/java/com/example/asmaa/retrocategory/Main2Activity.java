package com.example.asmaa.retrocategory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.asmaa.retrocategory.api.ApiClass;
import com.example.asmaa.retrocategory.api.service;
import com.example.asmaa.retrocategory.model.ArticlesItem;
import com.example.asmaa.retrocategory.model.Model;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class Main2Activity extends AppCompatActivity {
    RecyclerView imageRecycler;
   Adapter adapter;
    ArrayList<ArticlesItem> articlesItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        articlesItems = new ArrayList<>();
        imageRecycler = (RecyclerView) findViewById(R.id.recyclerImages);
        imageRecycler.setLayoutManager(new GridLayoutManager(Main2Activity.this,1));
        imageRecycler.setHasFixedSize(true);
        adapter = new Adapter(Main2Activity.this, articlesItems);
        imageRecycler.setAdapter(adapter);
        Intent intent = getIntent();
        int pos = intent.getIntExtra("position", 0);
        if (pos == 0) {
            Call<Model> call = service.getservice().getArticles("sport");
                 call.enqueue(new Callback<Model>() {
                @Override
                public void onResponse(Call<Model> call, Response<Model> response) {
                    articlesItems.addAll(response.body().getArticles());
                    String status = response.body().getStatus();
                    adapter.notifyDataSetChanged();

                }

                @Override
                public void onFailure(Call<Model> call, Throwable t) {


                    Toast.makeText(Main2Activity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }else if (pos==1){
            Call<Model> call = service.getservice().getArticles("music");
            call.enqueue(new Callback<Model>() {
                @Override
                public void onResponse(Call<Model> call, Response<Model> response) {
                    articlesItems.addAll(response.body().getArticles());
                    String status = response.body().getStatus();
                    adapter.notifyDataSetChanged();

                }

                @Override
                public void onFailure(Call<Model> call, Throwable t) {

                    Toast.makeText(Main2Activity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
        else if (pos==2){
            Call<Model> call = service.getservice().getArticles("health-and-medical");
            call.enqueue(new Callback<Model>() {
                @Override
                public void onResponse(Call<Model> call, Response<Model> response) {
                    articlesItems.addAll(response.body().getArticles());
                    String status = response.body().getStatus();
                    adapter.notifyDataSetChanged();

                }
                @Override
                public void onFailure(Call<Model> call, Throwable t) {
                    Toast.makeText(Main2Activity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
        else if (pos==3){
            Call<Model> call = service.getservice().getArticles("technology");
            call.enqueue(new Callback<Model>() {
                @Override
                public void onResponse(Call<Model> call, Response<Model> response) {
                    articlesItems.addAll(response.body().getArticles());
                    String status = response.body().getStatus();
                    adapter.notifyDataSetChanged();

                }
                @Override
                public void onFailure(Call<Model> call, Throwable t) {
                Toast.makeText(Main2Activity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
        else if (pos==4){
            Call<Model> call = service.getservice().getArticles("general");
            call.enqueue(new Callback<Model>() {
                @Override
                public void onResponse(Call<Model> call, Response<Model> response) {
                    articlesItems.addAll(response.body().getArticles());
                    String status = response.body().getStatus();
                    adapter.notifyDataSetChanged();

                }
                @Override
                public void onFailure(Call<Model> call, Throwable t) {
                 Toast.makeText(Main2Activity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
        else if (pos==5){
            Call<Model> call = service.getservice().getArticles("gaming");
            call.enqueue(new Callback<Model>() {
                @Override
                public void onResponse(Call<Model> call, Response<Model> response) {
                    articlesItems.addAll(response.body().getArticles());
                    String status = response.body().getStatus();
                    adapter.notifyDataSetChanged();

                }
                @Override
                public void onFailure(Call<Model> call, Throwable t) {
                 Toast.makeText(Main2Activity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
        else if (pos==6){
            Call<Model> call = service.getservice().getArticles("politics");
            call.enqueue(new Callback<Model>() {
                @Override
                public void onResponse(Call<Model> call, Response<Model> response) {
                    articlesItems.addAll(response.body().getArticles());
                    String status = response.body().getStatus();
                    adapter.notifyDataSetChanged();

                }
                @Override
                public void onFailure(Call<Model> call, Throwable t) {
                 Toast.makeText(Main2Activity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
        else if (pos==7){
            Call<Model> call = service.getservice().getArticles("science_and_nature");
            call.enqueue(new Callback<Model>() {
                @Override
                public void onResponse(Call<Model> call, Response<Model> response) {
                    articlesItems.addAll(response.body().getArticles());
                    String status = response.body().getStatus();
                    adapter.notifyDataSetChanged();

                }
                @Override
                public void onFailure(Call<Model> call, Throwable t) {Toast.makeText(Main2Activity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
        else if (pos==8){
            Call<Model> call = service.getservice().getArticles("business");
            call.enqueue(new Callback<Model>() {
                @Override
                public void onResponse(Call<Model> call, Response<Model> response) {
                    articlesItems.addAll(response.body().getArticles());
                    String status = response.body().getStatus();
                    adapter.notifyDataSetChanged();

                }
                @Override
                public void onFailure(Call<Model> call, Throwable t) {
                 Toast.makeText(Main2Activity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
        else if (pos==9){
            Call<Model> call = service.getservice().getArticles("business_entertainment");
            call.enqueue(new Callback<Model>() {
                @Override
                public void onResponse(Call<Model> call, Response<Model> response) {
                    articlesItems.addAll(response.body().getArticles());
                    String status = response.body().getStatus();
                    adapter.notifyDataSetChanged();

                }
                @Override
                public void onFailure(Call<Model> call, Throwable t) {Toast.makeText(Main2Activity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }




    }

        }




