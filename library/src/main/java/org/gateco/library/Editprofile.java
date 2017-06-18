package org.gateco.library;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by Vahid on 06/18/2017.
 */

public class Editprofile extends LinearLayout {

    EditText name,username,email,address,phone;
    Button passchange,signout;

    public Editprofile (Context c){
        super(c);
        LayoutInflater.from(c).inflate(R.layout.editprofile,this);

        name = (EditText)findViewById(R.id.editprofile_edittext_name);
        username = (EditText)findViewById(R.id.editprofile_edittext_username);
        email = (EditText)findViewById(R.id.editprofile_edittext_email);
        address = (EditText)findViewById(R.id.editprofile_edittext_address);
        phone = (EditText)findViewById(R.id.editprofile_edittext_phone);
        passchange = (Button)findViewById(R.id.editprofile_button_passchange);
        signout = (Button)findViewById(R.id.editprofile_button_signout);

    }

    public  EditText getName(){return this.name;}
    public EditText getUsername(){return this.username;}
    public EditText getEmail(){return  this.email;}
    public EditText getAddress(){return  this.address;}
    public EditText getPhone(){return  this.phone;}
    public Button getPasschange(){return this.passchange;}
    public Button getSignout(){return this.signout;}

}
