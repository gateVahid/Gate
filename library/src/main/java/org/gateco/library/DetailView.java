package org.gateco.library;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 06/25/2017.
 */

public class DetailView extends LinearLayout {

    TextView name, value;

    public DetailView(Context c) {
        super(c);
        LayoutInflater.from(c).inflate(R.layout.detailview,this);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        value = (TextView) findViewById(R.id.adddetail_textview_value);
        name = (TextView) findViewById(R.id.adddetail_textview_name);


    }

    public TextView getname() {
        return this.name;
    }

    public TextView getvalue() {
        return this.value;
    }

}