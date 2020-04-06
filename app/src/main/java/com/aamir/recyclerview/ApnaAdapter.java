package com.aamir.recyclerview;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ApnaAdapter extends RecyclerView.Adapter<ApnaAdapter.MyViewHolder>
{

    Integer img[], empid[];
    String name[];
    Activity activity;

    public ApnaAdapter(Activity activity,
                       Integer img[],
                       Integer empid[],
                       String name[])
    {
        this.activity=activity;
        this.img=img;
        this.empid=empid;
        this.name=name;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=activity.getLayoutInflater()
                .inflate(R.layout.custom_layout,parent,false);
        MyViewHolder holder=new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageView.setImageResource(img[position]);
        holder.tv1.setText(name[position]);
        holder.tv2.setText(""+empid[position]);
    }

    @Override
    public int getItemCount() {
        return img.length;
    }

    class  MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView tv1,tv2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.img);
            tv1=itemView.findViewById(R.id.name);
            tv2=itemView.findViewById(R.id.empid);
        }
    }


}
