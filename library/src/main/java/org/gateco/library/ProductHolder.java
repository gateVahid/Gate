package org.gateco.library;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by Vahid on 06/25/2017.
 */


public class ProductHolder extends LinearLayout {

    LinearLayout image, head, info, detail;

    public ProductHolder(Context c) {
        super(c);
        LayoutInflater.from(c).inflate(R.layout.product_holder, this);

        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));


        image = findViewById(R.id.pHolder_layout_image);
        head = findViewById(R.id.pHolder_layout_head);
        info = findViewById(R.id.pHolder_layout_info);
        detail = findViewById(R.id.pHolder_layout_detail);

    }

    public LinearLayout getImage() {
        return this.image;
    }

    public LinearLayout getHead() {
        return this.head;
    }

    public LinearLayout getInfo() {
        return this.info;
    }

    public LinearLayout getDetail() {
        return this.detail;
    }





}

