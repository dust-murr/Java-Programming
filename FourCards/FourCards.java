import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class FourCards extends Application {
	@Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int x = 1; x < 53; x++) {
			list.add(x);
		}
		Collections.shuffle(list);
	    
	// Hold the pane and set its properties
	    HBox hBox = new HBox(15);
	    hBox.setSpacing(10);
	    hBox.setPadding(new Insets(5, 5, 5, 5));
	    hBox.getChildren().add(new ImageView("card/" + list.get(0) + ".png")); 
	    hBox.getChildren().add(new ImageView("card/" + list.get(1) + ".png")); 
	    hBox.getChildren().add(new ImageView("card/" + list.get(2) + ".png")); 
	    hBox.getChildren().add(new ImageView("card/" + list.get(3) + ".png")); 
	    
	 // Create the button
	    Button btShuffle = new Button("Refresh");
	   
	 // Hold the pane and set its properties
	    VBox vBox = new VBox(15);
	    vBox.setAlignment(Pos.CENTER);
	    vBox.setPadding(new Insets(5));
	    vBox.getChildren().addAll(hBox, btShuffle);
	    
	 // Create a scene and place it in the stage
	    Scene scene = new Scene(vBox);
	    primaryStage.setTitle("4 Shuffled Cards"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	    
	 // Process event
	    btShuffle.setOnAction(( ActionEvent e) -> {
	    	Collections.shuffle(list);
	    	hBox.getChildren().clear();
	    	hBox.getChildren().add(new ImageView("card/" + list.get(0) + ".png"));
	    	hBox.getChildren().add(new ImageView("card/" + list.get(1) + ".png"));
	    	hBox.getChildren().add(new ImageView("card/" + list.get(2) + ".png"));
	    	hBox.getChildren().add(new ImageView("card/" + list.get(3) + ".png"));
	      });
		}
	
	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	  
	public static void main(String[] args) {
	    launch(args);
	  }
	}
