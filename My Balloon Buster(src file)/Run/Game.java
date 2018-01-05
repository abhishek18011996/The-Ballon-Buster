package Run;

import javax.swing.*;



/**
 * Created by abhishek on 08-07-2017.
 */
public class Game  {
    public static final int GAME_WIDTH=800;
    public static final int GAME_HEIGHT=1000;
    public static JFrame frame;

    public static void main(String[] args) {
         frame=new JFrame();
        frame.setSize(GAME_WIDTH,GAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

         GamePanel p=new GamePanel();
        frame.add(p);
        frame.setVisible(true);
        p.requestFocus();
        frame.pack();

    }



    }

