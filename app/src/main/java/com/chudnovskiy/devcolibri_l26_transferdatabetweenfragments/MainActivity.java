package com.chudnovskiy.devcolibri_l26_transferdatabetweenfragments;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.chudnovskiy.devcolibri_l26_transferdatabetweenfragments.fragment.TwoFragment;

public class MainActivity extends FragmentActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private Button buttonSendText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        initFragmentLast();


    }

    private void initFragmentLast() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container, new TwoFragment());
        fragmentTransaction.commit();
    }

}