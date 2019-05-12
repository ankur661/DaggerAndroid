package com.mindorks.bootcamp.learndagger.ui;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.TextView;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.R;
import com.mindorks.bootcamp.learndagger.di.component.DaggerActivityComponent;
import com.mindorks.bootcamp.learndagger.di.module.ActivityModule;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainViewModel viewModel;

    HomeFragment mHomeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDependencies();
        setContentView(R.layout.activity_main);

        TextView tvData = findViewById(R.id.tvData);
//        tvData.setText(viewModel.getSomeData());
        tvData.setText("Sample");

        ConstraintLayout layoutMain = findViewById(R.id.layoutMain);

        FragmentManager fragMan = getFragmentManager();
        FragmentTransaction fragTransaction = fragMan.beginTransaction();

        mHomeFragment = new HomeFragment();
        fragTransaction.add(layoutMain.getId(), mHomeFragment , "Home");
        fragTransaction.commit();
    }

    public void getDependencies() {
        DaggerActivityComponent
                .builder()
                .applicationComponent(((MyApplication) getApplication()).applicationComponent)
                .activityModule(new ActivityModule(this))
                .build()
                .inject(this);

    }
}
