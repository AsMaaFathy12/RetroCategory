package com.example.asmaa.retrocategory.interceptor;

import java.io.IOException;
import java.util.Map;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by AsMaa on 12/14/2017.
 */

public class header implements Interceptor {
    Map<String, String> mmap;

    public header(Map<String, String> mmap) {
        this.mmap = mmap;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request= chain.request();
        Request.Builder builder=request.newBuilder();

        for(Map.Entry<String,String> map:mmap.entrySet()){

            builder.addHeader(map.getKey(),map.getValue());
        }


        return chain.proceed(builder.build());
    }
    }
