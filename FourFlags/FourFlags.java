import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;


public class FourFlags extends Application {
	
	@Override // Override the start method in the Application class
	 public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		
		Image flag1 = new Image("Images/us.gif");
		Image flag2 = new Image("Images/uk.gif");
		Image flag3 = new Image("Images/ca.gif");
		Image flag4 = new Image("Images/china.gif");
		
		ImageView view1 = new ImageView(flag1);
		ImageView view2 = new ImageView(flag2);
		ImageView view3 = new ImageView(flag3);
		ImageView view4 = new ImageView(flag4);
		
		pane.add(view1, 0, 0);
		pane.add(view2, 1, 0);
		pane.add(view3, 0, 1);
		pane.add(view4, 1, 1);
		
		//Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Four Flags"); //Set the stage title
		primaryStage.setScene(scene); //Place the scene in the stage
		primaryStage.show(); //Display the stage
		
	}
	
	

	public static void main(String[] args) {
		launch(args);
	}

}
