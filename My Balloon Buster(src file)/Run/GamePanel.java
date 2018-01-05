package Run;


import Stages.StageParent;
import Stages.Welcome;
import Utility.ImagesAudio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



/**
 * Created by abhishek on 08-07-2017.
 */
public class GamePanel extends JPanel implements KeyListener, MouseListener,Runnable {
    public static StageParent currentState;
    public static int time=50;


    public GamePanel() {
        super();
        this.setFocusable(true);
        this.addKeyListener(this);
        this.addMouseListener(this);
        Dimension d=new Dimension(Game.GAME_WIDTH,Game.GAME_HEIGHT);
        this.setPreferredSize(d);
    }

    public  void addNotify() {
        super.addNotify();
        ImagesAudio.load();
        this.requestFocus();
        GamePanel.currentState =new Welcome();
        Thread t1 = new Thread(this);
        t1.start();
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        GamePanel.currentState.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        GamePanel.currentState.mouseClicked(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void run()  {

        while (true) {
        try {
            Thread.sleep(GamePanel.time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(StageParent.gamepause==false){
        GamePanel.currentState.update();
        }


            Graphics ig = this.getGraphics();
        ig.clearRect(0, 0, Game.GAME_WIDTH, Game.GAME_HEIGHT);
        GamePanel.currentState.render(ig);
        ig.dispose();

        }
}


}




