//Written by Dakotah Jones on 12/14/23 Ch 15 Exercise 3
package form;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class ShowFacts extends Application {
    private int showMe;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) {
        showMe = 0;
        Scene scene = new Scene(new Group(), 450, 250);
        Button button = new Button("Show Facts");
        Label facts[] = new Label[6];
        facts[0] = new Label("Fact 1: I am utilizing javafx.");
        facts[1] = new Label("Fact 2: I take classes for Saint Leo University.");
        facts[2] = new Label("Fact 3: More cows attack people per year than sharks do.");
        facts[3] = new Label("Fact 4: There are far few brown cats than any other type of cat.");
        facts[4] = new Label("Fact 5: The biggest animal to ever exist is the blue whale.");
        facts[5] = new Label("Fact 6: Java is a programming language.");
        
        
        
        GridPane grid = new GridPane();
        grid.setVgap(4);
        grid.setHgap(10);
        grid.setPadding(new Insets(5, 5, 5, 5));
        for(int i=0;i<facts.length;i++){
            grid.add(facts[i], 3, i);
            facts[i].setVisible(false);
        }
        
        grid.add(button, 3, facts.length);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try{
                    facts[showMe].setVisible(false);
                    showMe++;
                    if(showMe>5){
                        showMe=0;
                    }
                    facts[showMe].setVisible(true);
                    
                }catch(Exception ex){
                }
            }
        });


        Group root = (Group) scene.getRoot();
        root.getChildren().add(grid);
        stage.setScene(scene);
        stage.show();
    }
}