/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */
package ji.jfxsoundboard;

import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author T
 */
public class SoundController {
    Media media = null;
    MediaPlayer mediaPlayer = null;
    String filePath = "\\src\\sound-files\\";
    String soundFile = "";
    
    public void btn1BtnSound() {
        soundFile = "unreal.mp3";
        String path = filePath + soundFile;
        media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    
    public void btn2BtnSound() {
        soundFile = "multi_kill.mp3";
        String path = filePath + soundFile;
        media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    
    public void btn3BtnSound() {
        soundFile = "first_blood.mp3";
        String path = filePath + soundFile;
        media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    
    public void btn4BtnSound() {
        soundFile = "mega_kill.mp3";
        String path = filePath + soundFile;
        media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    
    public void btn5BtnSound() {
        soundFile = "dominating.mp3";
        String path = filePath + soundFile;
        media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    
    public void btn6BtnSound() {
        soundFile = "god_like.mp3";
        String path = filePath + soundFile;
        media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    
    public void btn7BtnSound() {
        soundFile = "headshot.mp3";
        String path = filePath + soundFile;
        media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    
    public void btn8BtnSound() {
        soundFile = "killing_spree.mp3";
        String path = filePath + soundFile;
        media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    
    public void btn9BtnSound() {
        soundFile = "triple_kill.mp3";
        String path = filePath + soundFile;
        media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
}
