package org.gateco.library;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 07/12/2017.
 */

public class DialogMakeSure extends Dialog {

    TextView title,massage;
    Button yes,no;

    public DialogMakeSure (Context c) {
        super(c);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_make_sure);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        setCanceledOnTouchOutside(true);
        setCancelable(true);

        title = (TextView)findViewById(R.id.dms_title);
        massage = (TextView)findViewById(R.id.dms_massage);
        yes = (Button) findViewById(R.id.dms_yes);
        no = (Button)findViewById(R.id.dms_no);

    }


    public TextView getTitle(){
        return this.title;
    }
    public TextView getMassage(){
        return this.massage;
    }
    public Button getYes(){
        return this.yes;
    }
    public Button getNo(){
        return this.no;
    }


    public void setTypeFace(Typeface tf){

        title.setTypeface(tf);
        massage.setTypeface(tf);
        yes.setTypeface(tf);
        no.setTypeface(tf);
    }




}
