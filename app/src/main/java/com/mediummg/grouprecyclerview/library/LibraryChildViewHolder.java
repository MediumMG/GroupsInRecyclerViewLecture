package com.mediummg.grouprecyclerview.library;

import android.view.View;
import android.widget.TextView;

import com.h6ah4i.android.widget.advrecyclerview.utils.AbstractExpandableItemViewHolder;
import com.mediummg.grouprecyclerview.R;

/**
 * Created by MediumMG on 22.02.2016.
 */
public class LibraryChildViewHolder extends AbstractExpandableItemViewHolder {

    public TextView mNameView, mDOBView;

    public LibraryChildViewHolder(View itemView) {
        super(itemView);

        mNameView = (TextView) itemView.findViewById(R.id.item_child_name);
        mDOBView = (TextView) itemView.findViewById(R.id.item_child_dob);
    }

}
