package org.gateco.library;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 08/02/2017.
 */

public class ApSlider extends LinearLayout {


    TextView slider1TV, slider2TV, slider3TV, slider4TV, slider5TV;
    ImageView slider1IV, slider2IV, slider3IV, slider4IV, slider5IV;

    ImageView[] ivs = new ImageView[5];


    public ApSlider(Context c) {
        super(c);
        LayoutInflater.from(c).inflate(R.layout.ap_slider, this);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));


        slider1IV = (ImageView) findViewById(R.id.ap_imageview_slider1IV);
        slider2IV = (ImageView) findViewById(R.id.ap_imageview_slider2IV);
        slider3IV = (ImageView) findViewById(R.id.ap_imageview_slider3IV);
        slider4IV = (ImageView) findViewById(R.id.ap_imageview_slider4IV);
        slider5IV = (ImageView) findViewById(R.id.ap_imageview_slider5IV);

        slider1TV = findViewById(R.id.ap_textview_slider1TV);
        slider2TV = findViewById(R.id.ap_textview_slider2TV);
        slider3TV = findViewById(R.id.ap_textview_slider3TV);
        slider4TV = findViewById(R.id.ap_textview_slider4TV);
        slider5TV = findViewById(R.id.ap_textview_slider5TV);

        ivs[0] = slider1IV;
        ivs[1] = slider2IV;
        ivs[2] = slider3IV;
        ivs[3] = slider4IV;
        ivs[4] = slider5IV;
    }

    public ImageView getSlider1IV() {
        return this.slider1IV;
    }

    public ImageView getSlider2IV() {
        return this.slider2IV;
    }

    public ImageView getSlider3IV() {
        return this.slider3IV;
    }

    public ImageView getSlider4IV() {
        return this.slider4IV;
    }

    public ImageView getSlider5IV() {
        return this.slider5IV;
    }

    public TextView getSlider1TV() {
        return this.slider1TV;
    }

    public TextView getSlider2TV() {
        return this.slider2TV;
    }

    public TextView getSlider3TV() {
        return this.slider3TV;
    }

    public TextView getSlider4TV() {
        return this.slider4TV;
    }

    public TextView getSlider5TV() {
        return this.slider5TV;
    }

    public ImageView[] getImageViews() {
        return this.ivs;
    }


    public void setTypeFace(Typeface tf) {
        slider1TV.setTypeface(tf);
        slider2TV.setTypeface(tf);
        slider3TV.setTypeface(tf);
        slider4TV.setTypeface(tf);
        slider5TV.setTypeface(tf);
    }


}
