package com.mediummg.grouprecyclerview.own;

import android.view.View;
import android.widget.TextView;

import com.mediummg.grouprecyclerview.R;
import com.mediummg.grouprecyclerview.widget.ExpandableItemIndicator;

/**
 * Created by MediumMG on 22.02.2016.
 */
public class OwnGroupViewHolder extends OwnViewHolder {

    public TextView mYearView, mBirthdayMenCount;
    public ExpandableItemIndicator mIndicatorView;

    public OwnGroupViewHolder(View itemView) {
        super(itemView);

        mYearView = (TextView) itemView.findViewById(R.id.item_group_year);
        mBirthdayMenCount = (TextView) itemView.findViewById(R.id.item_group_count);
        mIndicatorView = (ExpandableItemIndicator) itemView.findViewById(R.id.item_group_indicator);
    }
}
