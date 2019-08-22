package com.juaracoding.contohcaraintent.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.juaracoding.contohcaraintent.R;
import com.juaracoding.contohcaraintent.model.ToDoList;

import java.util.ArrayList;
import java.util.List;


public class AdapterTodoListRecycle extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<ToDoList> items = new ArrayList<>();

    private Context ctx;
    private OnItemClickListener mOnItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(View view, ToDoList obj, int position);
    }

    public void setOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mOnItemClickListener = mItemClickListener;
    }

    public AdapterTodoListRecycle(Context context, List<ToDoList> items) {
        this.items = items;
        ctx = context;
    }

    public class OriginalViewHolder extends RecyclerView.ViewHolder {
        TextView txtNama ;
        TextView txtTanggal ;
        TextView txtNotes ;
        TextView txtDeskripsi;
        ImageView imgPriority ;

        public OriginalViewHolder(View view) {
              super(view);

             txtNama = (TextView) view.findViewById(R.id.txtNama);
             txtTanggal = (TextView) view.findViewById(R.id.txtTanggal);
             txtNotes = (TextView) view.findViewById(R.id.txtNotes);
             txtDeskripsi = (TextView) view.findViewById(R.id.txtDeskripsi);
             imgPriority = (ImageView) view.findViewById(R.id.imgPriority);

        }
    }



    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder vh;
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.to_do_list_item, parent, false);
        vh = new OriginalViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof OriginalViewHolder) {
            OriginalViewHolder view = (OriginalViewHolder) holder;

            ToDoList todo = items.get(position);

            view.txtNama.setText(todo.getNama());
            view.txtTanggal.setText(todo.getTanggal());
            view.txtNotes.setText(todo.getNotes());
            view.txtDeskripsi.setText(todo.getDeskripsi());

            switch (todo.getImportance()){
                case 1 : view.imgPriority.setImageResource(R.drawable.highpriority);
                break;
                case 2 : view.imgPriority.setImageResource(R.drawable.middlepriority);
                    break;
                case 3 : view.imgPriority.setImageResource(R.drawable.lowpriority);
                    break;
            }




        /*    view.name.setText(p.getOrderNo());
            view.description.setText(p.getShipName());
           // Tools.displayImageRound(ctx, view.image, p.image);
            view.image.setImageResource(R.drawable.img_social_instagram);
            view.lyt_parent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mOnItemClickListener != null) {
                        mOnItemClickListener.onItemClick(view, items.get(position), position);
                    }
                }
            });
            */
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}