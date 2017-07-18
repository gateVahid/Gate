package org.gateco.library;

import android.content.Context;
import android.graphics.Typeface;
import android.media.Image;
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

    ImageView icon,slider1IV,slider2IV,slider3IV,slider4IV,slider5IV,viewpagerpic;
    TextView nameTV,shortinfoTV,primarypriceTV,secondarypriceTV,infoTV,slider1TV,slider2TV,slider3TV,slider4TV,slider5TV,priorityTV,adddetail;
    EditText nameET,shortinfoET,primarypriceET,secondarypriceET,infoET,priorityET;
    CheckBox addspecial,viewpager;

    ImageView[] ivs = new ImageView[5];


    public AddProduct(Context c){
        super(c);
        LayoutInflater.from(c).inflate(R.layout.add_product, this);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));


        icon = (ImageView)findViewById(R.id.ap_imageview_icon);
        slider1IV = (ImageView)findViewById(R.id.ap_imageview_slider1IV);
        slider2IV = (ImageView)findViewById(R.id.ap_imageview_slider2IV);
        slider3IV = (ImageView)findViewById(R.id.ap_imageview_slider3IV);
        slider4IV = (ImageView)findViewById(R.id.ap_imageview_slider4IV);
        slider5IV = (ImageView)findViewById(R.id.ap_imageview_slider5IV);
        viewpagerpic = (ImageView)findViewById(R.id.ap_imageview_viewpagerpic);

        nameTV = (TextView)findViewById(R.id.ap_textview_nameTV);
        shortinfoTV = (TextView)findViewById(R.id.ap_textview_shortinfoTV);
        primarypriceTV = (TextView)findViewById(R.id.ap_textview_primarypriceTV);
        secondarypriceTV = (TextView)findViewById(R.id.ap_textview_secondarypriceTV);
        infoTV = (TextView)findViewById(R.id.ap_textview_infoTV);
        slider1TV = (TextView)findViewById(R.id.ap_textview_slider1TV);
        slider2TV = (TextView)findViewById(R.id.ap_textview_slider2TV);
        slider3TV = (TextView)findViewById(R.id.ap_textview_slider3TV);
        slider4TV = (TextView)findViewById(R.id.ap_textview_slider4TV);
        slider5TV = (TextView)findViewById(R.id.ap_textview_slider5TV);
        priorityTV = (TextView)findViewById(R.id.ap_textview_priorityTV);
        adddetail = (TextView)findViewById(R.id.ap_textview_adddetail);

        nameET = (EditText)findViewById(R.id.ap_edittext_nameET);
        shortinfoET = (EditText)findViewById(R.id.ap_edittext_shortinfoET);
        primarypriceET = (EditText)findViewById(R.id.ap_edittext_primarypriceET);
        secondarypriceET= (EditText)findViewById(R.id.ap_edittext_secondarypriceET);
        infoET = (EditText)findViewById(R.id.ap_edittext_infoET);
        priorityET = (EditText)findViewById(R.id.ap_editttext_priorityET);

        viewpager = (CheckBox)findViewById(R.id.ap_checkbox_viewpager);
        addspecial = (CheckBox)findViewById(R.id.ap_checkbox_addspecial);

        ivs[0] = slider1IV;
        ivs[1] = slider2IV;
        ivs[2] = slider3IV;
        ivs[3] = slider4IV;
        ivs[4] = slider5IV;

    }

    public ImageView getIcon(){
        return this.icon;
    }
    public ImageView getSlider1IV(){
        return this.slider1IV;
    }
    public ImageView getSlider2IV(){
        return this.slider2IV;
    }
    public ImageView getSlider3IV(){
        return this.slider3IV;
    }
    public ImageView getSlider4IV(){
        return this.slider4IV;
    }
    public ImageView getSlider5IV(){
        return this.slider5IV;
    }
    public ImageView getViewpagerpic(){
        return this.viewpagerpic;
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
    public TextView getSlider1TV(){
        return this.slider1TV;
    }
    public TextView getSlider2TV(){
        return this.slider2TV;
    }
    public TextView getSlider3TV(){
        return this.slider3TV;
    }
    public TextView getSlider4TV(){
        return this.slider4TV;
    }
    public TextView getSlider5TV(){
        return this.slider5TV;
    }
    public TextView getPriorityTV(){
        return this.priorityTV;
    }
    public TextView getAdddetail(){
        return this.adddetail;
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
    public EditText getPriorityET(){
        return this.priorityET;
    }


    public CheckBox getViewpager(){
        return this.viewpager;
    }
    public CheckBox getAddspecial(){
        return this.addspecial;
    }


    public ImageView[] getImageViews(){
        return this.ivs;
    }


    public void setTypeFace(Typeface tf){

        nameTV.setTypeface(tf);
        shortinfoTV.setTypeface(tf);
        primarypriceTV.setTypeface(tf);
        secondarypriceTV.setTypeface(tf);
        infoTV.setTypeface(tf);
        slider1TV.setTypeface(tf);
        slider2TV.setTypeface(tf);
        slider3TV.setTypeface(tf);
        slider4TV.setTypeface(tf);
        slider5TV.setTypeface(tf);
        priorityTV.setTypeface(tf);
        adddetail.setTypeface(tf);

        nameET.setTypeface(tf);
        shortinfoET.setTypeface(tf);
        primarypriceET.setTypeface(tf);
        secondarypriceET.setTypeface(tf);
        infoET.setTypeface(tf);
        priorityET.setTypeface(tf);

        viewpager.setTypeface(tf);
        addspecial.setTypeface(tf);

    }

}
