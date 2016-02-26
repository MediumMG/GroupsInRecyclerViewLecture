package com.mediummg.grouprecyclerview.library;

import android.view.View;
import android.widget.TextView;

import com.h6ah4i.android.widget.advrecyclerview.utils.AbstractExpandableItemViewHolder;
import com.mediummg.grouprecyclerview.R;
import com.mediummg.grouprecyclerview.widget.ExpandableItemIndicator;

/**
 * Created by MediumMG on 22.02.2016.
 */
public class LibraryGroupViewHolder extends AbstractExpandableItemViewHolder {

    public TextView mYearView, mBirthdayMenCount;
    public ExpandableItemIndicator mIndicatorView;

    public LibraryGroupViewHolder(View itemView) {
        super(itemView);

        mYearView = (TextView) itemView.findViewById(R.id.item_group_year);
        mBirthdayMenCount = (TextView) itemView.findViewById(R.id.item_group_count);
        mIndicatorView = (ExpandableItemIndicator) itemView.findViewById(R.id.item_group_indicator);
    }
}
