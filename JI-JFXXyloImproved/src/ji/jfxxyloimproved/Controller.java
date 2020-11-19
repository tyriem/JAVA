/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */
package ji.jfxxyloimproved;

import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author T
 * @project: Intermediate Java - JavaFX Hbox Xylophone [IMPROVED]
 */
class Controller {
    Media media = null;
    MediaPlayer mediaPlayer = null;
    String folderPath = "\\src\\sound-files\\";
    String soundFile = "";
    
    public void makeSound(String soundFile) {
        String path = folderPath + soundFile;
        media  = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
        media = null;
    }
}