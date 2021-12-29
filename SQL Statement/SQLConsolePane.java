import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class SQLConsolePane extends BorderPane{
	protected TextArea ta = new TextArea();
	protected TextField tf = new TextField();
	
	//Create buttons
	protected Button btFire = new Button("Fire!");
	protected Button btClear = new Button("Clear");
	
	//Create HBox to hold text field and buttons
	private HBox paneForTextField = new HBox(5);
	private HBox paneForButtons = new HBox(5);
	
	//Create scroll pane to hold text area
	private ScrollPane scrollPane = new ScrollPane(ta);

	public SQLConsolePane() {
		drawSQLConsole();
	}

	private void drawSQLConsole() {
		tf.setPrefColumnCount(55);
		
		ta.setPrefSize(800, 450);
		
		//Put text field in HBox
		paneForTextField.getChildren().addAll(new Label("SQL Statement: "), tf);
		paneForTextField.setPadding(new Insets(40, 10, 10, 10));
		
		//Put buttons in HBox
		paneForButtons.getChildren().addAll(btFire, btClear);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.setPadding(new Insets(5, 0, 5, 0));
	
		//Place nodes into BorderPane
		setTop(paneForButtons);
		setCenter(scrollPane);
		setBottom(paneForTextField);
	}
	
}
