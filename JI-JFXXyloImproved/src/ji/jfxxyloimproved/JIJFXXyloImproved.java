/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 * Create an HBox based Xylophone with Sound Files and a simplified Sound Controller
 * [OBJECTIVE]
 */

package ji.jfxxyloimproved;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - JavaFX Hbox Xylophone [IMPROVED]
 * @version: 2.0 
 * @since Nov 19, 2020
 */
public class JIJFXXyloImproved extends Application {


    @Override
    public void start(Stage stage) {
        Controller btnSound = new Controller();
        
        Button red = new Button("C");
        Button orange = new Button("D");
        Button yellow = new Button("E");
        Button green = new Button("F");
        Button blue = new Button("G");
        Button indigo = new Button("A");
        Button violet = new Button("B");
        
        red.setOnAction(e -> btnSound.makeSound("note1_c.wav"));
        orange.setOnAction(e -> btnSound.makeSound("note2_d.wav"));
        yellow.setOnAction(e -> btnSound.makeSound("note3_e.wav"));
        green.setOnAction(e -> btnSound.makeSound("note4_f.wav"));
        blue.setOnAction(e -> btnSound.makeSound("note5_g.wav"));
        indigo.setOnAction(e -> btnSound.makeSound("note6_a.wav"));
        violet.setOnAction(e -> btnSound.makeSound("note7_b.wav"));
        
        red.setStyle("-fx-background-color: red; -fx-pref-height: 400; -fx-pref-width: 50");
        orange.setStyle("-fx-background-color: orange; -fx-pref-height: 350; -fx-pref-width: 50");
        yellow.setStyle("-fx-background-color: yellow; -fx-pref-height: 300; -fx-pref-width: 50");
        green.setStyle("-fx-background-color: green; -fx-pref-height: 250; -fx-pref-width: 50");
        blue.setStyle("-fx-background-color: blue; -fx-pref-height: 200; -fx-pref-width: 50");
        indigo.setStyle("-fx-background-color: indigo; -fx-pref-height: 150; -fx-pref-width: 50");
        violet.setStyle("-fx-background-color: violet; -fx-pref-height: 100; -fx-pref-width: 50");

        HBox layout = new HBox();
        layout.setSpacing(10);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(red, orange, yellow, green, blue, indigo, violet);
        Scene scene = new Scene(layout, 500, 500);
        stage.setTitle("Xylo [IMPROVED]");
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        Application.launch(args);
    }

}