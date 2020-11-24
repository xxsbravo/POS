import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class Screen
{
    public Screen()
    {
       initializeFunctions();
    }

    GridPane initializeFunctions()
    {
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setAlignment(Pos.TOP_LEFT);

        Button[] buttons = new Button[2];

        buttons[0] = new Button(" ");
        buttons[0].setMaxWidth(Double.MAX_VALUE);
        buttons[0].setMinSize(55, 20);

        buttons[1] = new Button(" ");
        buttons[1].setMaxWidth(Double.MAX_VALUE);
        buttons[1].setMinSize(55, 20);

        grid.add(buttons[0], 0, 1);
        grid.add(buttons[1], 0, 2);

        buttons[0].setStyle("-fx-font-size: 15");
        buttons[1].setStyle("-fx-font-size: 15");

        grid.setStyle("-fx-padding: 80 0 0 50");

        return grid;
    }

//    BorderPane initializeScreen()
//    {
//        BorderPane screenPane = new BorderPane();
//
//        return screenPane;
//    }

    
}
