package com.mindorks.bootcamp.learndagger.di.component;

import com.mindorks.bootcamp.learndagger.di.module.FragmentModule;
import com.mindorks.bootcamp.learndagger.di.scope.ActivityScope;
import com.mindorks.bootcamp.learndagger.di.scope.FragmentScope;
import com.mindorks.bootcamp.learndagger.ui.HomeFragment;
import com.mindorks.bootcamp.learndagger.ui.MainActivity;

import dagger.Component;

@FragmentScope
@Component (dependencies = ApplicationComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {

    void inject(HomeFragment fragment);
}
