package Stages;

import Run.Game;
import Run.GamePanel;
import Utility.ImagesAudio;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 * Created by abhishek on 7/14/2017.
 */
public class Welcome extends StageParent {
    private static final Font MY_FONT = new Font("Aerial", Font.BOLD, 45);
    private static int SelectorYCord=400;
    private static final int SelectorXCord=300;
    public Welcome(){
        ImagesAudio.gameAudio.loop();
    }
    public void render(Graphics g){
        g.drawImage(ImagesAudio.WelcomeImage,0,0,null);
        g.drawImage(ImagesAudio.SelectorImage,Welcome.SelectorXCord,Welcome.SelectorYCord,null);
        g.setColor(Color.red);
        g.setFont(MY_FONT);
        g.drawString("PLAY",Welcome.SelectorXCord+40,445);
        g.drawString("EXIT ",Welcome.SelectorXCord+40,490);

    }
    public void update(){

    }
    @Override
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode()==KeyEvent.VK_DOWN)
            Welcome.SelectorYCord=445;
        else if(e.getKeyCode()==KeyEvent.VK_UP)
            Welcome.SelectorYCord=400;
        else if(e.getKeyCode()==KeyEvent.VK_ENTER){
            if(Welcome.SelectorYCord==445){
                Game.frame.dispose();
            ImagesAudio.gameAudio.stop();}
            else if(Welcome.SelectorYCord==400)
                GamePanel.currentState=new Stage1();

        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }
}
