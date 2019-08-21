package com.papbl.cobal1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView btmNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btmNav = findViewById(R.id.bottomNavigationView);
        btmNav.setOnNavigationItemSelectedListener(navSListener);

        btmNav.setSelectedItemId(R.id.homeMenu);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fm_container, new fm_home())
                .commit();
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
