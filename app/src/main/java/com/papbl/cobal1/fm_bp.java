package com.papbl.cobal1;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class fm_bp extends Fragment {

    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private List<String> mText ;
    public fm_bp(List<String> mText) {
        this.mText = mText;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bp, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        myAdapter = new MyAdapter(getContext(), mText);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(myAdapter);

        return view;
    }
}
