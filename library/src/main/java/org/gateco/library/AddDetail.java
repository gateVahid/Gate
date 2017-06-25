package org.gateco.library;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 06/25/2017.
 */

public class AddDetail extends LinearLayout {

    TextView item, detail;

    public AddDetail(Context c) {
        super(c);
        LayoutInflater.from(c).inflate(R.layout.add_detail,this);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        detail = (TextView) findViewById(R.id.adddetail_textview_detail);
        item = (TextView) findViewById(R.id.adddetail_textview_item);


    }

    public TextView getitem() {
        return this.item;
    }

    public TextView getdetaail() {
        return this.detail;
    }

}