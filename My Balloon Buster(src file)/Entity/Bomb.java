package Entity;

import Run.Game;
import Utility.ImagesAudio;
import Utility.RandomInt;

import java.awt.*;

/**
 * Created by abhishek on 7/13/2017.
 */
public class Bomb extends Entity{
    public static int BombVel;
    public static final int BOMB_HEIGHT=128;
    public static final int BOMB_WIDTH=128;
    public Bomb(int y){
        this.entityXCord= RandomInt.randomInt(0, Game.GAME_WIDTH-BOMB_WIDTH);
        this.entityYCord=y;
    }

    @Override
    public void update() {
        if (this.entityYCord<-Bomb.BOMB_HEIGHT){
            this.entityYCord=Game.GAME_HEIGHT;
            this.entityXCord=RandomInt.randomInt(0,Game.GAME_WIDTH-BOMB_WIDTH);
        }
        else
            this.entityYCord-=BombVel;


    }

    @Override
    public void render(Graphics g) {
        g.drawImage(ImagesAudio.bombImage,this.entityXCord,this.entityYCord,null);
    }
}
