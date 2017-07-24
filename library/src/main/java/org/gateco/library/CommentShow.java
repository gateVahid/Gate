package org.gateco.library;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 07/24/2017.
 */

public class CommentShow extends LinearLayout{

    TextView say,user;
    EditText comment;

    public CommentShow(Context c) {
        super(c);
        LayoutInflater.from(c).inflate(R.layout.comment_show, this);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));


        say = findViewById(R.id.commentshow_textview_say);
        user = findViewById(R.id.commentshow_textview_user);

        comment = findViewById(R.id.editprofile_edittext_name);

    }


    public TextView getSay(){
        return this.say;
    }
    public TextView getUser(){
        return this.getSay();
    }
    public EditText getComment(){
        return this.comment;
    }


    public void setTypeFace(Typeface tf){

        user.setTypeface(tf);
        say.setTypeface(tf);
        comment.setTypeface(tf);
    }

}
