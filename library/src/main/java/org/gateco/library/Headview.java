package org.gateco.library;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 06/27/2017.
 */

public class Headview extends LinearLayout {

    TextView   name,info,primaryprice,secondaryprice,counter;
    ImageView  like,addcart,mark;

    public Headview (Context c){
        super(c);
        LayoutInflater.from(c).inflate(R.layout.headview,this);

        LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        setLayoutParams(params);



        name=findViewById(R.id.headview_textview_name);
        info=findViewById(R.id.headview_textview_info);
        primaryprice=findViewById(R.id.headview_textview_primaryprice);
        secondaryprice=findViewById(R.id.headview_textview_secondaryprice);
        counter=findViewById(R.id.headview_textview_counter);
        like=findViewById(R.id.headview_icon_like);
        addcart=findViewById(R.id.headview_icon_addcart);
        mark=findViewById(R.id.headview_checkbox_mark);

    }

    public TextView getName(){
        return this.name;
    }
    public TextView getInfo(){
        return this.info;
    }
    public TextView getCounter(){
        return this.counter;
    }
    public TextView getPrimaryprice(){
        return this.primaryprice;
    }
    public TextView getSecondaryprice(){
        return this.secondaryprice;
    }
    public ImageView getLike(){
        return this.like;
    }
    public ImageView getAddcart(){
        return this.addcart;
    }
    public ImageView getMark(){
        return this.mark;
    }

    public void isliked(boolean b){
        if (b) {
            like.setImageResource(R.drawable.ic_like_filled);
            like.setColorFilter(getResources().getColor(R.color.colorRed));        }
        else
            like.setImageResource(R.drawable.ic_like_blank);

    }


    public void setTypeFace(Typeface tf){

        name.setTypeface(tf);
        primaryprice.setTypeface(tf);
        secondaryprice.setTypeface(tf);
        info.setTypeface(tf);
        counter.setTypeface(tf);
    }
}
