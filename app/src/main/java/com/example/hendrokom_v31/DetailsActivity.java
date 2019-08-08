package com.example.hendrokom_v31;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailsActivity extends RecyclerView.Adapter<DetailsActivity.CategoryViewHolder>
{
    private Context context;

    private ArrayList<Part> getDetailPart()
    {
        return detailPart;
    }

    public void setDetailPart(ArrayList<Part> detailPart)
    {
        this.detailPart = detailPart;
    }

    private ArrayList<Part> detailPart;

    DetailsActivity(Context context)
    {
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View itemRow;
        itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_details, parent, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position)
    {
        holder.tvName.setText(getDetailPart().get(position).getName());
        holder.tvDetail.setText(getDetailPart().get(position).getHarga());




        Glide.with(context)
             .load(getDetailPart().get(position).getPhoto())
                .apply(new RequestOptions().override(220, 220))

             .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount()
    {
        return getDetailPart().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvName;
        TextView tvDetail;
        ImageView imgPhoto;


        CategoryViewHolder(View itemView)
        {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_detail_name);
            tvDetail = itemView.findViewById(R.id.tv_detail_harga);
            imgPhoto = itemView.findViewById(R.id.img_detail_photo);

        }
    }
}