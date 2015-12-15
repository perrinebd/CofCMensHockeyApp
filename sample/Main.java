package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * This class drives the program mainly by passing an integer to CofCHockeyApp.run() which allows you
 * navigate the menu.
 */
public class Main extends Application implements Initializable{
	@FXML private Button submitButton;
	@FXML private TextField inputField;
	@FXML private Label textLabel;
	@FXML private TextArea console;
	
	private CofCHockeyApp app;
	private CofCHockeyApp app2;

	@Override
	public void start(Stage primaryStage) {
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("HockeyAppHUIController.fxml"));
			root.setId("pane");
			Scene scene = new Scene(root);
			scene.getStylesheets().addAll(this.getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("C of C Hockey App");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	private void handleButtonAction(ActionEvent event) {
		app.run(inputField.getText());
		inputField.clear();
		app.mainMenu();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		app = new CofCHockeyApp(console, inputField);
		app.run(inputField.getText());
		app.mainMenu();
	}
}
