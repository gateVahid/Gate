package org.gateco.library;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by Vahid on 06/25/2017.
 */


public class Holder extends LinearLayout {

    LinearLayout container1, container2, container3, container4, container5;

    public Holder(Context c) {
        super(c);
        LayoutInflater.from(c).inflate(R.layout.holder, this);

        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));


        container1 = findViewById(R.id.holder_layout_container1);
        container2 = findViewById(R.id.holder_layout_container2);
        container3 = findViewById(R.id.holder_layout_container3);
        container4 = findViewById(R.id.holder_layout_container4);
        container5 = findViewById(R.id.holder_layout_container5);

    }

    public LinearLayout getContainer1(int w, int h) {
        container1.setLayoutParams(new LinearLayout.LayoutParams(w, h));
        return this.container1;
    }

    public LinearLayout getContainer2(int w, int h) {
        container2.setLayoutParams(new LinearLayout.LayoutParams(w, h));
        return this.container2;
    }

    public LinearLayout getContainer3(int w, int h) {
        container3.setLayoutParams(new LinearLayout.LayoutParams(w, h));
        return this.container3;
    }

    public LinearLayout getContainer4(int w, int h) {
        container4.setLayoutParams(new LinearLayout.LayoutParams(w, h));
        return this.container4;
    }

    public LinearLayout getContainer5(int w,int h) {
        container5.setLayoutParams(new LinearLayout.LayoutParams(w, h));
        return this.container5;
    }


}

