package com.example.baitaptuan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class t3Adapter extends BaseAdapter {

    private ArrayList<Contact> ls;
    private Context context;

    public t3Adapter(ArrayList<Contact> ls, Context context) {
        this.ls = ls;
        this.context = context;
    }

    @Override
    public int getCount() {
        return ls.size();
    }

    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewAX vax;

        if(convertView == null){
            vax = new ViewAX();
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, null);
            vax.img_hinh= convertView.findViewById(R.id.t3ItemImage);
            vax.tv_ten= convertView.findViewById(R.id.t3ItemName);
            vax.tv_tuoi= convertView.findViewById(R.id.t3ItemAge);
            convertView.setTag(vax);
        }else{
            vax=(ViewAX) convertView.getTag();
        }

        vax.img_hinh.setImageResource(ls.get(position).getHinh());
        vax.tv_ten.setText(ls.get(position).getTen());
        vax.tv_tuoi.setText(ls.get(position).getTuoi());

        return convertView;
    }

    class ViewAX{
        ImageView img_hinh;
        TextView tv_ten, tv_tuoi;

    }
}
