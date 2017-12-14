package code.xp.social_app.view.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import code.xp.social_app.R;
import code.xp.social_app.view.myFirstShow.MyFragment01;
import code.xp.social_app.view.myFirstShow.MyFragment02;

public class MainActivity extends AppCompatActivity {

    private ViewPager vip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme_Launcher);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        vip = findViewById(R.id.main_vip);
        final ArrayList<Fragment> fragmentlist = new ArrayList<>();
        fragmentlist.add(new MyFragment01());
        fragmentlist.add(new MyFragment02());

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
