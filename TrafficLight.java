package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TrafficLight extends Application {
    @Override
    public void start(Stage primaryStage){

        //Creates the circle for the stoplight
        StackPane pane = new StackPane();
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();

        //Creates the stoplight shape
        Rectangle rectangle = new Rectangle;
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.WHITE);
        rectangle.setWidth();
        rectangle.setHeight();

        //Creates Hbox for radio buttons
        HBox hBox = new HBox();
        hBox.setSpacing(5);
        hBox.setAlignment(Pos.CENTER);

        //Creates Radio buttons
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbYellow = new RadioButton("Yellow");
        RadioButton rbGreen = new RadioButton("Green");

        //
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);

        //Creates a scene and places it in the stage
        Scene scene = new Scene(borderPane, 200, 150);
        primaryStage.setTitle("Exercise 16_03");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

}
