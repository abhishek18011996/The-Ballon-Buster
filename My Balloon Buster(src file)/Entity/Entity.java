package Entity;



import java.awt.*;

/**
 * Created by abhishek on 10-07-2017.
 */
abstract public class Entity {
    public int entityXCord;
    public int entityYCord;
    public boolean entityVisible=true;

   abstract public void update();



    abstract public void render(Graphics g);



}
