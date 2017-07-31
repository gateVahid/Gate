package org.gateco.library;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 07/27/2017.
 */

public class ApAddDetail extends LinearLayout {


    TextView adddetail;
    LinearLayout detailcontainer;

    public ApAddDetail(Context c) {
        super(c);
        LayoutInflater.from(c).inflate(R.layout.ap_adddetail, this);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));


        adddetail = findViewById(R.id.ap_textview_adddetail);
        detailcontainer = findViewById(R.id.ap_layout_detailcontainer);
    }

        public TextView getAdddetail(){
            return this.adddetail;
        }
        public LinearLayout getDetailcontainer(){
            return this.detailcontainer;
        }


    public void setTypeFace(Typeface tf){
        adddetail.setTypeface(tf);
    }




    }
