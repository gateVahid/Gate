package org.gateco.library;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by Vahid on 06/25/2017.
 */

public class Expander extends LinearLayout {

    LinearLayout container;
    Button info;

    public Expander(Context c) {
        super(c);
        LayoutInflater.from(c).inflate(R.layout.expander,this);

        LayoutInflater.from(c).inflate(R.layout.expander, this);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        container = (LinearLayout) findViewById(R.id.expander_container_shortinfo);
        info = (Button) findViewById(R.id.expander_button_info);


    }

    public LinearLayout getContainer() {
        return this.container;
    }

    public Button getInfo() {
        return this.info;
    }


}

