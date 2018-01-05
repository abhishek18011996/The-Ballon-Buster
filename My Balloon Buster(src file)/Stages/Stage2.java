package Stages;

import Entity.Ballon;
import Entity.Bomb;
import Entity.Entity;
import Run.Game;
import Run.GamePanel;
import Utility.ImagesAudio;

import java.awt.*;

/**
 * Created by abhishek on 7/14/2017.
 */
public class Stage2 extends StageParent {
    private static final int BALLON_SEP = 50;
    private static final int BOMB_SEP = 200;
    private static Entity array[] = { new Bomb(Game.GAME_HEIGHT + Stage2.BOMB_SEP)
            , new Bomb(Game.GAME_HEIGHT + 2 * BOMB_SEP), new Bomb(Game.GAME_HEIGHT + 3 * Stage2.BOMB_SEP),new Ballon(Game.GAME_HEIGHT), new Ballon(Game.GAME_HEIGHT + Stage2.BALLON_SEP),
            new Ballon(Game.GAME_HEIGHT + 2 * Stage2.BALLON_SEP), new Ballon(Game.GAME_HEIGHT + 3 * Stage2.BALLON_SEP),
            new Ballon(Game.GAME_HEIGHT + 4 * Stage2.BALLON_SEP), new Ballon(Game.GAME_HEIGHT + 5 * Stage2.BALLON_SEP)};

    public Stage2() {
        StageParent.background_colour = Color.green;
        StageParent.Stage_notify = "STAGE2";
        StageParent.array = Stage2.array;
        Bomb.BombVel = 15;
        Ballon.BallonVel = 10;
    }

    public void render(Graphics g1) {
        super.render(g1);


    }

    public void update() {
        super.update();
        if (StageParent.score >=100) {
            GamePanel.time = 50;

            GamePanel.currentState = new GameFinish();

            StageParent.score=100;
        }
    }
}
