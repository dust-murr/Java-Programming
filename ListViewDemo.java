/*Write a program that that allows the user to select countries from a listview:

Use a combo box to allow the user to set the selection mode (single or multiple)
When the user selects from the list, the countries selected are show at the bottom of the window*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class ListViewDemo extends Application {
	
	private ObservableList<String> items = FXCollections.observableArrayList("Australia", "China", "France", "India", 
			"Japan", "Russia", "Spain", "UK", "US", "Venezuela");
	
	private ListView<String> lv = new ListView<>(items);
	
	private ComboBox<String> cbo = new ComboBox<>();
	
	private Label lblSelectedItems = new Label("Selected Items Are");
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		//Set size of our listview
		lv.setPrefSize(300, 240);
		
		//Set default listview mode to SINGLE
		lv.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		
		//Create a listview listener
		lv.getSelectionModel().selectedItemProperty().addListener(
				ov -> {
					setMode();
					setText();
				});
		
		//Create a label for combo box
		Label lblSelectionMode = new Label("Choose Selection Mode:", cbo);
		lblSelectionMode.setContentDisplay(ContentDisplay.RIGHT);
		
		//Set combo box properties
		cbo.getItems().addAll("SINGLE", "MULTIPLE");
		cbo.setValue("SINGLE");
		
		//Create combo box listener
		cbo.setOnAction(
				e-> {
					setMode();
					setText();
				});
		
		//Place combo box into a HBox
		HBox paneForComboBox = new HBox(5);
		paneForComboBox.setAlignment(Pos.CENTER);
		paneForComboBox.getChildren().addAll(lblSelectionMode, cbo);
		
		//Place list view and the combo box into a border
		BorderPane pane = new BorderPane();
		pane.setTop(paneForComboBox);
		pane.setCenter(new ScrollPane(lv));
		pane.setBottom(lblSelectedItems);
		
		//Do the usual scene stuff
		Scene scene = new Scene(pane, 300, 200);
		primaryStage.setTitle("Select Countries");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	    
	
	private void setText() {
		String items = "Selected items are ";
		
		for(String i: lv.getSelectionModel().getSelectedItems()) {
			items += i + " ";
		}
		
		lblSelectedItems.setText(items);
		
	}

	private void setMode() {
		if(cbo.getValue().equals("SINGLE")) {
			lv.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		}
		else {
			lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		}
	}


	/**
	* The main method is only needed for the IDE with limited
	* JavaFX support. Not needed for running from the command line.
	*/
	public static void main(String[] args) {
	  launch(args);
	}
}
