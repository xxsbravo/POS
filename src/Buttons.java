import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class Buttons extends Parent
{
    public Buttons()
    {
        initializeNumbers();
    }

    GridPane initializeNumbers()
    {
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setAlignment(Pos.BOTTOM_LEFT);

        Button[] button = new Button[10];

        for (int i = 0; i < button.length; i++)
        {
            //Converts i to a String
            String btnName = Integer.toString(i);

            //Assigns the Button's Title and Array according to the iteration number.
            button[i] = new Button(btnName);

            //Forces buttons in array to be set individually to 100x100 Pixels.
            button[i].setMinSize(55, 55);
        }

        //Displays The "0" Button's width to be larger than all the other buttons.
        grid.add(button[0], 1, 4, 1, 1);
        button[0].setMaxWidth(Double.MAX_VALUE);

        grid.add(button[1], 0, 1);
        grid.add(button[2], 1, 1);
        grid.add(button[3], 2, 1);
        grid.add(button[4], 0, 2);
        grid.add(button[5], 1, 2);
        grid.add(button[6], 2, 2);
        grid.add(button[7], 0, 3);
        grid.add(button[8], 1, 3);
        grid.add(button[9], 2, 3);

        grid.setStyle("-fx-padding: 0 0 60 125");

        return grid;
    }

    GridPane initializeInputs()
    {
        GridPane grid = new GridPane();
        grid.setVgap(9.75);
        grid.setHgap(10);
        grid.setAlignment(Pos.BOTTOM_RIGHT);

        Button[] button = new Button[3];

        button[0] = new Button("ESC");
        button[0].setMinSize(55, 55);
        button[1] = new Button("CLR");
        button[1].setMinSize(55, 55);
        button[2] = new Button("ENTER ↵");
        button[2].setMinSize(50, 55);

        grid.add(button[0], 0, 1);
        grid.add(button[1], 1, 1);
        button[2].setMaxWidth(Double.MAX_VALUE);
        grid.add(button[2], 0, 15, 2, 1);

        grid.setStyle("-fx-padding: 0 125 60 0");

        return grid;
    }
}
