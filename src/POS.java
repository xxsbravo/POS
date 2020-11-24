import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class POS
{
    Buttons buttons;
    Screen screen;
    Stage window;

    public POS(Stage window)
    {
        this.window = window;

        initializeUI();
    }

    void initializeUI()
    {
        BorderPane root = new BorderPane();

        Scene scene = new Scene(root, 700, 600);
        scene.getStylesheets().add("Style.css");
        scene.setFill(Color.TRANSPARENT);

        buttons = new Buttons();
        screen = new Screen();

        root.setLeft(buttons.initializeNumbers());
        root.setRight(buttons.initializeInputs());

        root.setTop(screen.initializeFunctions());

        window.initStyle(StageStyle.TRANSPARENT);
        window.setScene(scene);
        window.show();
    }
}
