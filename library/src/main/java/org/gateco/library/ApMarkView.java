package org.gateco.library;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 07/27/2017.
 */

public class ApMarkView extends LinearLayout {

    CheckBox addspecial, viewpager;
    ImageView viewpagerpic;
    TextView priorityTV;
    EditText priorityET;


    public ApMarkView(Context c) {
        super(c);
        LayoutInflater.from(c).inflate(R.layout.ap_markview, this);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        viewpagerpic =  findViewById(R.id.apmv_imageview_viewpagerpic);
        priorityTV = findViewById(R.id.apmv_textview_priorityTV);
        priorityET = findViewById(R.id.apmv_editttext_priorityET);
        viewpager = findViewById(R.id.apmv_checkbox_viewpager);
        addspecial = findViewById(R.id.apmv_checkbox_addspecial);

        setInvisible();

        viewpager.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(viewpager.isChecked())
                    setVisible();
                else
                    setInvisible();
            }
        });

    }

    private void setInvisible(){
        priorityTV.setVisibility(GONE);
        priorityET.setVisibility(GONE);
        viewpagerpic.setVisibility(GONE);
    }

    private void setVisible(){
        priorityTV.setVisibility(VISIBLE);
        priorityET.setVisibility(VISIBLE);
        viewpagerpic.setVisibility(VISIBLE);
    }


    public ImageView getViewpagerpic() {
        return this.viewpagerpic;
    }

    public EditText getPriorityET() {
        return this.priorityET;
    }

    public void setTypeFace(Typeface tf) {

        priorityTV.setTypeface(tf);
        priorityET.setTypeface(tf);

        viewpager.setTypeface(tf);
        addspecial.setTypeface(tf);

    }

}