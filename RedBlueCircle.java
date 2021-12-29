//Use JavaFX to create a program that draws a half blue, half red circle at position 100, 100 with a radius of 100.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;

public class RedBlueCircle extends Application{
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		//new Arc(posX, posY, radiusX, radiusY, startAngle, length)
		Arc arc1 = new Arc(100, 100, 100, 100, 90, 180); // Create an arc
	    arc1.setFill(Color.RED); // Set fill color
	    arc1.setType(ArcType.OPEN); // Set arc type
	    arc1.setStroke(Color.BLACK);
	    
		//new Arc(posX, posY, radiusX, radiusY, startAngle, length)
	    Arc arc2 = new Arc(100, 100, 100, 100, 90, -180);
	    arc2.setFill(Color.BLUE); // Set fill color
	    arc2.setType(ArcType.OPEN); // Set arc type
	    arc2.setStroke(Color.BLACK);
	    
	    Group group = new Group();
	    group.getChildren().addAll(arc1, arc2);
	    
	    //Create a scene and place it in the stage
	    Scene scene = new Scene(new BorderPane(group), 300, 300);
	    primaryStage.setTitle("RedBlueCircle"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	}


	public static void main(String[] args) { 
    launch(args);

	}
}
