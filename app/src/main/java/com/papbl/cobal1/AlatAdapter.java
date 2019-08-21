package com.papbl.cobal1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AlatAdapter extends RecyclerView.Adapter<AlatAdapter.AViewHolder>{
    private Context mContext;
    private List<String> mData;
    public AlatAdapter (Context mContext, List<String> mData){
        this.mContext = mContext;
        this.mData = mData;
    }
    @NonNull
    @Override
    public AlatAdapter.AViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.kontencard, parent, false);
        AViewHolder aViewHolder = new AViewHolder(v);
        return aViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AlatAdapter.AViewHolder holder, final int position) {
        holder.mEditText.setText(mData.get(position));
        holder.mBtnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mData.remove(position);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class AViewHolder extends RecyclerView.ViewHolder {
        private EditText mEditText;
        private TextView mBtnMin;
        public AViewHolder(@NonNull View itemView) {
            super(itemView);

            mEditText = itemView.findViewById(R.id.editText);
            mBtnMin = itemView.findViewById(R.id.btnMin);

        }
    }
}