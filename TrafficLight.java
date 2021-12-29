/*Write a program that simulates a traffice light:

There are three radio buttons the user can select from (red, yellow, green)
When the user selects a color, that color in the traffic light turns on
Only 1 light can be on at a time
No light is on when the program starts.*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TrafficLight extends Application {
  private double paneWidth = 200;
  private double paneHeight = 100;
  
  RadioButton rbRed = new RadioButton("Red");
  RadioButton rbYellow = new RadioButton("Yellow");
  RadioButton rbGreen = new RadioButton("Green");
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    Pane pane = new Pane();
    Circle circleRed = new Circle(paneWidth / 2, 20, 10);
    Circle circleYellow = new Circle(paneWidth / 2, 50, 10);
    Circle circleGreen = new Circle(paneWidth / 2, 80, 10);
    circleRed.setStroke(Color.BLACK);
    circleYellow.setStroke(Color.BLACK);
    circleGreen.setStroke(Color.BLACK);
    circleRed.setFill(Color.WHITE);
    circleYellow.setFill(Color.WHITE);
    circleGreen.setFill(Color.WHITE);
    Rectangle rectangle = new Rectangle(paneWidth / 2 - 15, 5, 30, 90);
    rectangle.setFill(Color.WHITE);
    rectangle.setStroke(Color.BLACK);
    
    pane.getChildren().addAll(rectangle, circleRed, circleYellow, circleGreen);
    
    
    //Create a HBox to hold my radio buttons
	HBox paneForRadioButtons = new HBox(20);
	
	//Put radio buttons into the pane
	paneForRadioButtons.getChildren().addAll(rbRed, rbYellow, rbGreen);
	paneForRadioButtons.setAlignment(Pos.CENTER);
	paneForRadioButtons.setPadding(new Insets(10));
	  
	//Create a toggle group for the radio buttons
	ToggleGroup group = new ToggleGroup();
	rbRed.setToggleGroup(group);
	rbYellow.setToggleGroup(group);
	rbGreen.setToggleGroup(group);
	  
	//Create pane to hold check box and radio button pane
	BorderPane borderPane = new BorderPane();
	borderPane.setCenter(pane);
	borderPane.setBottom(paneForRadioButtons);
	
	//Create handlers
	rbRed.setOnAction(e -> {
		  if(rbRed.isSelected()) {
			circleRed.setFill(Color.RED);
			circleYellow.setFill(Color.WHITE);
			circleGreen.setFill(Color.WHITE);
		  }
	  });
	  
	  rbYellow.setOnAction(e -> {
		  if(rbYellow.isSelected()) {
			circleYellow.setFill(Color.YELLOW);
			circleRed.setFill(Color.WHITE);
			circleGreen.setFill(Color.WHITE);
		  }
	  });
	  
	  rbGreen.setOnAction(e -> {
		  if(rbGreen.isSelected()) {
			circleGreen.setFill(Color.GREEN);
			circleRed.setFill(Color.WHITE);
			circleYellow.setFill(Color.WHITE);
		  }
	  });
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(borderPane, paneWidth + 20, paneHeight + 50);
    primaryStage.setTitle("Traffic Light"); // Set the stage title
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
