package Stages;

import Entity.*;
import Run.Game;
import Run.GamePanel;
import Utility.ImagesAudio;

import java.awt.*;

/**
 * Created by abhishek on 7/14/2017.
 */
public class Stage1 extends StageParent {
    private static final int BALLON_SEP=45;
    private static final int BOMB_SEP=100;
    private static Entity array[]={new Bomb(Game.GAME_HEIGHT+2*BOMB_SEP),new Bomb(Game.GAME_HEIGHT+3*Stage1.BOMB_SEP),new Ballon(Game.GAME_HEIGHT),new Ballon(Game.GAME_HEIGHT+Stage1.BALLON_SEP),
            new Ballon(Game.GAME_HEIGHT+2*Stage1.BALLON_SEP),new Ballon(Game.GAME_HEIGHT+3*Stage1.BALLON_SEP),
            new Ballon(Game.GAME_HEIGHT+4*Stage1.BALLON_SEP)
          };
    public Stage1(){
        StageParent.background_colour=Color.CYAN;
        StageParent.Stage_notify="STAGE1";
        StageParent.array=Stage1.array;
        Bomb.BombVel=10;
        Ballon.BallonVel=5;


    }
    public void render(Graphics g1){
    super.render(g1);


    }
    public void update(){
super.update();
         if(StageParent.score>=40){
             GamePanel.time=1000;
             StageParent.life=10;
             GamePanel.currentState=new Stage2Resume();
             ImagesAudio.gameAudio.stop();
             ImagesAudio.gamePauseAudio.loop();
         }
    }
}
