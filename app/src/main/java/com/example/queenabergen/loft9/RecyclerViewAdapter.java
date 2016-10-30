package com.example.queenabergen.loft9;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by queenabergen on 10/21/16.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.DataHolder> {
    private List<ListItem> listData;
    private LayoutInflater inflater;

    public RecyclerViewAdapter(List<ListItem> listData, Context c){
        inflater = LayoutInflater.from(c);
        this.listData = listData;
    }

    @Override
    public RecyclerViewAdapter.DataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.viewholder, parent, false);
        return new DataHolder(view);
    }

    @Override
    public void onBindViewHolder(DataHolder holder, int position) {
        ListItem item = listData.get(position);
        holder.title.setText(item.getTitle());
        holder.subtitle.setText(item.getSubtitle());
        holder.icon.setImageResource(item.getImageResId());
// Picasso.with(holder.icon.getContext()).load(item.getUrl()).into(holder.icon);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class DataHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private TextView subtitle;
        private ImageView icon;
        private View container;


        public DataHolder(View itemView) {
            super(itemView);

            title = (TextView)itemView.findViewById(R.id.textView);
            subtitle = (TextView)itemView.findViewById(R.id.textView2);
            icon = (ImageView)itemView.findViewById(R.id.ImageView);
            container = itemView.findViewById(R.id.content_navi_page);
        }
    }
}
