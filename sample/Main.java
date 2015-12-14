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

import java.net.URL;
import java.util.ResourceBundle;

public class Main extends Application implements Initializable{
	@FXML private Button submitButton;
	@FXML private TextField inputField;
	@FXML private Label textLabel;
	@FXML private TextArea console;
	
	private CofCHockeyApp app;
	private Team roster;
	private Coach coach;
	private Game game;
	private OrgMember orgMem;
	private Staff staff;
	private Schedule schedule;
	private String selection = "0";
	private boolean initialMenu = true;

	@Override
	public void start(Stage primaryStage) {
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("HockeyAppHUIController.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add("path/application.css");
			primaryStage.setTitle("C of C Hockey App");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	private void handleButtonAction(ActionEvent event) {
		if (initialMenu) {
			selection = inputField.getText();
			initialMenu = false;}
		app.run(selection);
		/*if (app.getStage() == 1)
		{
			app.createPlayer(roster);
		}
		else if(app.getStage() == 2)
		{
			
		}*/
			
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		app = new CofCHockeyApp(console, inputField);
		app.run(inputField.getText());
	}
}
