/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 *  Write a JavaFX Program that prints a name to console when a button is pressed
 * [OBJECTIVE]
 */

package ji.jfxgetname;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//Import the StackPane Layout Engine
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - JavaFX: GetName
 * @version: 1.0 
 * @since Nov 10, 2020
 */
public class JIJFXGetName extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Get Name");
    //Siplified EVENT LOGIC
    //NB: Here we can set the button action directly without a later @Override
        btn.setOnAction(event -> {
            System.out.println("The Name is: ");
            System.out.println("Tyrie Moss");
        }); 



        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 500, 350);

        primaryStage.setTitle("Name Getter!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
