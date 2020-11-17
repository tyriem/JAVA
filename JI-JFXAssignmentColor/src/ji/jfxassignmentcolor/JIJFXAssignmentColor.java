/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 *  Create a series of GUI buttons for the seven colors of the rainbow that print their colors when pressed
 * [OBJECTIVE]
 */

package ji.jfxassignmentcolor;

import javafx.application.Application;
import static javafx.application.Application.launch;
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
 * @project: Intermediate Java - JavaFX: Assignment Color
 * @version: 1.0 
 * @since Nov 17, 2020
 */
public class JIJFXAssignmentColor extends Application {


    @Override
    public void start(Stage stage) {
        Button red = new Button();
        Button orange = new Button();
        Button yellow = new Button();
        Button green = new Button();
        Button blue = new Button();
        Button indigo = new Button();
        Button violet = new Button();
        
        red.setOnAction(e -> System.out.println("You Clicked Red"));
        orange.setOnAction(e -> System.out.println("You Clicked Orange"));
        yellow.setOnAction(e -> System.out.println("You Clicked Yellow"));
        green.setOnAction(e -> System.out.println("You Clicked Green"));
        blue.setOnAction(e -> System.out.println("You Clicked Blue"));
        indigo.setOnAction(e -> System.out.println("You Clicked Indigo"));
        violet.setOnAction(e -> System.out.println("You Clicked Violet"));

        
        red.setStyle("-fx-background-color: red; -fx-pref-height: 80; -fx-pref-width: 900");
        orange.setStyle("-fx-background-color: orange; -fx-pref-height: 80; -fx-pref-width: 900");
        yellow.setStyle("-fx-background-color: yellow; -fx-pref-height: 80; -fx-pref-width: 900");
        green.setStyle("-fx-background-color: green; -fx-pref-height: 80; -fx-pref-width: 900");
        blue.setStyle("-fx-background-color: blue; -fx-pref-height: 80; -fx-pref-width: 900");
        indigo.setStyle("-fx-background-color: indigo; -fx-pref-height: 80; -fx-pref-width: 900");
        violet.setStyle("-fx-background-color: violet; -fx-pref-height: 80; -fx-pref-width: 900");

        VBox layout = new VBox();
        layout.setSpacing(10);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(red, orange, yellow, green, blue, indigo, violet);
        Scene scene = new Scene(layout, 600, 600);
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        Application.launch(args);
    }

}