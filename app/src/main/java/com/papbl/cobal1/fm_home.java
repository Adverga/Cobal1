package com.papbl.cobal1;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class fm_home extends Fragment {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private List<String> listbudidaya = new ArrayList<>();
    private List<String> listpengolahan = new ArrayList<>();

    public fm_home() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        viewPager = view.findViewById(R.id.homeViewPager);
        setupViewPager(viewPager);

        tabLayout = view.findViewById(R.id.homeTabLayout);
        tabLayout.setupWithViewPager(viewPager);

        listbudidaya.add("budidaya ikan");
        listbudidaya.add("budidaya tempe");
        listbudidaya.add("budidaya jengkol");

        listpengolahan.add("Pengolahan Jahe");
        listpengolahan.add("Pengolahan Air");
        listpengolahan.add("Pengolahan Tanah");

        return view;
    }

    private void setupViewPager(ViewPager viewPager) {
        viewAdapter adapter = new viewAdapter(getChildFragmentManager());
        adapter.addFragment(new fm_bp(listbudidaya), "Budidaya Pertanian");
        adapter.addFragment(new fm_bp(listpengolahan), "Proteksi Tanaman");
        adapter.addFragment(new fm_ph(), "Pengolahan Hasil");
        adapter.addFragment(new fm_pelayanan(), "Penyuluhan");
        adapter.addFragment(new fm_sosialekonomi(), "Sosial Ekonomi");
        viewPager.setAdapter(adapter);
    }

}
