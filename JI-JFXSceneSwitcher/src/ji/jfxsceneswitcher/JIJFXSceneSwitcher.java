/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 *  Make two windows and buttons that can switch between them
 * [OBJECTIVE]
 */

package ji.jfxsceneswitcher;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//Import the Label Maker
import javafx.scene.control.Label;
//Import the VBox Layout Engine
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - JavaFX: Scene Switcher
 * @version: 1.0 
 * @since Nov 10, 2020
 */
public class JIJFXSceneSwitcher extends Application {
//Set the main stage and name it Window
Stage window;
//Set the first scene
Scene scene1;
//Set the second scene
Scene scene2;


@Override
public void start(Stage primaryStage) throws Exception {
window = primaryStage;
Label label1 = new Label("Scene 1");
Button btn1 = new Button("Switch to scene 2");
btn1.setOnAction(e -> window.setScene(scene2));

VBox layout1 = new VBox();
layout1.getChildren().addAll(label1, btn1);
scene1 = new Scene(layout1, 200, 200);

Button btn2 = new Button();
btn2.setText("Switch to Scene 1");
btn2.setOnAction(e -> window.setScene(scene1));

VBox layout2 = new VBox();
layout2.getChildren().add(btn2);
scene2 = new Scene(layout2, 300, 500);

window.setScene(scene1);
window.setTitle("Switching");
window.show();

}

public static void main(String[] args) {
launch(args);
}
}