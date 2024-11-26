//Written by Dakotah Jones on 12/14/23 Ch 15 Exercise 1
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

 

public class FXBookQuote1b extends Application {

    //String storing the favorite quote from a book

    String quote = "Not All Those Who Wander Are Lost";

    //book name

    String bookName="Lord Of The Rings";

 

    @Override

    public void start(Stage primaryStage) {

        //creating a Label with the quote

        Label label1=new Label(quote);

        //using a bigger font

        label1.setFont(new Font(20));

       

        //creating another label to display book name, it is empty by default

        Label label2=new Label("");

       

        //creating a Button

        Button button=new Button("Show Book Name");

        //adding action listener to the button

        button.setOnAction(e->{

            //updating label2 with book name

            label2.setText(bookName);

        });

        //creating a VBox to arrange elements vertically, adding all elements

        VBox root = new VBox(label1,label2,button);

        root.setSpacing(10); //adding some space between components

        //aligning elements at center

        root.setAlignment(Pos.CENTER);

        //adding some space around the vbox

        root.setPadding(new Insets(30));

       

        //setting up a scene and displaying it

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);

        primaryStage.setTitle("FXBookQuote1b");

        primaryStage.show();

    }

 

    public static void main(String[] args) {

        launch(args);

    }

 

}

 