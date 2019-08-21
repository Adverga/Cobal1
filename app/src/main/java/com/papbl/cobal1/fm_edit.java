package com.papbl.cobal1;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class fm_edit extends Fragment {
    private EditText editJudul, editAlat, editBahan;
    private RecyclerView rvAlat, rvBahan;
    private TextView addAlat, addBahan;
    private List<String> listAlat, listBahan;
    public fm_edit() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_edit, container, false);

        editJudul = view.findViewById(R.id.editJudul);
        editAlat = view.findViewById(R.id.editAlat);
        editBahan = view.findViewById(R.id.editBahan);
        rvAlat = view.findViewById(R.id.rvAlat);
        rvBahan = view.findViewById(R.id.rvBahan);
        addAlat = view.findViewById(R.id.addAlat);
        addBahan = view.findViewById(R.id.addBahan);

        listAlat = new ArrayList<>();
        listAlat.add("1. ");
        listBahan = new ArrayList<>();
        listBahan.add("1. ");

        addAlat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String tmp = editAlat.getText().toString();
                listAlat.add(tmp);
                editAlat.setText(null);
                rvAlat.notify();
            }
        } );
        return view;
    }
    @Override
    public void onStart() {
        super.onStart();
        Bundle bundle = getArguments();
        if (bundle != null){
            editJudul.setText(getArguments().getString("Judul"));
            editAlat.setText(getArguments().getString("Judul"));
            editBahan.setText(getArguments().getString("Judul"));
        }
    }
}

