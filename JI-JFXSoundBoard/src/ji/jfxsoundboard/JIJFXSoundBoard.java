/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 *  Create a SoundBoard with images for each button and a header
 * [OBJECTIVE]
 */

package ji.jfxsoundboard;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.image.*;
import javafx.stage.Stage;
import java.io.*;



/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - JavaFX: Assignment Sound Board
 * @version: 1.0 
 * @since Nov 17, 2020
 */
public class JIJFXSoundBoard extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        SoundController btnSound = new SoundController();
 
        Button btn1 = new Button("");
        Button btn2 = new Button("");
        Button btn3 = new Button("");
        Button btn4 = new Button("");
        Button btn5 = new Button("");
        Button btn6 = new Button("");       
        Button btn7 = new Button("");
        Button btn8 = new Button("");
        Button btn9 = new Button("");

        
        btn1.setStyle("-fx-font-size: 26px;-fx-min-height: 100px; -fx-min-width: 500px");
        btn2.setStyle("-fx-font-size: 26px;-fx-min-height: 100px; -fx-min-width: 500px");
        btn3.setStyle("-fx-font-size: 26px;-fx-min-height: 100px; -fx-min-width: 500px");
        btn4.setStyle("-fx-font-size: 26px;-fx-min-height: 100px; -fx-min-width: 500px");
        btn5.setStyle("-fx-font-size: 26px;-fx-min-height: 100px; -fx-min-width: 500px");
        btn6.setStyle("-fx-font-size: 26px;-fx-min-height: 100px; -fx-min-width: 500px");
        btn7.setStyle("-fx-font-size: 26px;-fx-min-height: 100px; -fx-min-width: 500px");
        btn8.setStyle("-fx-font-size: 26px;-fx-min-height: 100px; -fx-min-width: 500px");
        btn9.setStyle("-fx-font-size: 26px;-fx-min-height: 100px; -fx-min-width: 500px");

        
        //IMG
        //Image image = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/Unreal_Engine_Logo.svg/1200px-Unreal_Engine_Logo.svg.png");
        //gridPane.getChildren().add(new ImageView(image));
        
        //BUTTON 1
        Image img1 = new Image("https://i.imgur.com/X6NrcGB.png");
        btn1.setGraphic(new ImageView(img1));
        btn1.setOnAction(e ->{
            btnSound.btn1BtnSound();
            System.out.println("UNREAL!");
        });
        
        //BUTTON 2
        Image img2 = new Image("https://i.imgur.com/3cbvesf.png");
        btn2.setGraphic(new ImageView(img2));
        btn2.setOnAction(e ->{
            btnSound.btn2BtnSound();
            System.out.println("MULTI KILL!");
        });
        
        //BUTTON 3
        Image img3 = new Image("https://i.imgur.com/MyYC8Vz.png");
        btn3.setGraphic(new ImageView(img3));
        btn3.setOnAction(e ->{
            btnSound.btn3BtnSound();
            System.out.println("FIRST BLOOD!");
        });
        
        //BUTTON 4
        Image img4 = new Image("https://i.imgur.com/OrwBLhq.png");
        btn4.setGraphic(new ImageView(img4));
        btn4.setOnAction(e ->{
            btnSound.btn4BtnSound();
            System.out.println("MEGA KILL!");
        });
        
        //BUTTON 5
        Image img5 = new Image("https://i.imgur.com/OblTZsA.png");
        btn5.setGraphic(new ImageView(img5));
        btn5.setOnAction(e ->{
            btnSound.btn5BtnSound();
            System.out.println("DOMINATING!");
        });
        
        //BUTTON 6
        Image img6 = new Image("https://i.imgur.com/EBrB3Ax.png");
        btn6.setGraphic(new ImageView(img6));
        btn6.setOnAction(e ->{
            btnSound.btn6BtnSound();
            System.out.println("GOD LIKE!");
        });
        
        //BUTTON 7
        Image img7 = new Image("https://i.imgur.com/9DUE08S.png");
        btn7.setGraphic(new ImageView(img7));        
        btn7.setOnAction(e ->{
            btnSound.btn7BtnSound();
            System.out.println("HEADSHOT!");
        });
        
        //BUTTON 8
        Image img8 = new Image("https://i.imgur.com/lS7NP53.png");
        btn8.setGraphic(new ImageView(img8));          
        btn8.setOnAction(e ->{
            btnSound.btn8BtnSound();
            System.out.println("KILLING SPREE!");
        });
                
        //BUTTON 9
        Image img9 = new Image("https://i.imgur.com/xkF5HgK.png");
        btn9.setGraphic(new ImageView(img9));  
        btn9.setOnAction(e ->{
            btnSound.btn9BtnSound();
            System.out.println("TRIPLE KILL!");
        });
        
        GridPane gridPane = new GridPane();
        

        
        gridPane.add(btn1, 1, 0, 1, 1);
        gridPane.add(btn2, 2, 0, 1, 1);
        gridPane.add(btn3, 3, 0, 1, 1);
        gridPane.add(btn4, 1, 1, 1, 1);
        gridPane.add(btn5, 2, 1, 1, 1);
        gridPane.add(btn6, 3, 1, 1, 1);
        gridPane.add(btn7, 1, 2, 1, 1);
        gridPane.add(btn8, 2, 2, 1, 1);
        gridPane.add(btn9, 3, 2, 1, 1);

        
        gridPane.setHgap(6);
        gridPane.setVgap(6);
        //Set the background image and color of the window
        gridPane.setStyle("-fx-background-image: url(\"https://i.imgur.com/B5HWrxs.png\"); -fx-background-color: #000000;");
        //Set the alignment of the buttons in the window
        gridPane.setAlignment(Pos.CENTER);


        Scene scene = new Scene(gridPane, 1650, 1050);
        primaryStage.setScene(scene);
        primaryStage.setTitle("UNREAL SoundBoard");
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}