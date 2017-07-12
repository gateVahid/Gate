package org.gateco.library;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by Vahid on 06/18/2017.
 */

public class Login extends LinearLayout {

    EditText user, pass;
    Button guest, register, enter;


    public Login(Context c) {
        super(c);
        LayoutInflater.from(c).inflate(R.layout.login, this);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        user = (EditText) findViewById(R.id.login_edittext_username);
        pass = (EditText) findViewById(R.id.login_edittext_password);
        guest = (Button) findViewById(R.id.login_button_guest);
        register = (Button) findViewById(R.id.login_button_register);
        enter = (Button) findViewById(R.id.login_button_enter);




    }

    public EditText getUser() {

        return this.user;
    }

    public EditText getPass() {
        return this.pass;
    }

    public Button getGuest() {
        return this.guest;
    }

    public Button getRegister() {
        return this.register;
    }

    public Button getEnter() {
        return this.enter;
    }
}

