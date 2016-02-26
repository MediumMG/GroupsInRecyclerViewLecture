package com.mediummg.grouprecyclerview.own;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mediummg.grouprecyclerview.R;

import java.util.ArrayList;

/**
 * Created by MediumMG on 22.02.2016.
 */
public class OwnGroupAdapter extends RecyclerView.Adapter<OwnViewHolder> {

    private ArrayList<OwnBase> mData = new ArrayList<>();

    public OwnGroupAdapter() {
        super();
    }

    public void setData(ArrayList<OwnBase> data) {
        mData = data;
    }

    @Override
    public int getItemViewType(int position) {
        return mData.get(position).getViewType();
    }

    @Override
    public OwnViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        switch (viewType) {
            case OwnBase.VIEW_TYPE_GROUP: {
                View v = inflater.inflate(R.layout.item_group, parent, false);
                return new OwnGroupViewHolder(v);
            }
            case OwnBase.VIEW_TYPE_CHILD: {
                View v = inflater.inflate(R.layout.item_child, parent, false);
                return new OwnChildViewHolder(v);
            }
        }
        return null;
    }

    @Override
    public void onBindViewHolder(OwnViewHolder holder, int position) {
        int viewType = getItemViewType(position);
        switch (viewType) {
            case OwnBase.VIEW_TYPE_GROUP: {
                OwnYear item = (OwnYear) mData.get(position);
                ((OwnGroupViewHolder) holder).mYearView.setText(String.valueOf(item.getYear()));
                ((OwnGroupViewHolder) holder).mBirthdayMenCount.setText(String.valueOf(item.getBirthdayMen().size()));
                ((OwnGroupViewHolder) holder).mIndicatorView.setExpandedState(item.isExpanded(), true);
                ((OwnGroupViewHolder) holder).itemView.setOnClickListener(new ItemAsGroupOnClickListener(item));
                break;
            }
            case OwnBase.VIEW_TYPE_CHILD: {
                OwnContact item = (OwnContact) mData.get(position);
                ((OwnChildViewHolder) holder).mNameView.setText(item.getName());
                ((OwnChildViewHolder) holder).mDOBView.setText(item.getDOB().toString("MMMM dd, yyyy"));
                break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    private class ItemAsGroupOnClickListener implements View.OnClickListener {

        private OwnYear mOwnYear;

        public ItemAsGroupOnClickListener(OwnYear ownYear) {
            super();
            mOwnYear = ownYear;
        }

        @Override
        public void onClick(View v) {
            int position = mData.indexOf(mOwnYear);
            if (position < 0)
                return;

            if (mOwnYear.isExpanded()) {
                // need to collapse inner group
                int countRemovedItems = 0;
                for (OwnContact contact : mOwnYear.getBirthdayMen()) {
                    if (mData.remove(contact))
                        countRemovedItems++;
                }
                mOwnYear.setExpanded(false);

                // notify about removing
                notifyItemRangeRemoved(position + 1, countRemovedItems);

                // notify to update clicked item for changing state
                notifyItemChanged(position);
            } else {
                // need to expand inner group
                mData.addAll(position + 1, mOwnYear.getBirthdayMen());
                mOwnYear.setExpanded(true);

                // notify about adding new items
                notifyItemRangeInserted(position + 1, mOwnYear.getBirthdayMen().size());

                // notify to update clicked item for changing state
                notifyItemChanged(position);
            }
        }
    }
}
