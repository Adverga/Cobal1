package com.papbl.cobal1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

<<<<<<< HEAD
    private BottomNavigationView btmNav;
    private viewMainAdapter mainTab;

=======
    private TabLayout mTablay;
    private ViewPager mViewPager;
    private viewAdapter mainTab;
>>>>>>> parent of c51d938... add home adapter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
        btmNav = findViewById(R.id.bottomNavigationView);
        btmNav.setOnNavigationItemSelectedListener(navSListener);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fm_container, new fm_contacs())
                .commit();
=======
        mViewPager = findViewById(R.id.mainViewPager);
        setupMainPager(mViewPager);
        mainTab = new viewAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mainTab);

        mTablay = findViewById(R.id.mainTabLayout);
        mTablay.setupWithViewPager(mViewPager);

        mTablay.getTabAt(0).setIcon(R.drawable.ic_home_);
        mTablay.getTabAt(1).setIcon(R.drawable.ic_chat_);
    }
    private void setupMainPager(ViewPager viewPager){
        viewAdapter adapter = new viewAdapter(getSupportFragmentManager());
        adapter.addFragment(new fm_home(),"Home");
        adapter.addFragment(new fm_chat(),"Chat");
        viewPager.setAdapter(adapter);
>>>>>>> parent of c51d938... add home adapter
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navSListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fm = null;
            switch (item.getItemId()){
                case R.id.contacsMenu:
                    fm = new fm_contacs();
                    break;
                case R.id.homeMenu:
                    fm = new fm_home();
                    break;
                case R.id.chatMenu:
                    fm = new fm_chat();
                    break;
            }
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fm_container, fm).commit();
            return true;
        }
    };
}
