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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 06/18/2017.
 */

public class Login extends LinearLayout {

    EditText user, pass;
    Button guest, register, enter;
    TextView forgetpass;
    CheckBox check;

    public static final String ENTER_TEXT = "ورود";
    public static final String FORGET_TEXT = "بازیابی رمز عبور";



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
        forgetpass = (TextView)findViewById(R.id.login_textview_forgetpass);
        check = (CheckBox)findViewById(R.id.login_checkbox_check);




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

    public TextView getForgetpass(){
        return this.forgetpass;
    }

    public CheckBox getCheck(){
        return this.check;
    }

    public void ForgetMode(){
        pass.setVisibility(GONE);
        guest.setVisibility(GONE);
        register.setVisibility(GONE);
        enter.setText(FORGET_TEXT);
    }

    public void NormalMode(){
        pass.setVisibility(VISIBLE);
        guest.setVisibility(VISIBLE);
        register.setVisibility(VISIBLE);
        enter.setText(ENTER_TEXT);
    }

}

