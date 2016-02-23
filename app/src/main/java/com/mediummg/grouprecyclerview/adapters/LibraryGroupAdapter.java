package com.mediummg.grouprecyclerview.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.h6ah4i.android.widget.advrecyclerview.expandable.RecyclerViewExpandableItemManager;
import com.h6ah4i.android.widget.advrecyclerview.utils.AbstractExpandableItemAdapter;
import com.mediummg.grouprecyclerview.R;
import com.mediummg.grouprecyclerview.models.LibraryContact;
import com.mediummg.grouprecyclerview.models.LibraryYear;
import com.mediummg.grouprecyclerview.viewholders.LibraryChildViewHolder;
import com.mediummg.grouprecyclerview.viewholders.LibraryGroupViewHolder;

import java.util.ArrayList;

/**
 * Created by MediumMG on 22.02.2016.
 */
public class LibraryGroupAdapter extends AbstractExpandableItemAdapter<LibraryGroupViewHolder, LibraryChildViewHolder> {

    private ArrayList<LibraryYear> mData = new ArrayList<>();

    public LibraryGroupAdapter() {
        super();

        // REQUIRED !!!
        setHasStableIds(true);
    }

    public void setData(ArrayList<LibraryYear> data) {
        mData = data;
    }

    @Override
    public int getGroupCount() {
        return mData.size();
    }

    @Override
    public int getChildCount(int groupPosition) {
        return mData.get(groupPosition).getBirthdayMen().size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return mData.get(groupPosition).getId();
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return mData.get(groupPosition).getBirthdayMen().get(childPosition).getId();
    }

    @Override
    public int getGroupItemViewType(int groupPosition) {
        return 0;
    }

    @Override
    public int getChildItemViewType(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public LibraryGroupViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_group, parent, false);
        return new LibraryGroupViewHolder(v);
    }

    @Override
    public LibraryChildViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_child, parent, false);
        return new LibraryChildViewHolder(v);
    }

    @Override
    public void onBindGroupViewHolder(LibraryGroupViewHolder holder, int groupPosition, int viewType) {
        final LibraryYear item = mData.get(groupPosition);

        final int expandState = holder.getExpandStateFlags();
        boolean isExpanded = (expandState & RecyclerViewExpandableItemManager.STATE_FLAG_IS_EXPANDED) != 0;
        boolean animateIndicator = (expandState & RecyclerViewExpandableItemManager.STATE_FLAG_HAS_EXPANDED_STATE_CHANGED) != 0;

        holder.mYearView.setText(String.valueOf(item.getYear()));
        holder.mBirthdayMenCount.setText(String.valueOf(item.getBirthdayMen().size()));
        holder.mIndicatorView.setExpandedState(isExpanded, animateIndicator);
    }

    @Override
    public void onBindChildViewHolder(LibraryChildViewHolder holder, int groupPosition, int childPosition, int viewType) {
        final LibraryContact item = mData.get(groupPosition).getBirthdayMen().get(childPosition);

        holder.mNameView.setText(item.getName());
        holder.mDOBView.setText(item.getDOB().toString("MMMM dd, yyyy"));
    }

    @Override
    public boolean onCheckCanExpandOrCollapseGroup(LibraryGroupViewHolder holder, int groupPosition, int x, int y, boolean expand) {
        return true;
    }
}
