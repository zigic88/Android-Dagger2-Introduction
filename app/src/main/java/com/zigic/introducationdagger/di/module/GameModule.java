package com.zigic.introducationdagger.di.module;

import com.zigic.introducationdagger.GameData;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zigic on 29/08/17.
 */

@Module
public class GameModule {

    @Provides
    GameData providesGameData(){
        return new GameData();
    }
}
