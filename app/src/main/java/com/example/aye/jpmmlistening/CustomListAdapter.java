package com.example.aye.jpmmlistening;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomListAdapter extends ArrayAdapter<String> {

    private Activity context;
    private String[] itemname;
    private Integer[] imgId;
    private Integer[] imgId1;

    public CustomListAdapter(Activity context, String[] itemname, Integer[] imgId, Integer[] imgId1) {
        super(context, R.layout.mylist, itemname);
        this.itemname = itemname;
        this.context = context;
        this.imgId = imgId;
        this.imgId1 = imgId1;
    }

    public View getView(int postion, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowview = inflater.inflate(R.layout.mylist, null, true);

        TextView txt = (TextView) rowview.findViewById(R.id.txt);
        ImageView img = (ImageView) rowview.findViewById(R.id.img);
        ImageView img1 = (ImageView) rowview.findViewById(R.id.imgright);

        txt.setText(itemname[postion]);
        img.setImageResource(imgId[postion]);
        img1.setImageResource(imgId1[postion]);

        return rowview;
    }

}
