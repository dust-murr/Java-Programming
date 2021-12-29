/*Write a program that demonstrates the properties of a text area:

The program uses a check box to indicate whether the text should be wrapped
The program uses a check box to indicate whether the text is editable*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;

public class Lab13 extends Application {
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws Exception {
		TextArea textArea = new TextArea(getText());
		
		//Set text area defaults
		textArea.setEditable(false);
		textArea.setWrapText(false);
		
		//Create scroll pane to hold our text area
		ScrollPane scrollPane = new ScrollPane(textArea);
		
		//Create 2 check boxes
		CheckBox chkEditable = new CheckBox("Editable");
		CheckBox chkWrap = new CheckBox("Wrap");
		
		//Create handlers for check boxes
		chkEditable.setOnAction(e -> {
			textArea.setEditable(chkEditable.isSelected());
		});
		
		chkWrap.setOnAction(e -> {
			textArea.setWrapText(chkWrap.isSelected());
		});
		
		//Create HBox to hold the check boxes
		HBox paneForCheckBoxes = new HBox(10);
		paneForCheckBoxes.setAlignment(Pos.CENTER);
		paneForCheckBoxes.getChildren().addAll(chkEditable, chkWrap);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(scrollPane);
		borderPane.setBottom(paneForCheckBoxes);
		
		//Create a scene and stage
		Scene scene = new Scene(borderPane);
		primaryStage.setTitle("Text Area Lab"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}
	

	  private String getText() {
		return "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
	}


	/**
	   * The main method is only needed for the IDE with limited
	   * JavaFX support. Not needed for running from the command line.
	   */
	  public static void main(String[] args) {
	    launch(args);
	  }
	}
