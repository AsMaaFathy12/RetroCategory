/*
 *
 * Copyright 2017, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * IF there any question ,Please contact me at :
 * m.elbehiry44@gmail.com
 *
 */

package com.example.asmaa.retrocategory.api;

import com.example.asmaa.retrocategory.client.client1;
import com.example.asmaa.retrocategory.model.Model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by AsMaa on 02/12/2017.
 */

public interface ApiClass {


  //  public static final String API_KEY = "0ac3806da6bd415d9bd46374204cb84d";
 //   public static final String BASE_URL = "https://newsapi.org/v2/";


    @GET("top-headlines")
    Call<Model> getHeadlines(@Query("category") String category);



}
