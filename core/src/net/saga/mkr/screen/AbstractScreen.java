package net.saga.mkr.screen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

import net.saga.mkr.MKR;

public abstract class AbstractScreen  implements Screen{

    protected final MKR game;

    protected AbstractScreen(MKR game) {
        this.game = game;
    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
