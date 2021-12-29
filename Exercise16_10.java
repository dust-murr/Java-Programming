/*Write a program that displays a text file in a text area. 

The user enters a file name in a text field
The user then clicks a "View" button
The file contents are displayed in a text area */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Exercise16_10 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws Exception {
		
		TextArea ta = new TextArea();
		TextField tf = new TextField();
	
		//Set text area and text field defaults
		ta.setEditable(false);
		ta.setWrapText(true);
		tf.setEditable(true);
	
		//Create button
		Button btView = new Button("View");

		//Create pane for text field and button, and set properties for text field
		HBox paneForTextField = new HBox();
		paneForTextField.getChildren().addAll(new Label("Filename: "), tf, btView);
		tf.setPrefColumnCount(34);
	
		//Create scroll pane to hold text area
		ScrollPane scrollPane = new ScrollPane(ta);
	

		//Create a pane to hold scroll pane and HBox
		VBox vBox = new VBox();
		vBox.setAlignment(Pos.CENTER);
		vBox.getChildren().addAll(scrollPane, paneForTextField);

		//Process event
		btView.setOnAction(e -> {
			File file = new File(tf.getText());


            try(Scanner input = new Scanner(file);)
            {
            while(input.hasNext()){
                ta.setText(input.nextLine());
                }
            }
            catch(IOException f){
                ta.setText("File Read Error");
        }
        });

		//Create a scene and stage
		Scene scene = new Scene(vBox, 500, 200);
		primaryStage.setTitle("Exercise16_10"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	/**
	* The main method is only needed for the IDE with limited
	* JavaFX support. Not needed for running from the command line.
	*/
	public static void main(String[] args) {
	  launch(args);
	}
}
