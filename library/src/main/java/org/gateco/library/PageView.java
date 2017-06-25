package org.gateco.library;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 06/25/2017.
 */


public class PageView extends LinearLayout {

    TextView name;
    ImageView pic;

    public PageView(Context c) {
        super(c);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        LayoutInflater.from(c).inflate(R.layout.pageview,this);




        name = (TextView) findViewById(R.id.PageView_Imageview_name);
        pic = (ImageView) findViewById(R.id.PageView_Imageview_pic);


    }

    public TextView getName() {
        return this.name;
    }

    public ImageView getpic() {
        return this.pic;}

}
