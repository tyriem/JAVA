/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 * JavaFX Grid implementation template
 * [OBJECTIVE]
 */

package ji.jfxgridlayout;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - JavaFX: Grid Layout
 * @version: 1.0 
 * @since Nov 12, 2020
 */
public class JIJFXGridLayout extends Application {

    @Override
    public void start(Stage primaryStage) {

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");
        Button btn6 = new Button("Button 6");
        btn1.setStyle("-fx-background-color: red; -fx-font-size: 26px;-fx-min-height: 50px");
        btn2.setStyle("-fx-background-color: orange; -fx-font-size: 26px;-fx-min-height: 50px");
        btn3.setStyle("-fx-background-color: yellow; -fx-font-size: 26px;-fx-min-height: 50px");
        btn4.setStyle("-fx-background-color: green; -fx-font-size: 26px;-fx-min-height: 50px");
        btn5.setStyle("-fx-background-color: blue; -fx-font-size: 26px;-fx-min-height: 50px");
        btn6.setStyle("-fx-background-color: violet; -fx-font-size: 26px;-fx-min-height: 50px");

//        Button btn7 = new Button("7");
//        Button btn8 = new Button("8");
//        Button btn9 = new Button("9");
//        Button btn10 = new Button("10");
//        Button btn11 = new Button("11");
//        Button btn12 = new Button("12");

        btn1.setOnAction(e -> System.out.println("Btn1 was clicked"));
        btn2.setOnAction(e -> System.out.println("Btn2 was clicked"));
        btn3.setOnAction(e -> System.out.println("Btn3 was clicked"));
        btn4.setOnAction(e -> System.out.println("Btn4 was clicked"));
        btn5.setOnAction(e -> System.out.println("Btn5 was clicked"));
        btn6.setOnAction(e -> System.out.println("Btn6 was clicked"));

        GridPane gridPane = new GridPane();
        gridPane.add(btn1, 0, 0, 1, 1);
        gridPane.add(btn2, 1, 0, 1, 1);
        gridPane.add(btn3, 2, 0, 1, 1);
        gridPane.add(btn4, 0, 1, 1, 1);
        gridPane.add(btn5, 1, 1, 1, 1);
        gridPane.add(btn6, 2, 1, 1, 1);
        gridPane.setHgap(4);
        gridPane.setVgap(5);


        Scene scene = new Scene(gridPane, 450, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World");
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}