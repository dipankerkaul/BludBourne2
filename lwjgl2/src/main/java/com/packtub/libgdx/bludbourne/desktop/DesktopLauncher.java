package com.packtub.libgdx.bludbourne.desktop;

import com.badlogic.gdx.Application;import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.packtub.libgdx.bludbourne.BludBourne;

/** Launches the desktop (LWJGL) application. */
public class DesktopLauncher {
    public static void main (String[] arg) {
        LwjglApplicationConfiguration config = new  LwjglApplicationConfiguration();
        config.title = "BludBourne";
        config.useGL30 = false;
        config.width = 800;
        config.height = 600;
        Application app = new LwjglApplication(new BludBourne(),       config);
        Gdx.app = app;
        //Gdx.app.setLogLevel(Application.LOG_INFO);
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
        // Gdx.app.setLogLevel(Application.LOG_ERROR);
        // Gdx.app.setLogLevel(Application.LOG_NONE);
        }

    }
