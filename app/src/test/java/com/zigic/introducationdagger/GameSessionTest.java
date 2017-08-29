package com.zigic.introducationdagger;

import com.zigic.introducationdagger.di.component.DaggerGameComponent;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by zigic on 29/08/17.
 */

public class GameSessionTest {
    @Test
    public void testGameSession(){
        GameSession session = new GameSession();
        DaggerGameComponent.create().inject(session);
        assertEquals("Hello Dagger", session.gameData.hello);
    }
}
