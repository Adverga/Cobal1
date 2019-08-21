package com.papbl.cobal1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context mContext;
    private List<String> mDataset;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        CardView mCardView;
        TextView mTextView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mCardView = itemView.findViewById(R.id.kCardView);
            mTextView = itemView.findViewById(R.id.kText);
        }
    }
    public MyAdapter (Context mContext, List<String> mDataset){
        this.mContext = mContext;
        this.mDataset = mDataset;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.kontencard, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.mTextView.setText(mDataset.get(position));
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDataset.get(position);
                Bundle bundle = new Bundle();

            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

}
