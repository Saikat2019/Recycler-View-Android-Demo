package com.example.saikatmondal.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private String[] mDataset;
    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(String[] myDataset) {
        mDataset = myDataset;
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView mTextView;
        // each data item is just a string in this case
        public MyViewHolder(View v){
            super(v);
            mTextView = (TextView) v;
        }
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mTextView.setText(mDataset[position]);

    }

    //@NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.txt_view,viewGroup,false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
