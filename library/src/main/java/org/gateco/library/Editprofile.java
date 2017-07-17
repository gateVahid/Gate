package org.gateco.library;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by Vahid on 06/18/2017.
 */

public class Editprofile extends LinearLayout {

    EditText name,username,email,address,phone;
    Button passchange;

    public Editprofile (Context c){
        super(c);
        LayoutInflater.from(c).inflate(R.layout.editprofile,this);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        name = (EditText)findViewById(R.id.editprofile_edittext_name);
        username = (EditText)findViewById(R.id.editprofile_edittext_username);
        email = (EditText)findViewById(R.id.editprofile_edittext_email);
        address = (EditText)findViewById(R.id.editprofile_edittext_address);
        phone = (EditText)findViewById(R.id.editprofile_edittext_phone);
        passchange = (Button)findViewById(R.id.editprofile_button_passchange);

    }

    public  EditText getName(){return this.name;}
    public EditText getUsername(){return this.username;}
    public EditText getEmail(){return  this.email;}
    public EditText getAddress(){return  this.address;}
    public EditText getPhone(){return  this.phone;}
    public Button getPasschange(){return this.passchange;}

    public void disable(){
        name.setEnabled(false);
        username.setEnabled(false);
        email.setEnabled(false);
        address.setEnabled(false);
        phone.setEnabled(false);

    }
    public void enable(){
        name.setEnabled(true);
        username.setEnabled(true);
        email.setEnabled(true);
        address.setEnabled(true);
        phone.setEnabled(true);

    }

}
