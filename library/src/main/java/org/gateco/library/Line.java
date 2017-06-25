package org.gateco.library;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 06/25/2017.
 */


public class Line extends LinearLayout {

    TextView name;
    Button more;
    LinearLayout container;

    public Line(Context c) {
        super(c);
        LayoutInflater.from(c).inflate(R.layout.line,this);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        name = (TextView) findViewById(R.id.line_textview_name);
        more = (Button) findViewById(R.id.line_button_more);
        container = (LinearLayout) findViewById(R.id.line_layout_container);


    }

    public TextView getName() {

        return this.name;
    }

    public Button getmore() {
        return this.more;
    }

    public  LinearLayout getContainer(){
        return  this.container;}

}
