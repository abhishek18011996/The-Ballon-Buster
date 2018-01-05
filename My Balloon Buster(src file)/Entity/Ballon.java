package Entity;

import Run.Game;
import Stages.StageParent;
import Utility.ImagesAudio;
import Utility.RandomInt;

import java.awt.*;

/**
 * Created by abhishek on 7/13/2017.
 */
public class Ballon extends Entity{
    public static int BallonVel;

    private static final int BALLON_HEIGHT=128;
    private static final int BALLON_WIDTH=128;

    public Ballon(int y){
        this.entityXCord= RandomInt.randomInt(0, Game.GAME_WIDTH-BALLON_WIDTH);
        this.entityYCord=y;

    }
    @Override
    public void update() {
        if (this.entityYCord<-Ballon.BALLON_HEIGHT) {
            if (this.entityVisible == true)
                StageParent.life -= 1;
            else
                this.entityVisible = true;
            this.entityYCord = Game.GAME_HEIGHT - BALLON_WIDTH;
            this.entityXCord = RandomInt.randomInt(0, Game.GAME_WIDTH-Ballon.BALLON_WIDTH);
        }

        else
            this.entityYCord-=Ballon.BallonVel;

    }

    @Override
    public void render(Graphics g){
            if(this.entityVisible==true)

        g.drawImage(ImagesAudio.baloonImage,this.entityXCord,this.entityYCord,null);
    }
}
