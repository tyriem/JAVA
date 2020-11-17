/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 * Create a Keypad Application in JavaFX Using GridPane
 * [OBJECTIVE]
 */

package ji.jfxassignmentkeypad;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Assignment: JavaFX Keypad
 * @version: 1.0 
 * @since Nov 17, 2020
 */
public class JIJFXAssignmentKeyPad extends Application {

    @Override
    public void start(Stage primaryStage) {

        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");       
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        Button btnPound = new Button("*");
        Button btn0 = new Button("0");
        Button btnHash = new Button("#");
        
        
        btn1.setStyle("-fx-font-size: 26px;-fx-min-height: 50px; -fx-min-width: 10px");
        btn2.setStyle("-fx-font-size: 26px;-fx-min-height: 50px; -fx-min-width: 10px");
        btn3.setStyle("-fx-font-size: 26px;-fx-min-height: 50px; -fx-min-width: 10px");
        btn4.setStyle("-fx-font-size: 26px;-fx-min-height: 50px; -fx-min-width: 10px");
        btn5.setStyle("-fx-font-size: 26px;-fx-min-height: 50px; -fx-min-width: 10px");
        btn6.setStyle("-fx-font-size: 26px;-fx-min-height: 50px; -fx-min-width: 10px");
        btn7.setStyle("-fx-font-size: 26px;-fx-min-height: 50px; -fx-min-width: 10px");
        btn8.setStyle("-fx-font-size: 26px;-fx-min-height: 50px; -fx-min-width: 10px");
        btn9.setStyle("-fx-font-size: 26px;-fx-min-height: 50px; -fx-min-width: 10px");
        btnPound.setStyle("-fx-font-size: 26px;-fx-min-height: 50px; -fx-min-width: 10px");
        btn0.setStyle("-fx-font-size: 26px;-fx-min-height: 50px; -fx-min-width: 10px");
        btnHash.setStyle("-fx-font-size: 26px;-fx-min-height: 50px; -fx-min-width: 10px");



        btn1.setOnAction(e -> System.out.println("Btn1 was clicked"));
        btn2.setOnAction(e -> System.out.println("Btn2 was clicked"));
        btn3.setOnAction(e -> System.out.println("Btn3 was clicked"));
        btn4.setOnAction(e -> System.out.println("Btn4 was clicked"));
        btn5.setOnAction(e -> System.out.println("Btn5 was clicked"));
        btn6.setOnAction(e -> System.out.println("Btn6 was clicked"));
        btn7.setOnAction(e -> System.out.println("Btn7 was clicked"));
        btn8.setOnAction(e -> System.out.println("Btn8 was clicked"));
        btn9.setOnAction(e -> System.out.println("Btn9 was clicked"));
        btnPound.setOnAction(e -> System.out.println("Btn* was clicked"));
        btn0.setOnAction(e -> System.out.println("Btn0 was clicked"));
        btnHash.setOnAction(e -> System.out.println("Btn# was clicked"));

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
        gridPane.add(btnPound, 1, 3, 1, 1);
        gridPane.add(btn0, 2, 3, 1, 1);
        gridPane.add(btnHash, 3, 3, 1, 1);
        gridPane.setHgap(6);
        gridPane.setVgap(6);
        //Set the background color of the window
        gridPane.setStyle("-fx-background-color: #69F0AE;");
        //Set the alignment of the buttons in the window
        gridPane.setAlignment(Pos.CENTER);


        Scene scene = new Scene(gridPane, 300, 255);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Key Pad");
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}