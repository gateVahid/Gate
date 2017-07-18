package org.gateco.library;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
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

public class DialogAddcatSub extends Dialog {

    ImageView addimage;
    TextView subnameT;
    EditText subnameE;
    Button ok;

    public DialogAddcatSub(Context c) {
        super(c);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_addcat_sub);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        setCanceledOnTouchOutside(true);
        setCancelable(true);


        addimage = (ImageView) findViewById(R.id.dacs_imageview_addimage);
        subnameT = (TextView) findViewById(R.id.dacs_textview_subnameT);
        subnameE = (EditText) findViewById(R.id.dacs_edittext_subnameE);
        ok = (Button) findViewById(R.id.dacs_button_ok);




    }

    public ImageView getAddimage() {

        return this.addimage;
    }

    public TextView getSubnameT() {

        return this.subnameT;
    }
    public  EditText getSubnameE(){

        return this.subnameE;
    }
    public Button getOk(){

        return this.ok;
    }


    public void setTypeFace(Typeface tf){

        subnameE.setTypeface(tf);
        subnameT.setTypeface(tf);
        ok.setTypeface(tf);
    }


}