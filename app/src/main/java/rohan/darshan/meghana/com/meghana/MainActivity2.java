package rohan.darshan.meghana.com.meghana;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import com.github.florent37.materialviewpager.MaterialViewPager;
import com.github.florent37.materialviewpager.header.HeaderDesign;


public class MainActivity2 extends FragmentActivity {

//    VideoView view;

    MaterialViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);


        mViewPager = (MaterialViewPager) findViewById(R.id.materialViewPager);
        mViewPager.getPagerTitleStrip().setTextColor(Color.parseColor("#ffffff"));
//        mViewPager.getPagerTitleStrip().setViewPager(mViewPager.getViewPager());
        mViewPager.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int i) {
                switch (i) {
                    case 0:
//                        return HeaderDesign.fromColorAndDrawable(R.color.blue,first);
                        return HeaderDesign.fromColorResAndUrl(
                                R.color.blue,
                                "http://cdn1.tnwcdn.com/wp-content/blogs.dir/1/files/2014/06/wallpaper_51.jpg");
                    case 1:
//                        return HeaderDesign.fromColorAndDrawable(R.color.blue,second);
                        return HeaderDesign.fromColorResAndUrl(
                                R.color.green,
                                "https://fs01.androidpit.info/a/63/0e/android-l-wallpapers-630ea6-h900.jpg");
                    case 2:
                        return HeaderDesign.fromColorResAndUrl(
                                R.color.cyan,
                                "http://www.droid-life.com/wp-content/uploads/2014/10/lollipop-wallpapers10.jpg");

                    case 3:
                        return HeaderDesign.fromColorResAndUrl(
                                R.color.cyan,
                                "http://www.droid-life.com/wp-content/uploads/2014/10/lollipop-wallpapers10.jpg");

                }
                return null;
            }
        });

        ViewPager viewPager = mViewPager.getViewPager();
        viewPager.setAdapter(new adap(getSupportFragmentManager()));

        mViewPager.getPagerTitleStrip().setViewPager(mViewPager.getViewPager());

    }


    class adap extends FragmentPagerAdapter {

        public adap(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int i) {
            Fragment fragment;
            if (i == 0)
                fragment = new first();
            else if (i == 1)
                fragment = new second();
            else if (i == 2)
                fragment = new second();
            else
                fragment = new second();
            return fragment;
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            return super.instantiateItem(container, position);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if (position == 0)
                return "Numbers";
            else if (position == 1)
                return "Addition";
            else if (position == 2)
                return "Subtraction";
            else return "Multiplication";
        }
    }


/*

    @Override
    public void onClick(View v) {
        if (view.isPlaying()) {
            view.pause();
        } else {
            view.start();
        }
    }
*/
}
