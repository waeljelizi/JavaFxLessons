package javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Lesson1 extends Application {
    
    //Stage means the window
    Stage window;
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        //creating a label to display hello world message
        Label text = new Label();
        text.setText("Hello World");
        
        //creating a layout [StackPane make any item at the center of window]
        StackPane layout = new StackPane();
        //adding the text to the layout
        layout.getChildren().add(text);
        
        //Scene means the content of the window
        Scene scene = new Scene(layout, 300, 250);
        //setting window's title
        window.setTitle("Hello World!");
        //adding the content to the window
        window.setScene(scene);
        //display the window
        window.show();
    }
    
    public static void main(String[] args) {
        //launch method is used to start our application
        launch(args);
    }
    
}
