package com.example.uteapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
public class TraAdapter  extends BaseAdapter {

    private List<Tra> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public TraAdapter(Context aContext,  List<Tra> listData) {
        this.context = aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.tra_item, null);
            holder = new ViewHolder();
            holder.image = (ImageView) convertView.findViewById(R.id.img_tra);
            holder.ten = (TextView) convertView.findViewById(R.id.ten_tra);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Tra tra = this.listData.get(position);
        holder.image.setImageResource(tra.getImage());
        holder.ten.setText(tra.getTen());

        return convertView;
    }

    static class ViewHolder {
        ImageView image;
        TextView ten;
    }
}
