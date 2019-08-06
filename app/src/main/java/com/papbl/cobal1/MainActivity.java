package com.papbl.cobal1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTablay;
    private ViewPager mViewPager;
    private viewMainAdapter mainTab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = findViewById(R.id.mainViewPager);
        setupMainPager(mViewPager);
        mainTab = new viewMainAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mainTab);

        mTablay = findViewById(R.id.mainTabLayout);
        mTablay.setupWithViewPager(mViewPager);

        mTablay.getTabAt(0).setIcon(R.drawable.ic_home_);
        mTablay.getTabAt(1).setIcon(R.drawable.ic_chat_);
    }
    private void setupMainPager(ViewPager viewPager){
        viewMainAdapter adapter = new viewMainAdapter(getSupportFragmentManager());
        adapter.addFragment(new fm_home(),"Home");
        adapter.addFragment(new fm_chat(),"Chat");
        viewPager.setAdapter(adapter);
    }
}
