/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 *  OBJECTIVE
 * [OBJECTIVE]
 */

package ji.jfxassignmentxylophone;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Assignment: JavaFX Keypad
 * @version: 1.0 
 * @since Nov 17, 2020
 */
public class JIJFXAssignmentXylophone extends Application {


    @Override
    public void start(Stage stage) {
        Controller btnSound = new Controller();
        
        Button red = new Button();
        Button orange = new Button();
        Button yellow = new Button();
        Button green = new Button();
        Button blue = new Button();
        Button indigo = new Button();
        Button violet = new Button();
        
        red.setOnAction(e -> btnSound.redBtnSound());
        orange.setOnAction(e -> System.out.println("You Clicked Orange"));
        yellow.setOnAction(e -> System.out.println("You Clicked Yellow"));
        green.setOnAction(e -> System.out.println("You Clicked Green"));
        blue.setOnAction(e -> System.out.println("You Clicked Blue"));
        indigo.setOnAction(e -> System.out.println("You Clicked Indigo"));
        violet.setOnAction(e -> System.out.println("You Clicked Violet"));

        
        red.setStyle("-fx-background-color: red; -fx-pref-height: 80; -fx-pref-width: 900");
        orange.setStyle("-fx-background-color: orange; -fx-pref-height: 80; -fx-pref-width: 800");
        yellow.setStyle("-fx-background-color: yellow; -fx-pref-height: 80; -fx-pref-width: 700");
        green.setStyle("-fx-background-color: green; -fx-pref-height: 80; -fx-pref-width: 600");
        blue.setStyle("-fx-background-color: blue; -fx-pref-height: 80; -fx-pref-width: 500");
        indigo.setStyle("-fx-background-color: indigo; -fx-pref-height: 80; -fx-pref-width: 400");
        violet.setStyle("-fx-background-color: violet; -fx-pref-height: 80; -fx-pref-width: 300");

        VBox layout = new VBox();
        layout.setSpacing(10);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(red, orange, yellow, green, blue, indigo, violet);
        Scene scene = new Scene(layout, 1000, 600);
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        Application.launch(args);
    }

}