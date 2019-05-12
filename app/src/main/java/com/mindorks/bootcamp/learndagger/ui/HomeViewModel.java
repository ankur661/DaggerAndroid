package com.mindorks.bootcamp.learndagger.ui;

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.di.scope.ActivityScope;
import com.mindorks.bootcamp.learndagger.di.scope.FragmentScope;
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper;

import javax.inject.Inject;

@FragmentScope
public class HomeViewModel {

    private DatabaseService mDatabaseService;
    private NetworkService mNetworkService;
    private NetworkHelper mNetworkHelper;


    @Inject
    public HomeViewModel(DatabaseService databaseService, NetworkService networkService, NetworkHelper networkHelper) {
        this.mDatabaseService = databaseService;
        this.mNetworkService = networkService;
        this.mNetworkHelper = networkHelper;
    }
}
