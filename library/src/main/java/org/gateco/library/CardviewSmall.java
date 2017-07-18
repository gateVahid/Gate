package org.gateco.library;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 06/27/2017.
 */

public class CardviewSmall extends LinearLayout{

    TextView  name,primaryprice,secondaryprice;
    ImageView pic;

    public CardviewSmall(Context c) {
        super(c);
        LayoutInflater.from(c).inflate(R.layout.cardview_small, this);

        name = (TextView) findViewById(R.id.cardviews_textview_name);
        primaryprice = (TextView) findViewById(R.id.cardview_textview_primaryprice);
        secondaryprice = (TextView) findViewById(R.id.cardview_textview_secondaryprice);
        pic = (ImageView) findViewById(R.id.cardviews_imageview_pic);

    }
    public TextView getName(){
        return this.name;
    }

    public TextView getPrimaryprice(){
        return this.primaryprice;
    }
    public  TextView getSecondaryprice(){
        return this.secondaryprice;
    }
    public ImageView getPic(){
        return this.pic;
    }


    public void setTypeFace(Typeface tf){

        name.setTypeface(tf);
        primaryprice.setTypeface(tf);
        secondaryprice.setTypeface(tf);

    }
}
