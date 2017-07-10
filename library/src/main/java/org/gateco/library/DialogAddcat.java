package org.gateco.library;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 06/25/2017.
 */

public class DialogAddcat extends Dialog {

    ImageView addimage;
    TextView catnameT;
    EditText catnameE;
    Button ok;

    public DialogAddcat(Context c) {
        super(c);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_addcat);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        setCanceledOnTouchOutside(true);
        setCancelable(true);


        addimage = (ImageView) findViewById(R.id.dac_imageview_addimage);
        catnameT = (TextView) findViewById(R.id.dac_textview_catnameT);
        catnameE = (EditText) findViewById(R.id.dac_edittext_catnameE);
        ok = (Button) findViewById(R.id.dac_button_ok);




    }

    public ImageView getAddimage() {

        return this.addimage;
    }

    public TextView getCatnameT() {

        return this.catnameT;
    }
    public  EditText getCatnameE(){
        return this.catnameE;
    }
    public Button getOk(){
        return this.ok;
    }


}