package org.gateco.library;

import android.content.Context;
import android.graphics.Typeface;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 07/10/2017.
 */

public class AddProduct extends LinearLayout {

    ImageView icon;
    TextView nameTV,shortinfoTV,primarypriceTV,secondarypriceTV,infoTV;
    EditText nameET,shortinfoET,primarypriceET,secondarypriceET,infoET;


    public AddProduct(Context c){
        super(c);
        LayoutInflater.from(c).inflate(R.layout.add_product, this);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));


        icon = (ImageView)findViewById(R.id.ap_imageview_icon);

        nameTV = (TextView)findViewById(R.id.ap_textview_nameTV);
        shortinfoTV = (TextView)findViewById(R.id.ap_textview_shortinfoTV);
        primarypriceTV = (TextView)findViewById(R.id.ap_textview_primarypriceTV);
        secondarypriceTV = (TextView)findViewById(R.id.ap_textview_secondarypriceTV);
        infoTV = findViewById(R.id.ap_textview_infoTV);


        nameET = findViewById(R.id.ap_edittext_nameET);
        shortinfoET = findViewById(R.id.ap_edittext_shortinfoET);
        primarypriceET = findViewById(R.id.ap_edittext_primarypriceET);
        secondarypriceET= findViewById(R.id.ap_edittext_secondarypriceET);
        infoET = findViewById(R.id.ap_edittext_infoET);


    }

    public ImageView getIcon(){
        return this.icon;
    }


    public TextView getNameTV(){
        return this.nameTV;
    }
    public TextView getShortinfoTV(){
        return this.shortinfoTV;
    }
    public TextView getPrimarypriceTV(){
        return this.primarypriceTV;
    }
    public TextView getSecondarypriceTV(){
        return this.secondarypriceTV;
    }
    public TextView getInfoTV(){
        return this.infoTV;
    }


    public EditText getNameET(){
        return this.nameET;
    }
    public EditText getShortinfoET(){
        return this.shortinfoET;
    }
    public EditText getPrimarypriceET(){
        return this.primarypriceET;
    }
    public EditText getSecondarypriceET(){
        return this.secondarypriceET;
    }
    public EditText getInfoET(){
        return this.infoET;
    }



    public void setTypeFace(Typeface tf){

        nameTV.setTypeface(tf);
        shortinfoTV.setTypeface(tf);
        primarypriceTV.setTypeface(tf);
        secondarypriceTV.setTypeface(tf);
        infoTV.setTypeface(tf);


        nameET.setTypeface(tf);
        shortinfoET.setTypeface(tf);
        primarypriceET.setTypeface(tf);
        secondarypriceET.setTypeface(tf);
        infoET.setTypeface(tf);

    }

}
