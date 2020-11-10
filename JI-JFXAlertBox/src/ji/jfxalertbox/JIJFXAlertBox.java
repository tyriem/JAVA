/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 * Create an Alert Box to notify the user
 * [OBJECTIVE]
 */

package ji.jfxalertbox;

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
 * @project: Intermediate Java - JavaFX: Alert Box
 * @version: 1.0 
 * @since Nov 10, 2020
 */
public class JIJFXAlertBox extends Application {
    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button();
        
        AlertBox alert = new AlertBox();
        window = primaryStage;
        btn = new Button("Click Me");
        btn.setOnAction(e -> alert.display("TITLE: New Window","Message: Alert Box"));
        
        StackPane layout = new StackPane();
        layout.getChildren().add(btn);
        
        Scene scene = new Scene(layout, 500, 450);
        window.setScene(scene);
        
        window.setTitle("Creating ALERT BOXES");
        window.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
