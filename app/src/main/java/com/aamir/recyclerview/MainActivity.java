package com.aamir.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Integer image[]={R.drawable.icon,R.drawable.icon,R.drawable.icon} ;
    String name[]={"aamir", "kashif","quadir"};
    Integer empid[]={101,102,103};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);


        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        ApnaAdapter adapter=new ApnaAdapter(this,image,empid,name);
        recyclerView.setAdapter(adapter);
    }
}
