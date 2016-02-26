package com.mediummg.grouprecyclerview.own;

import android.view.View;
import android.widget.TextView;

import com.mediummg.grouprecyclerview.R;

/**
 * Created by MediumMG on 22.02.2016.
 */
public class OwnChildViewHolder extends OwnViewHolder {

    public TextView mNameView, mDOBView;

    public OwnChildViewHolder(View itemView) {
        super(itemView);

        mNameView = (TextView) itemView.findViewById(R.id.item_child_name);
        mDOBView = (TextView) itemView.findViewById(R.id.item_child_dob);
    }
}
