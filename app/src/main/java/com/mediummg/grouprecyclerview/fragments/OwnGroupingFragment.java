package com.mediummg.grouprecyclerview.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.h6ah4i.android.widget.advrecyclerview.animator.GeneralItemAnimator;
import com.h6ah4i.android.widget.advrecyclerview.animator.RefactoredDefaultItemAnimator;
import com.mediummg.grouprecyclerview.Data;
import com.mediummg.grouprecyclerview.R;
import com.mediummg.grouprecyclerview.adapters.OwnGroupAdapter;

/**
 * Created by MediumMG on 22.02.2016.
 */
public class OwnGroupingFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private OwnGroupAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_recycler, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.fragment_recycler_view);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new OwnGroupAdapter();

        // Need to disable them when using animation indicator.
        final GeneralItemAnimator animator = new RefactoredDefaultItemAnimator();
        animator.setSupportsChangeAnimations(false);
        mRecyclerView.setItemAnimator(animator);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setData(Data.generateOwnData());
        mAdapter.notifyDataSetChanged();

        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        getActivity().setTitle(R.string.title_own_grouping);
    }
}
