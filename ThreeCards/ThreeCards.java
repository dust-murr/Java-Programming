import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import java.util.ArrayList;
import java.util.Collections;

public class ThreeCards extends Application {
	@Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int x = 1; x < 53; x++) {
			list.add(x);
		}
		Collections.shuffle(list);
	    
		// Create a pane to hold the image views
	    Pane pane = new HBox(15);
	    pane.setPadding(new Insets(5, 5, 5, 5));
	    
	    pane.getChildren().add(new ImageView("card/" + list.get(0) + ".png")); 
	    pane.getChildren().add(new ImageView("card/" + list.get(1) + ".png")); 
	    pane.getChildren().add(new ImageView("card/" + list.get(2) + ".png")); 
	    
	    // Create a scene and place it in the stage
	    Scene scene = new Scene(pane);
	    primaryStage.setTitle("3 Shuffled Cards"); // Set the stage title
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
