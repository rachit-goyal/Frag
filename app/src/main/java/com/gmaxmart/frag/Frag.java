package com.gmaxmart.frag;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Frag extends Fragment {
    CallBackIntr callBackIntr;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.frag2,container,false);

        Intercheck();


        return v;
    }

    private void Intercheck() {
        callBackIntr.calldata();

    }

    public void setcallbackinterface(CallBackIntr callBackIntr){
        this.callBackIntr=callBackIntr;

    }


}
