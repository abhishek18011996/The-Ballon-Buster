package Utility;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

/**
 * Created by abhishek on 08-07-2017.
 */
public class ImagesAudio {

    public static Image WelcomeImage = null;
    public static Image SelectorImage = null;

    public static Image baloonImage = null;
    public static Image bombImage = null;
    public static Image boomImage = null;
    public static Image pauseImage = null;



    public static AudioClip deathAudio;
    public static AudioClip hitAudio;
    public static AudioClip gameAudio;
    public static AudioClip gamePauseAudio;




    public static void load() {

        URL WelcomeImageUrl = ImagesAudio.class.getResource("../resources/balloon.png");
        URL SelectorImageUrl = ImagesAudio.class.getResource("../resources/selector.png");
        URL baloonImageUrl = ImagesAudio.class.getResource("../resources/ballon.png");
        URL bombImageUrl = ImagesAudio.class.getResource("../resources/bomb.png");
        URL boomImageUrl = ImagesAudio.class.getResource("../resources/boom.png");
        URL pauseImageUrl = ImagesAudio.class.getResource("../resources/gamepause.png");
        URL deathAudioUrl = ImagesAudio.class.getResource("../resources/death.wav");
        URL hitAudioUrl = ImagesAudio.class.getResource("../resources/hit.wav");
        URL gameAudioUrl = ImagesAudio.class.getResource("../resources/music.wav");
        URL gamePauseAudioUrl = ImagesAudio.class.getResource("../resources/abhisound.wav");



            try {
                WelcomeImage = ImageIO.read(WelcomeImageUrl);
                baloonImage = ImageIO.read(baloonImageUrl);
                boomImage = ImageIO.read(boomImageUrl);
                bombImage = ImageIO.read(bombImageUrl);
                SelectorImage = ImageIO.read(SelectorImageUrl);
                pauseImage = ImageIO.read(pauseImageUrl);
                deathAudio = Applet.newAudioClip(deathAudioUrl);
                hitAudio = Applet.newAudioClip(hitAudioUrl);
                gamePauseAudio = Applet.newAudioClip(gamePauseAudioUrl);
                gameAudio=Applet.newAudioClip(gameAudioUrl);



            } catch (IOException e) {

            }


    }
}
