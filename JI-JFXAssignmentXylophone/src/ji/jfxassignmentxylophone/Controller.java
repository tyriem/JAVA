/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */
package ji.jfxassignmentxylophone;

import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author T
 */
class Controller {
    Media media = null;
    MediaPlayer mediaPlayer = null;
    String filePath = "C:\\Users\\T\\Desktop\\sound-files";
    String soundFile = "";
    
    public void redBtnSound() {
        soundFile = "note1_c.wav";
        String path = filePath + soundFile;
        media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    
    public void orangeBtnSound() {
        soundFile = "note2_d.wav";
        String path = filePath + soundFile;
        media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    
    public void yellowBtnSound() {
        soundFile = "note3_e.wav";
        String path = "";
        media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
}
