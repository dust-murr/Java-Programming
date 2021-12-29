/*User sliders and scroll bars to control the color and opacity of text:

Sliders are used to set the level of red, green, and blue
A scrollbar is used to set the opacity level
When the sliders and/or scroll bar are moved, the text updates its color or opacity*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class ScrollSlider extends Application {
	
	private Text text = new Text("Show Colors");
	
	private Slider slRed = new Slider();
	private Slider slGreen = new Slider();
	private Slider slBlue = new Slider();
	
	private ScrollBar slOpacity = new ScrollBar();
	
	@Override
	public void start(Stage primaryStage) {
		
		//Set text font and size
		text.setFont(Font.font("Arial", FontWeight.BOLD, 28));
		
		//Create a stackpane for the text
		StackPane paneForText = new StackPane(text);
		paneForText.setPadding(new Insets(20, 10, 5, 10));
		
		//Set slider properties
		slRed.setMin(0.0);
		slRed.setMax(1.0);
		slGreen.setMin(0.0);
		slGreen.setMax(1.0);
		slBlue.setMin(0.0);
		slBlue.setMax(1.0);
		
		//Create listeners for sliders
		slRed.valueProperty().addListener(e -> setColor());
		slGreen.valueProperty().addListener(e -> setColor());
		slBlue.valueProperty().addListener(e -> setColor());
		
		//Set properties for the scroll bar
		slOpacity.setOrientation(Orientation.HORIZONTAL);
		slOpacity.setMin(0.0);
		slOpacity.setMax(1.0);
		
		//Set listener for scroll bar
		slOpacity.valueProperty().addListener(e -> setColor());
		slOpacity.setValue(1);
		
		//Create a grid pane for labeled sliders and scrollbar
		GridPane paneForSliders = new GridPane();
		paneForSliders.setAlignment(Pos.CENTER);
		paneForSliders.setVgap(5);
		paneForSliders.setHgap(5);
		
		paneForSliders.add(new Label("Red"), 0, 0);
		paneForSliders.add(slRed, 1, 0);
		paneForSliders.add(new Label("Green"), 0, 1);
		paneForSliders.add(slGreen, 1, 1);
		paneForSliders.add(new Label("Blue"), 0, 2);
		paneForSliders.add(slBlue, 1, 2);
		
		paneForSliders.add(new Label("Opacity"), 0, 3);
		paneForSliders.add(slOpacity, 1, 3);
		
		//Place object in a border pane
		BorderPane pane = new BorderPane();
		pane.setTop(paneForText);
		pane.setBottom(paneForSliders);
		
		//Now the usual scene stuff
		Scene scene = new Scene(pane, 250, 200);
	    primaryStage.setTitle("Scrollbars and Sliders"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	}
	
	private void setColor() {
		text.setFill(new Color(slRed.getValue(), slGreen.getValue(), slBlue.getValue(), 
				slOpacity.getValue()));
	}


	/**
	* The main method is only needed for the IDE with limited
	* JavaFX support. Not needed for running from the command line.
	*/
	public static void main(String[] args) {
	  launch(args);
	}
}
