package org.gateco.library;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 06/27/2017.
 */

public class Arrangmentlist extends LinearLayout {

    TextView  listname;
    ImageView  listicon;

    public Arrangmentlist(Context c){
        super(c);
        LayoutInflater.from(c).inflate(R.layout.arrangementlist,this);

        listname=(TextView) findViewById(R.id.arrangmentlist_textview_listname);
        listicon=(ImageView)findViewById(R.id.arrangmentlist_textview_listicon);

    }
    public TextView getListname(){

        return this.listname;
    }
    public  ImageView getListicon(){
        return this.listicon;
    }
}
