/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 * JavaFX Grid Form Example [SIMPLE]
 * [OBJECTIVE]
 */

package ji.jfxgridformsimple;

import javafx.application.Application;
import javafx.geometry.Insets;
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
 * @project: Intermediate Java - JavaFX: Grid Layout Form Example [SIMPLE]
 * @version: 1.0 
 * @since Nov 12, 2020
 */
public class JIJFXGridFormSimple extends Application {

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        //Label
        Label labelName = new Label("Name:");
        GridPane.setConstraints(labelName, 0, 0);

        //input field
        TextField inputName = new TextField("Enter Name");
        GridPane.setConstraints(inputName, 1, 0);

        //Password Label
        Label passwordLabel = new Label("Password");
        GridPane.setConstraints(passwordLabel, 0, 1);

        //password Field
        TextField password = new TextField("Enter Password");
        GridPane.setConstraints(password, 1, 1);
        password.setPromptText("password");

        Button loin = new Button("Log In");
        GridPane.setConstraints(loin, 1, 2);
        grid.getChildren().addAll(labelName,inputName, passwordLabel, password, loin);
        stage.setScene(new Scene(grid,300, 250));
        stage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}