//Written by Dakotah Jones on 12/14/23 Ch 15 Exercise 2
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FXFrameDisableButton2b extends Application {
    int count = 0; // declare count
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("CLICK ME"); // create button
        Label label  = new Label(); // create label
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                count++; // increase count
                if(count == 8){ // check count = 8
                    label.setText("That\'s enough!");
                    btn.setDisable(true);
                }
            }
        });
        btn.setLayoutX(105);
        btn.setLayoutY(90);
        label.setLayoutX(105);
        label.setLayoutY(125);
        Pane root = new Pane();
        root.getChildren().add(btn);
        root.getChildren().add(label);
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