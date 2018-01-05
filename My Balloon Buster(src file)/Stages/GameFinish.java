package Stages;

import Entity.*;
import Run.Game;

import java.awt.*;

/**
 * Created by abhishek on 7/14/2017.
 */
public class GameFinish extends StageParent {
    private static final Font MY_FONT = new Font("Aerial", Font.BOLD, 32);
    public static Entity arr[]={new Ballon(Game.GAME_HEIGHT),new Ballon(Game.GAME_HEIGHT+100),new Ballon(Game.GAME_HEIGHT+200)
            ,new Ballon(Game.GAME_HEIGHT+300),new Ballon(Game.GAME_HEIGHT+50)};
    @Override
    public void update() {
        for(int i=0;i<GameFinish.arr.length;i++)
            GameFinish.arr[i].update();
    }
    public void render(Graphics gc){
        gc.setColor(Color.pink);
        gc.fillRect(0,0, Game.GAME_WIDTH,Game.GAME_HEIGHT);
        gc.setColor(Color.red);
        gc.setFont(MY_FONT);
        gc.drawString("Conratulationsssss youuu won",150,50);
        gc.drawString("your score was ",150,100);
        gc.drawString(Integer.toString(StageParent.score),150,200);
        gc.drawString("bravooooo",150,250);
        for(int i=0;i<GameFinish.arr.length;i++)
            GameFinish.arr[i].render(gc);

    }
}
