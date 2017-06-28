package org.gateco.library;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 06/27/2017.
 */

public class Headview extends LinearLayout {

    TextView   name,info,primaryprice,secondaryprice;
    ImageView  like,addcart,mark;

    public Headview (Context c){
        super(c);
        LayoutInflater.from(c).inflate(R.layout.headview,this);

        LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        setLayoutParams(params);



        name=(TextView)findViewById(R.id.headview_textview_name);
        info=(TextView)findViewById(R.id.headview_textview_info);
        primaryprice=(TextView)findViewById(R.id.headview_textview_primaryprice);
        secondaryprice=(TextView)findViewById(R.id.headview_textview_secondaryprice);
        like=(ImageView)findViewById(R.id.headview_icon_like);
        addcart=(ImageView)findViewById(R.id.headview_icon_addcart);
        mark=(ImageView)findViewById(R.id.headview_icon_mark);

    }

    public TextView getName(){
        return this.name;
    }
    public TextView getInfo(){
        return this.info;
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

    public void setliked(boolean b){
        if (b)
            like.setImageResource(R.drawable.ic_like_filled);
        else
            like.setImageResource(R.drawable.ic_like_blank);

    }
}
