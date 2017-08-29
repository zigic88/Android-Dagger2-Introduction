package com.zigic.introducationdagger.di.component;

import com.zigic.introducationdagger.GameSession;
import com.zigic.introducationdagger.di.module.GameModule;

import dagger.Component;

/**
 * Created by zigic on 29/08/17.
 */

@Component(modules = GameModule.class)
public interface GameComponent {
    void inject (GameSession session);
}
