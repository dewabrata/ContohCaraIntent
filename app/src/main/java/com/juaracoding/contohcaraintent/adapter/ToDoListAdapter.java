package com.juaracoding.contohcaraintent.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.juaracoding.contohcaraintent.R;
import com.juaracoding.contohcaraintent.model.ToDoList;

import java.util.List;

public class ToDoListAdapter extends ArrayAdapter<ToDoList> {

    private final LayoutInflater mInflater;
    private final Context mContext;
    private final List<ToDoList> items;
    private final int mResource;

    public ToDoListAdapter(@NonNull Context context, @LayoutRes int resource,
                           @NonNull List<ToDoList> objects) {
        super(context, resource, 0, objects);

        mContext = context;
        mInflater = LayoutInflater.from(context);
        mResource = resource;
        items = objects;
    }
    @Override
    public View getDropDownView(int position, @Nullable View convertView,
                                @NonNull ViewGroup parent) {
        return createItemView(position, convertView, parent);
    }

    @Override
    public @NonNull View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return createItemView(position, convertView, parent);
    }

    private View createItemView(int position, View convertView, ViewGroup parent){
        final View view = mInflater.inflate(mResource, parent, false);
        TextView txtNama = (TextView) view.findViewById(R.id.txtNama);
        TextView txtTanggal = (TextView) view.findViewById(R.id.txtTanggal);
        TextView txtNotes = (TextView) view.findViewById(R.id.txtNotes);
        TextView txtDeskripsi = (TextView) view.findViewById(R.id.txtDeskripsi);
        ImageView imgPriority = (ImageView) view.findViewById(R.id.imgPriority);



        imgPriority.setImageResource(R.drawable.middlepriority);

        txtNama.setText( items.get(position).getNama());
        txtTanggal.setText( items.get(position).getTanggal());
        txtNotes.setText( items.get(position).getNotes());
        txtDeskripsi.setText( items.get(position).getDeskripsi());
        return view;
    }
}