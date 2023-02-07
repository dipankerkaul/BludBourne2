package com.packtub.libgdx.bludbourne;


import com.packtub.libgdx.bludbourne.screens.MainGameScreen;
import com.badlogic.gdx.Game;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class BludBourne extends Game {
    public static final MainGameScreen _mainGameScreen = new MainGameScreen();

    @Override
    public void create()
    {    setScreen(_mainGameScreen);  }

    @Override
    public void dispose()
    {    _mainGameScreen.dispose();  }
}

