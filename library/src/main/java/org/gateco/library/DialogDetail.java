package org.gateco.library;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by Vahid on 06/27/2017.
 */

public class DialogDetail extends Dialog {

    TextView fieldTV,valueTV;
    EditText fieldET,valueET;
    Button ok;

    public DialogDetail(Context c){
        super(c);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_detail);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        setCanceledOnTouchOutside(true);
        setCancelable(true);

        fieldTV=(TextView)findViewById(R.id.dd_textview_fieldTV);
        valueTV=(TextView)findViewById(R.id.dd_textview_valueTV);
        fieldET=(EditText)findViewById(R.id.dd_edittext_fieldET);
        valueET=(EditText)findViewById(R.id.dd_edittext_valueET);
        ok=(Button)findViewById(R.id.dd_button_ok);

    }

    public TextView getFieldTV(){
        return this.fieldTV;
    }
    public TextView getValueTV(){
        return this.valueTV;
    }
    public EditText getFieldET(){
        return this.fieldET;
    }
    public EditText getValueET(){
        return this.valueET;
    }
    public  Button getOk(){
        return this.ok;
    }


    public void setTypeFace(Typeface tf){

        fieldTV.setTypeface(tf);
        valueTV.setTypeface(tf);
        fieldET.setTypeface(tf);
        valueET.setTypeface(tf);

        ok.setTypeface(tf);
    }


}