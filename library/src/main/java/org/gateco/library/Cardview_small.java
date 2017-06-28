package org.gateco.library;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 06/27/2017.
 */

public class Cardview_small extends LinearLayout{

    TextView  name,primaryprice,secondaryprice;
    ImageView pic;

    public  Cardview_small (Context c) {
        super(c);
        LayoutInflater.from(c).inflate(R.layout.register, this);

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
}
