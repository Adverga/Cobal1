package com.papbl.cobal1;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class fm_home extends Fragment {

    private ViewPager viewPager;
    private TabLayout tabLayout;

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

        return view;
    }

    private void setupViewPager(ViewPager viewPager) {
<<<<<<< HEAD
        viewHomeAdapter adapter = new viewHomeAdapter(getChildFragmentManager());
        adapter.addFragment(new fm_bp(), "Budidaya Pertanian");
        adapter.addFragment(new fm_pt(), "Proteksi Tanaman");
        adapter.addFragment(new fm_ph(), "Pengolahan Hasil");
        adapter.addFragment(new fm_pelayanan(), "Pelayanan");
        adapter.addFragment(new fm_sosialekonomi(), "Sosial Ekonomi");
=======
        viewAdapter adapter = new viewAdapter(getFragmentManager());
        adapter.addFragment(new fm_bp(),"Budidaya Pertanian");
        adapter.addFragment(new fm_pt(),"Proteksi Tanaman");
        adapter.addFragment(new fm_ph(),"Pengolahan Hasil");
>>>>>>> parent of c51d938... add home adapter
        viewPager.setAdapter(adapter);
    }

}
