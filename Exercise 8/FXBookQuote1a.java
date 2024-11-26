//Written by Dakotah Jones on 12/14/23 Ch 15 Exercise 1
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

 

public class FXBookQuote1a extends Application {

    //String storing the favorite quote from a book

    String quote = "Not All Those Who Wander Are Lost";

 

    @Override

    public void start(Stage primaryStage) {

        //creating a Label with the quote

        Label label=new Label(quote);

        //using a bigger font

        label.setFont(new Font(20));

        //creating a pane and adding the label

        Pane root = new Pane(label);

        //adding some padding space around the label

        label.setPadding(new Insets(50));

        //setting up a scene and displaying it

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);

        primaryStage.setTitle("FXBookQuote1a");

        primaryStage.show();

    }

 

    public static void main(String[] args) {

        launch(args);

    }

 

}