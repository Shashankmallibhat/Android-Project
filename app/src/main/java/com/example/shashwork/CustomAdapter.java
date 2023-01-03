package com.example.shashwork;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String contactlist[];
    int flags[];
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, String[] contactlist, int[] flags){
        this.context = applicationContext;
        this.contactlist = contactlist;
        this.flags = flags;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount(){
        return contactlist.length;
    }

    @Override
    public Object getItem(int i){
        return null;
    }

    @Override
    public long getItemId(int i){
        return 0;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        view = inflater.inflate(R.layout.listview,null);
        TextView contact = view.findViewById(R.id.textView4);
        ImageView icon = view.findViewById(R.id.icon);
        contact.setText(contactlist[i]);
        icon.setImageResource(flags[0]);
        return view;
    }
}
