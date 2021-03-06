package org.gateco.library;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by Vahid on 06/18/2017.
 */

public class Register extends LinearLayout {

    EditText user, pass, email;
    Button enter;

    public Register(Context c) {
        super(c);
        LayoutInflater.from(c).inflate(R.layout.register, this);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        user = (EditText) findViewById(R.id.register_edittext_username);
        pass = (EditText) findViewById(R.id.register_edittext_password);
        email = (EditText) findViewById(R.id.register_edittext_email);
        enter = (Button) findViewById(R.id.register_button_register);

    }

    public EditText getUser() {
        return this.user;
    }

    public EditText getPass() {
        return this.pass;
    }

    public EditText getEmail() {
        return this.email;
    }

    public Button getEnter() {
        return this.enter;
    }


    public void setTypeFace(Typeface tf){

        user.setTypeface(tf);
        pass.setTypeface(tf);
        email.setTypeface(tf);
        enter.setTypeface(tf);

    }

}


