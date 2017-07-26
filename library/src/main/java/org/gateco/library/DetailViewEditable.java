package org.gateco.library;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 06/25/2017.
 */

public class DetailViewEditable extends LinearLayout {

    TextView name, value;
    ImageView close;

    public DetailViewEditable(Context c) {
        super(c);
        LayoutInflater.from(c).inflate(R.layout.detailview_editable,this);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        value = (TextView) findViewById(R.id.dveditable_textview_value);
        name = (TextView) findViewById(R.id.dveditable_textview_name);
        close = (ImageView)findViewById(R.id.dveditable_imageview_close);


    }

    public TextView getname() {
        return this.name;
    }

    public TextView getvalue() {
        return this.value;
    }

    public ImageView getClose(){
        return this.close;
    }


    public void setTypeFace(Typeface tf){

        name.setTypeface(tf);
        value.setTypeface(tf);
    }

}