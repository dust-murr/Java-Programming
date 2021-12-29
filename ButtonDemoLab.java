import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class ButtonDemoLab extends Application {
  Text text = new Text(50, 50, "Programming is Fun!");
  CheckBox chkBold = new CheckBox("Bold");
  CheckBox chkItalic = new CheckBox("Italic");
  
  RadioButton rbRed = new RadioButton("Red");
  RadioButton rbYellow = new RadioButton("Yellow");
  RadioButton rbBlack = new RadioButton("Black");
  RadioButton rbOrange = new RadioButton("Orange");
  RadioButton rbGreen = new RadioButton("Green");
  
  ComboBox<String> cbFontFamilies = new ComboBox<>();
  ComboBox<Integer> cbFontSize = new ComboBox<>();
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) throws Exception {
	  
	  //Populate the font type combo type
	  cbFontFamilies.getItems().addAll(Font.getFamilies());
	  cbFontFamilies.setValue(text.getFont().getFamily());
	  
	  //Add a label for font type box
	  Label lblFontFamilies = new Label("Font Name", cbFontFamilies);
	  lblFontFamilies.setContentDisplay(ContentDisplay.RIGHT);
	  
	  //Populate the font size combo box
	  cbFontSize.getItems().addAll(getSize());
	  cbFontSize.setValue((int) text.getFont().getSize());
	  
	  //Add a label for font size box
	  Label lblFontSize = new Label("Font Size", cbFontSize);
	  lblFontSize.setContentDisplay(ContentDisplay.RIGHT);
	  
	  //Create a pane for the combo boxes etc.
	  HBox comboBoxPane = new HBox(lblFontFamilies, lblFontSize);
	  comboBoxPane.setSpacing(20);
	  comboBoxPane.setPadding(new Insets(15));
	  
	  //Create update for font type and font size
	  cbFontFamilies.setOnAction(e -> update());
	  cbFontSize.setOnAction(e -> update());
	  
	  // Create the check box button listeners
	  chkBold.setOnAction(e -> update());
	  chkItalic.setOnAction(e -> update());
	
	  //Create a HBox to hold our check boxes
	  HBox checkBoxPane = new HBox(chkBold, chkItalic);
	  checkBoxPane.setSpacing(30);
	  checkBoxPane.setPadding(new Insets(5)); //Set padding
	  checkBoxPane.setAlignment(Pos.CENTER);
	    
	  //Create a HBox to hold my radio buttons
	  HBox paneForRadioButtons = new HBox(20);
	  
	  //Put radio buttons into the pane
	  paneForRadioButtons.getChildren().addAll(rbRed, rbYellow, rbBlack, rbOrange, rbGreen);
	  paneForRadioButtons.setAlignment(Pos.CENTER);
	  paneForRadioButtons.setPadding(new Insets(10));
	  
	  //Create a toggle group for the radio buttons
	  ToggleGroup group = new ToggleGroup();
	  rbRed.setToggleGroup(group);
	  rbYellow.setToggleGroup(group);
	  rbBlack.setToggleGroup(group);
	  rbOrange.setToggleGroup(group);
	  rbGreen.setToggleGroup(group);
	  
	  rbBlack.setSelected(true);
	  
	  radioButtonHandlers();
	  
	  //Create pane to hold check box and radio button pane
	  VBox paneForAllButtons = new VBox(10);
	  paneForAllButtons.getChildren().addAll(checkBoxPane, paneForRadioButtons);
	  
	  StackPane centerPane = new StackPane(text);
	  update(); //Set text to default
	    
	  BorderPane borderPane = new BorderPane(centerPane);
	  borderPane.setTop(comboBoxPane);
	  borderPane.setBottom(paneForAllButtons);
	    
	  // Create a scene and place it in the stage
	  Scene scene = new Scene(borderPane, 500, 350);
	  primaryStage.setTitle("ButtonDemoLab"); // Set the stage title
	  primaryStage.setScene(scene); // Place the scene in the stage
	  primaryStage.show(); // Display the stage
  }
  
  private Integer[] getSize() {
	  Integer[] sizes = new Integer[100];
	  
	  for(int i = 0; i < 100; i++) {
		  sizes[i] = i + 1;
	  }
	  return sizes;
  }

private void radioButtonHandlers() {
	  rbRed.setOnAction(e -> {
		  if(rbRed.isSelected()) {
			  text.setFill(Color.RED);
		  }
	  });
	  
	  rbYellow.setOnAction(e -> {
		  if(rbYellow.isSelected()) {
			  text.setFill(Color.YELLOW);
		  }
	  });
	  
	  rbBlack.setOnAction(e -> {
		  if(rbBlack.isSelected()) {
			  text.setFill(Color.BLACK);
		  }
	  });
	  
	  rbOrange.setOnAction(e -> {
		  if(rbOrange.isSelected()) {
			  text.setFill(Color.ORANGE);
		  }
	  });
	  
	  rbGreen.setOnAction(e -> {
		  if(rbGreen.isSelected()) {
			  text.setFill(Color.GREEN);
		  }
	  });
  }

  private void update() {
	  FontWeight fontWeight = (chkBold.isSelected()) ? FontWeight.BOLD : FontWeight.NORMAL;
	  
	  /*//Equivalent IF statement
	  if(chkBold.isSelected()) {
		  fontWeight = FontWeight.BOLD;
	  }
	  else {
		  fontWeight = FontWeight.NORMAL;
	  }*/
	  
	  FontPosture fontPosture = (chkItalic.isSelected()) ? FontPosture.ITALIC : FontPosture.REGULAR;
	  
	  //Equivalent IF statement
	  /*if(chkItalic.isSelected()) {
		    fontPosture = FontPosture.ITALIC;
	    }
	    else {
		    fontPosture = FontPosture.REGULAR;
  	    }*/

	  String fontFamily = cbFontFamilies.getValue();
	  double size = cbFontSize.getValue();
	  
	  text.setFont(Font.font(fontFamily, fontWeight, fontPosture, size));
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
