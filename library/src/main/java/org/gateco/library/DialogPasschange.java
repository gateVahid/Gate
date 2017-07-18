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

public class DialogPasschange extends Dialog {

    TextView oldpassT,newpassT,retypenewpassT;
    EditText oldpassE,newpassE,retypenewpassE;
    Button ok;

    public DialogPasschange(Context c){
        super(c);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialoge_passchange);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        setCanceledOnTouchOutside(true);
        setCancelable(true);

        oldpassT=(TextView)findViewById(R.id.dialog_textview_oldpass);
        newpassT=(TextView)findViewById(R.id.dialog_texview_newpass);
        retypenewpassT=(TextView)findViewById(R.id.dialog_texview_retypenewpass);
        oldpassE=(EditText)findViewById(R.id.dialoge_edittext_oldpass);
        newpassE=(EditText)findViewById(R.id.dialoge_edittext_newpass);
        retypenewpassE=(EditText)findViewById(R.id.dialoge_edittext_retypenewpass);
        ok=(Button)findViewById(R.id.dialog_button_ok);

    }

    public TextView getOldpassT(){
        return this.oldpassT;
    }
    public TextView getNewpassT(){
        return this.newpassT;
    }
    public TextView getRetypenewpassT(){
        return this.retypenewpassT;
    }
    public EditText getOldpassE(){
        return this.oldpassE;
    }
    public EditText getNewpassE(){
        return this.newpassE;
    }
    public  EditText getRetypenewpassE(){
        return this.retypenewpassE;
    }
    public  Button getOk(){
        return this.ok;
    }


    public void setTypeFace(Typeface tf){

        oldpassT.setTypeface(tf);
        newpassT.setTypeface(tf);
        retypenewpassT.setTypeface(tf);
        oldpassE.setTypeface(tf);
        newpassE.setTypeface(tf);
        retypenewpassE.setTypeface(tf);
        ok.setTypeface(tf);
    }


}
