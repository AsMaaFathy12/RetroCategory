package com.example.asmaa.retrocategory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Main3Activity extends AppCompatActivity {
    TextView tit,auth,desc,pupl,urll;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tit=(TextView)findViewById(R.id.txt_xtitle);
        auth=(TextView)findViewById(R.id.txt_xauthor);
        desc=(TextView)findViewById(R.id.txt_xdesc);
        pupl=(TextView)findViewById(R.id.txt_xpuplich);
        urll=(TextView)findViewById(R.id.txt_xurl);
        image=(ImageView) findViewById(R.id.img);
        Intent i=getIntent();
        String name= i.getStringExtra("title");
        String img =i.getStringExtra("img");
        String des =i.getStringExtra("des");
        String aut =i.getStringExtra("author");
        String pup =i.getStringExtra("puplish");
        String url =i.getStringExtra("url");

        tit.setText(name);
        desc.setText(des);
        auth.setText(aut);
        pupl.setText(pup);
        urll.setText(url);


        Picasso.with(Main3Activity.this).load(img)
                .into(image);

    }
}
