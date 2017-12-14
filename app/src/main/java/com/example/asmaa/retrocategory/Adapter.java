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

package com.example.asmaa.retrocategory;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asmaa.retrocategory.model.ArticlesItem;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by AsMaa on 02/12/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ImageHolder>{
Context mContext;
       ArrayList<ArticlesItem> articlesItems;
       ArticlesItem items;

    public Adapter(Context context, ArrayList<ArticlesItem> list){
        this.articlesItems = list;
        this.mContext = context;
    }






    @Override
    public ImageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recylist, parent,false);
        return new ImageHolder(view);
    }

    @Override
    public void onBindViewHolder(ImageHolder holder, int position) {

        int width = (int) mContext.getResources().getDimension(R.dimen.image_width);
        ArticlesItem item = articlesItems.get(position);
        holder.image.setTag(position);
        holder.mtitle.setText(item.getTitle());
        Picasso.with(mContext).load(item.getUrlToImage())
                .resize(width,width)
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return articlesItems.size();
    }

    class ImageHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView image;
        TextView mtitle;
        public ImageHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.img);
            mtitle = itemView.findViewById(R.id.Imgtitle);
            image.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = (int) view.getTag();

            items = articlesItems.get(position);

            Intent i = new Intent(mContext, Main3Activity.class);
            i.putExtra("title",items.getTitle());
            i.putExtra("des",items.getDescription());
            i.putExtra("img", items.getUrlToImage());
            i.putExtra("author", items.getAuthor());
            i.putExtra("puplish", items.getPublishedAt());
            i.putExtra("url", items.getUrl());

            mContext.startActivity(i);
        }
    }
}
