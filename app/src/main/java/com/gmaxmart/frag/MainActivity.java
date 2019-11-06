package com.gmaxmart.frag;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements CallBackIntr {
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransactionf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        fragmentManager.addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {
            @Override
            public void onBackStackChanged() {
                Log.d("value",fragmentManager.getBackStackEntryCount()+"");
            }
        });
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addfragment();
            }
        });

    }
    private void addfragment(){
        Fragment fragment;
        switch (fragmentManager.getBackStackEntryCount()){
            case 0:fragment=new Frag();
            break;
            case 1:fragment=new Frag2();
            break;
            case 3:fragment=new Frag3();
            break;
            default:fragment=new Frag();
            break;

        }
        fragmentTransactionf=fragmentManager.beginTransaction();
        fragmentTransactionf.add(R.id.cobtainer,fragment);
        fragmentTransactionf.addToBackStack(null);
        fragmentTransactionf.commit();
    }

    @Override
    public void calldata() {
        int i=2+123;
        String stst="test";
        String stdfst="tedfgst";
    }
}
