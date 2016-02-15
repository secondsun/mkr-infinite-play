package net.saga.mkr.screen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import net.saga.mkr.MKR;

/**
 * Created by secon on 2/10/2016.
 */
public class TitleMenu extends AbstractScreen {

    TextureRegion title;
    SpriteBatch batch;
    float time = 0;

    public TitleMenu(MKR game) {
        super(game);
    }

    @Override
    public void show () {
        title = new TextureRegion(new Texture(Gdx.files.internal("title_menu.png")), 0, 0, 480, 320);
        batch = new SpriteBatch();
        batch.getProjectionMatrix().setToOrtho2D(0, 0, 480, 320);
    }

    @Override
    public void render (float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(title, 0, 0);
        batch.end();

        time += delta;
        if (time > 1) {
            if (Gdx.input.isKeyPressed(Input.Keys.E)) {
                Gdx.app.log("Edit", "Edit");
                game.setScreen(new EditScreen(game));
            } else if (Gdx.input.isKeyPressed(Input.Keys.P)) {
                //game.setScreen(new PlayScreen(game));
            }
        }
    }

    @Override
    public void hide () {
        batch.dispose();
        title.getTexture().dispose();
    }

}
