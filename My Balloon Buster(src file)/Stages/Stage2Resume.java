package Stages;

import Run.Game;
import Run.GamePanel;
import Utility.ImagesAudio;

import java.awt.*;

/**
 * Created by abhishek on 7/14/2017.
 */
public class Stage2Resume extends StageParent {
    private static int k = 10;
    private static final Font MY_FONT = new Font("Aerial", Font.BOLD, 32);

    public void render(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect(0, 0, Game.GAME_WIDTH, Game.GAME_HEIGHT);
        g.setColor(Color.red);
        g.setFont(MY_FONT);
        g.drawString("congratulationssssss!!!!!!", 150, 50);
        g.drawString("Stage2 begins ", 200, 150);
        g.drawString(Integer.toString(Stage2Resume.k), 250, 200);
        g.drawString("seconds", 300, 200);

    }

    public void update() {
        Stage2Resume.k--;
        if (Stage2Resume.k == 0) {
            GamePanel.time = 50;
            GamePanel.currentState = new Stage2();
            Stage2Resume.k = 10;
            ImagesAudio.gamePauseAudio.stop();
            ImagesAudio.gameAudio.loop();

        }
    }
}
