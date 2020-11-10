/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */
package ji.jfx.helloworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - JavaFX: HelloWorld GUI
 * @version: 1.0 
 * @since Nov 10, 2020
 */
public class JIJFXHelloWorld extends Application {
    
    
    @Override
    /// START UP THE STAGE ///
    public void start(Stage primaryStage) {
        
    /// BUTTON LOGIC ///
    //Set a new button
        Button btn = new Button();
    //Set the text on the button
        btn.setText("Print 'Hello World' To Console");
    //Attach the clicking of the button to an action
        btn.setOnAction(new EventHandler<ActionEvent>() {
    //BUTTON PRESS LOGIC       
            @Override
            public void handle(ActionEvent event) {
    //Print to console when button is pressed
                System.out.println("Hello World!");
            }
        });
        
    //This defines where the elements appear on the program window
    //NB: StackPane layout = new StackPane(); is an alternative where we control the layout more granularly
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        //DEFINE the size of the window
        Scene scene = new Scene(root, 500, 350);
        
        //SETTER to set the Title of the Program Window
        primaryStage.setTitle("Hello World!");
        //Set which scene the window comes from
        primaryStage.setScene(scene);
        //Show the Window
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    // LAUNCH the JavaFX Program
        launch(args);
    }
    
}
