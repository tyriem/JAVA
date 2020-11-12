/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 *  JavaFX HBox implementation template
 * [OBJECTIVE]
 */

package ji.jfxhbox;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - JavaFX: HBox
 * @version: 1.0 
 * @since Nov 12, 2020
 */
public class JIJFXHBox extends Application {

    @Override
    public void start(Stage primaryStage) {
        HBox hBox = new HBox();
        Scene scene = new Scene(hBox, 250, 100);
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");


        btn1.setOnAction(e -> System.out.println("Btn1 was clicked"));
        btn2.setOnAction(e -> System.out.println("Btn2 was clicked"));
        btn3.setOnAction(e -> System.out.println("Btn3 was clicked"));
        btn4.setOnAction(e -> System.out.println("Btn4 was clicked"));

        hBox.getChildren().addAll(btn1, btn2, btn3, btn4, btn5);
        hBox.setSpacing(5);
        hBox.setAlignment(Pos.CENTER);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World");
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}