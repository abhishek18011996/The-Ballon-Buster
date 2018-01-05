package Stages;

import Entity.*;
import Run.Game;
import Run.GamePanel;
import Utility.ImagesAudio;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 * Created by abhishek on 7/14/2017.
 */
public class StageParent {
    public static boolean gamepause = false;
    static final Font MY_FONT = new Font("Aerial", Font.BOLD, 24);
    public static int score = 0;
    /*default*/static Color background_colour;
    /*default*/static String Stage_notify;
    /*default*/static Entity array[];
    public static int life = 10;

    public void render(Graphics g) {
        g.setColor(StageParent.background_colour);
        g.fillRect(0, 0, Game.GAME_WIDTH, Game.GAME_HEIGHT);

        g.setColor(Color.red);
        g.setFont(MY_FONT);
        g.drawString(StageParent.Stage_notify, 10, 20);
        g.drawString("Score", 325, 50);
        g.drawString(Integer.toString(score), 400, 50);
        g.drawString("life", 350, 75);
        g.drawString(Integer.toString(life), 400, 75);
        for (int i = 0; i < StageParent.array.length; i++) {
            StageParent.array[i].render(g);
        }
        g.drawImage(ImagesAudio.pauseImage, 50, 200, null);

    }

    public void update() {
        for (int i = 0; i < StageParent.array.length; i++)
            StageParent.array[i].update();
        if (StageParent.life <= 0) {

            GamePanel.currentState = new GameTerminate();
            ImagesAudio.gameAudio.stop();
            ImagesAudio.gamePauseAudio.loop();
        }

    }


    public void keyPressed(KeyEvent e) {

    }

    public void mouseClicked(MouseEvent e) {
        for (int i=StageParent.array.length-1;i >=0; i--) {
            Entity eo = StageParent.array[i];
            if (e.getX() < (eo.entityXCord + Bomb.BOMB_WIDTH - 10) && e.getX() > (eo.entityXCord + 10)
                    && e.getY() < (eo.entityYCord + Bomb.BOMB_HEIGHT - 10) && e.getY() > eo.entityYCord + 10 && eo.entityVisible == true) {
                if (eo instanceof Ballon) {
                    eo.entityVisible = false;
                    ImagesAudio.hitAudio.play();
                    StageParent.score += 2;
                    break;
                } else if (eo instanceof Bomb) {
                    ImagesAudio.deathAudio.play();
                    GamePanel.currentState = new GameTerminate();
                    break;
                }}
            else if (e.getX() < 100 && e.getX() > 50
                    && e.getY() > 200 && e.getY() < 250)
            {
                StageParent.gamepause =!StageParent.gamepause;
                break;
            }
            }

            }

        }


