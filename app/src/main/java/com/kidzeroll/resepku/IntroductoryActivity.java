package com.kidzeroll.resepku;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class IntroductoryActivity extends AppCompatActivity {

    ImageView splashImg, logo, appName;
    LottieAnimationView lottieAnimationView;

    private static final int NUM_PAGES =3;
    private ViewPager viewPager;
    private ScreenSlidePagerAdapter pagerAdapter;

    Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);

        //fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        splashImg = findViewById(R.id.img);
        logo = findViewById(R.id.logo);
        appName = findViewById(R.id.app_name);
        lottieAnimationView = findViewById(R.id.lottie);

        viewPager = findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        anim = AnimationUtils.loadAnimation(this, R.anim.o_b_anim);
        viewPager.startAnimation(anim);

        //Animasi
        splashImg.animate().translationY(-2500).setDuration(1000).setStartDelay(4000);
        logo.animate().translationY(2100).setDuration(1000).setStartDelay(4000);
        appName.animate().translationY(2100).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(2100).setDuration(1000).setStartDelay(4000);


    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {

        public ScreenSlidePagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    OnBoardingFragment1 tab1 = new OnBoardingFragment1();
                    return tab1;
                case 1:
                    OnBoardingFragment2 tab2 = new OnBoardingFragment2();
                    return tab2;
                case 2:
                    OnBoardingFragment3 tab3 = new OnBoardingFragment3();
                    return tab3;
            }
            return null;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}