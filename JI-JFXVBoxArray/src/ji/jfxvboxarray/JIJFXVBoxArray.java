/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 *  Simplified VBox layout using Array and FOR-LOOP
 * [OBJECTIVE]
 */

package ji.jfxvboxarray;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.*;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Java:FX VBox Array
 * @version: 1.0 
 * @since Nov 12, 2020
 */
public class JIJFXVBoxArray extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        VBox layout = new VBox();
        List<Button> btn = new ArrayList<Button>();
        for (int i = 0; i < 8; i++) {
            btn.add(new Button("BTN" + i));
            layout.getChildren().add(btn.get(i));
            int finalI = i;
            btn.get(i).setOnAction(e -> System.out.println("Button " + finalI + " Was clicked"));
        }


        stage.setScene(new Scene(layout, 350, 200));
        stage.show();

    }
}