package code.xp.social_app.view.Activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import java.util.ArrayList;

import code.xp.social_app.R;
import code.xp.social_app.view.myFirstShow.myFragment01;
import code.xp.social_app.view.myFirstShow.myFragment02;
import code.xp.social_app.view.myFirstShow.myFragment03;
import code.xp.social_app.view.myFirstShow.myFragment04;

public class MainActivity extends AppCompatActivity {

    private ViewPager vip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        vip = findViewById(R.id.main_vip);
        final ArrayList<Fragment> fragmentlist = new ArrayList<>();
        fragmentlist.add(new myFragment01());
        fragmentlist.add(new myFragment02());
        fragmentlist.add(new myFragment03());
        fragmentlist.add(new myFragment04());
        vip.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragmentlist.get(position);
            }

            @Override
            public int getCount() {
                return fragmentlist.size();
            }
        });
    }
}
