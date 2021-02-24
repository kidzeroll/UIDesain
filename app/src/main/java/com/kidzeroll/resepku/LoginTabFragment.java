package com.kidzeroll.resepku;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class LoginTabFragment extends Fragment {
    EditText email, pass;
    Button login;
    TextView forgetPass;
    float v = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container,false);

        email = root.findViewById(R.id.email);
        pass = root.findViewById(R.id.pass);
        login = root.findViewById(R.id.button);
        forgetPass = root.findViewById(R.id.forget_pass);

        email.setTranslationX(800);
        pass.setTranslationX(800);
        login.setTranslationX(800);
        forgetPass.setTranslationX(800);

        email.setAlpha(v);
        pass.setAlpha(v);
        login.setAlpha(v);
        forgetPass.setAlpha(v);

        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        login.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        forgetPass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();


        return root;
    }
}
