package com.mediummg.grouprecyclerview;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;

import com.mediummg.grouprecyclerview.fragments.LibraryGroupingFragment;
import com.mediummg.grouprecyclerview.fragments.OwnGroupingFragment;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.activity_main_container, new OwnGroupingFragment())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actvitiy_main_menu, menu);
        ((SwitchCompat) menu.findItem(R.id.activity_main_menu_switch)
                .getActionView()
                .findViewById(R.id.action_switch))
                .setOnCheckedChangeListener(this);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.activity_main_menu_switch:
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if (isChecked) {
            ft.setCustomAnimations(R.anim.right_in, R.anim.left_out);
            ft.replace(R.id.activity_main_container, new LibraryGroupingFragment());
        }
        else {
            ft.setCustomAnimations(R.anim.left_in, R.anim.right_out);
            ft.replace(R.id.activity_main_container, new OwnGroupingFragment());
        }
        ft.commit();
    }
}
