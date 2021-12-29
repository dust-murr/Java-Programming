import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ShakespearePane extends BorderPane {
	//Create text
	protected Text text = new Text(50, 50, "Shakespeare Quotes");
	
	//Create text area
	protected TextArea ta = new TextArea();
	
	//Create buttons
	protected Button btLear = new Button("King Lear");
	protected Button btMacbeth = new Button("MacBeth");
	protected Button btHamlet = new Button("Hamlet");
	protected Button btRichard = new Button("Richard III");
	protected Button btOthello = new Button("Othello");
	
	//Create HBox to hold text
	private HBox paneForText = new HBox(20);
	
	//Create scroll pane to hold text area
	private ScrollPane scrollPane = new ScrollPane(ta);

	//Create HBox to hold buttons
	private HBox paneForButtons = new HBox(20);
		
	public ShakespearePane() {
		drawShakespeareConsole();
	}

	private void drawShakespeareConsole() {
		
		//Text area size
		ta.setPrefSize(450, 75);
		
		//Put text in HBox
		paneForText.getChildren().addAll(text);
		paneForText.setAlignment(Pos.BOTTOM_LEFT);
		paneForText.setPadding(new Insets(20, 5, 5, 20));
		text.setFont(Font.font("Arial", 28));
		
		//Put buttons in HBox and set properties
		paneForButtons.getChildren().addAll(btLear, btMacbeth, btHamlet, btRichard, btOthello);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.setPadding(new Insets(0, 10, 0, 10));
		paneForButtons.setStyle("-fx-border-color: green");
	
		//Place nodes into BorderPane
		setTop(paneForText);
		setCenter(scrollPane);
		setBottom(paneForButtons);
	}
}
