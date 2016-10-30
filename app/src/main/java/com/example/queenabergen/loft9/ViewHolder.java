package com.example.queenabergen.loft9;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by queenabergen on 10/21/16.
 */

public class ViewHolder extends RecyclerView.ViewHolder {
    private final View mimageView;
    private final View mTextView;
    private final View mTextView1;


    public ViewHolder(ViewGroup itemView) {
        super(itemView);
        mimageView = itemView.findViewById(R.id.ImageView);
        mTextView = itemView.findViewById(R.id.textView);
        mTextView1 = itemView.findViewById(R.id.textView2);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                int position = getAdapterPosition();
                switch(position){

                }
            }
        });
    }


    public TextView getTextView(){
        return (TextView) mTextView;
    }

    public TextView getTextView2(){
        return (TextView) mTextView1;
    }

    public View getMimageView() {
        return mimageView;
    }

    private static View inflateView(ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.content_navi_page,parent,false);
    }
}
