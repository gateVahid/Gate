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

    LinearLayout container1,container2,container3,container4,container5;

    public Holder(Context c) {
        super(c);
        LayoutInflater.from(c).inflate(R.layout.holder,this);

        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));



        container1 = (LinearLayout) findViewById(R.id.holder_layout_container1);
        container2 = (LinearLayout) findViewById(R.id.holder_layout_container2);
        container3 = (LinearLayout) findViewById(R.id.holder_layout_container3);
        container4 = (LinearLayout) findViewById(R.id.holder_layout_container4);
        container5 = (LinearLayout) findViewById(R.id.holder_layout_container5);


    }

    public LinearLayout getContainer1() {return this.container1;
    }
    public LinearLayout getContainer2() {return this.container2;
    }
    public LinearLayout getContainer3() {return this.container3;
    }
    public LinearLayout getContainer4() {return this.container4;
    }
    public LinearLayout getContainer5() {return this.container5;
    }






}

