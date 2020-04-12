// Author: Lance Kent Briones
// Project Starting Date: January 8, 2020
// Project Ending Date: --- 
package satorhho_tictactoe;

//import javafx.scene.shape.Shape;
//import javafx.scene.shape.Circle;
//import java.lang.Object;
//import javafx.scene.Node;

//import javafx.scene.shape.Line;

//import javafx.scene.shape.Rectangle;
import javafx.scene.layout.GridPane;
//import javafx.scene.layout.Pane;
import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.text.Text;

public class SatorHHO_TicTacToe extends Application {
    private Button r0c0 = new Button("r0c0");
    private Button r0c1 = new Button("r0c1");
    private Button r0c2 = new Button("r0c2");
    private Button r1c0 = new Button("r1c0");
    private Button r1c1 = new Button("r0c1");
    private Button r1c2 = new Button("r1c1");
    private Button r2c0 = new Button("r2c0");
    private Button r2c1 = new Button("r2c1");
    private Button r2c2 = new Button("r2c2");
    private Button refresh = new Button("Refresh");
    private int counter;
    
    @Override
    public void start(Stage primaryStage) {
        set_counter(1);
        
        // for my platform pane
        GridPane gridpane = new GridPane();
        gridpane.setAlignment(Pos.CENTER);
        
        Text text = new Text();
        text.setText("yayeet");
        
        // Set position for all button in the plane
        gridpane.add(r0c0, 0, 0);
        gridpane.add(r0c1, 0, 1);
        gridpane.add(r0c2, 0, 2);
        gridpane.add(r1c0, 1, 0);
        gridpane.add(r1c1, 1, 1);
        gridpane.add(r1c2, 1, 2);
        gridpane.add(r2c0, 2, 0);
        gridpane.add(r2c1, 2, 1);
        gridpane.add(r2c2, 2, 2);
        
        gridpane.add(refresh, 0, 3);
        
        gridpane.setVgap(50);
        gridpane.setHgap(50);
        
        r0c0.setOnAction(e ->{
            
            if(counter%2!=0){
                Cross_Shape_Modified one = new Cross_Shape_Modified(0, 0);
                gridpane.add(one.get_line(), 0, 0);
                gridpane.add(one.get_line2(), 0, 0);
                set_counter(++counter);
            }
            else {
                Ring_Shape_Modified two = new Ring_Shape_Modified(0, 0);
                gridpane.add(two.get_circle(), 0, 0);
                set_counter(++counter);
            }
            gridpane.getChildren().remove(r0c0);

        });

        r0c1.setOnAction(e ->{
            if(counter%2!=0){
                Cross_Shape_Modified one = new Cross_Shape_Modified(0, 1);
                gridpane.add(one.get_line(), 0, 1);
                gridpane.add(one.get_line2(), 0, 1);
                set_counter(++counter);
            }
            else {
                Ring_Shape_Modified two = new Ring_Shape_Modified(0, 1);
                gridpane.add(two.get_circle(), 0, 1);
                set_counter(++counter);
            }
            gridpane.getChildren().remove(r0c1);
        });

        r0c2.setOnAction(e ->{
            if(counter%2!=0){
                Cross_Shape_Modified one = new Cross_Shape_Modified(0, 2);
                gridpane.add(one.get_line(), 0, 2);
                gridpane.add(one.get_line2(), 0, 2);
                set_counter(++counter);
            }
            else {
                Ring_Shape_Modified two = new Ring_Shape_Modified(0, 2);
                gridpane.add(two.get_circle(), 0, 2);
                set_counter(++counter);
            }
            gridpane.getChildren().remove(r0c2);
        });

        r1c0.setOnAction(e ->{
            if(counter%2!=0){
                Cross_Shape_Modified one = new Cross_Shape_Modified(1, 0);
                gridpane.add(one.get_line(), 1, 0);
                gridpane.add(one.get_line2(), 1, 0);
                set_counter(++counter);
            }
            else {
                Ring_Shape_Modified two = new Ring_Shape_Modified(1, 0);
                gridpane.add(two.get_circle(), 1, 0);
                set_counter(++counter);
            }
            gridpane.getChildren().remove(r1c0);
        });

        r1c1.setOnAction(e ->{
            if(counter%2!=0){
                Cross_Shape_Modified one = new Cross_Shape_Modified(1, 1);
                gridpane.add(one.get_line(), 1, 1);
                gridpane.add(one.get_line2(), 1, 1);
                set_counter(++counter);
            }
            else {
                Ring_Shape_Modified two = new Ring_Shape_Modified(1, 1);
                gridpane.add(two.get_circle(), 1, 1);
                set_counter(++counter);
            }
            gridpane.getChildren().remove(r1c1);
        });

        r1c2.setOnAction(e ->{
            if(counter%2!=0){
                Cross_Shape_Modified one = new Cross_Shape_Modified(1, 2);
                gridpane.add(one.get_line(), 1, 2);
                gridpane.add(one.get_line2(), 1, 2);
                set_counter(++counter);
            }
            else {
                Ring_Shape_Modified two = new Ring_Shape_Modified(1, 2);
                gridpane.add(two.get_circle(), 1, 2);
                set_counter(++counter);
            }
            gridpane.getChildren().remove(r1c2);
        });

        r2c0.setOnAction(e ->{
            if(counter%2!=0){
                Cross_Shape_Modified one = new Cross_Shape_Modified(2, 0);
                gridpane.add(one.get_line(), 2, 0);
                gridpane.add(one.get_line2(), 2, 0);
                set_counter(++counter);
            }
            else {
                Ring_Shape_Modified two = new Ring_Shape_Modified(2, 0);
                gridpane.add(two.get_circle(), 2, 0);
                set_counter(++counter);
            }
            gridpane.getChildren().remove(r2c0);
        });

        r2c1.setOnAction(e ->{
            if(counter%2!=0){
                Cross_Shape_Modified one = new Cross_Shape_Modified(2, 1);
                gridpane.add(one.get_line(), 2, 1);
                gridpane.add(one.get_line2(), 2, 1);
                set_counter(++counter);
            }
            else {
                Ring_Shape_Modified two = new Ring_Shape_Modified(2, 1);
                gridpane.add(two.get_circle(), 2, 1);
                set_counter(++counter);
            }
            gridpane.getChildren().remove(r2c1);
        });

        r2c2.setOnAction(e ->{
            if(counter%2!=0){
                Cross_Shape_Modified one = new Cross_Shape_Modified(2, 2);
                gridpane.add(one.get_line(), 2, 2);
                gridpane.add(one.get_line2(), 2, 2);
                set_counter(++counter);
            }
            else {
                Ring_Shape_Modified two = new Ring_Shape_Modified(2, 2);
                gridpane.add(two.get_circle(), 2, 2);
                set_counter(++counter);
            }
            gridpane.getChildren().remove(r2c2);
        });
        
        refresh.setOnAction(e ->{
            refresh(gridpane);
            set_counter(1);
        });
        
        
        Scene scene = new Scene(gridpane, 600, 600);
        primaryStage.setTitle("SatorHHO_Minigame");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void refresh(GridPane grid){
        grid.getChildren().clear();

        grid.add(r0c0, 0, 0);
        grid.add(r0c1, 0, 1);
        grid.add(r0c2, 0, 2);
        grid.add(r1c0, 1, 0);
        grid.add(r1c1, 1, 1);
        grid.add(r1c2, 1, 2);
        grid.add(r2c0, 2, 0);
        grid.add(r2c1, 2, 1);
        grid.add(r2c2, 2, 2);
        grid.add(refresh, 0, 3);
    }
    public void set_counter(int n){
        this.counter = n;
    
    }
    public void sample_clicked(Button button){
        button.setDisable(true);
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}