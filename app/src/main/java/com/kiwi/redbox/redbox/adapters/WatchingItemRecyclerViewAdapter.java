package com.kiwi.redbox.redbox.adapters;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kiwi.redbox.redbox.R;
import com.kiwi.redbox.redbox.fragments.WatchingFragment.OnListFragmentInteractionListener;
import com.kiwi.redbox.redbox.fragments.content.WatchingFlightsContent.WatchingFlight;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link WatchingFlight} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class WatchingItemRecyclerViewAdapter extends RecyclerView.Adapter<WatchingItemRecyclerViewAdapter.ViewHolder> {

    private final List<WatchingFlight> mValues;
    private final OnListFragmentInteractionListener mListener;

    public WatchingItemRecyclerViewAdapter(List<WatchingFlight> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mIdView.setText(mValues.get(position).route);
        holder.mContentView.setText("Demanded price: " + mValues.get(position).price + "€, Date: " + holder.mItem.date);


        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mContentView;
        public WatchingFlight mItem;
        public ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.id);
            mContentView = (TextView) view.findViewById(R.id.content);
            imageView = (ImageView) view.findViewById(R.id.list_item_status_picture);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
