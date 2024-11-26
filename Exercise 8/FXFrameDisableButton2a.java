//Written by Dakotah Jones on 12/14/23 Ch 15 Exercise 2
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FXFrameDisableButton2a extends Application { // class
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("CLICK ME"); // SET NAME IN CONSTRUCTOR
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                btn.setDisable(true); // DISABLE BUTTON ON CLICK
            }
        });
        btn.setLayoutX(105); // setlocation
        btn.setLayoutY(90);
        Pane root = new Pane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Disable Button");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}