// My class for the clickable plane (rectangles)
package satorhho_tictactoe;

import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class Ring_Shape_Modified {
    private Circle t_circle = new Circle();
    private int column;
    private int row;
    
    Ring_Shape_Modified(int column, int row){
        this.column = column;
        this.row = row;
        t_circle.setRadius(27);
        t_circle.setFill(new Color(0,0,0,0));
        t_circle.setStroke(Color.RED);
        t_circle.setStrokeWidth(5);
    }

    public void set_circle(Circle t_circle){
        this.t_circle = t_circle;
    }
    public void set_column(int column){
        this.column = column;
    }
    public void set_row(int row){
        this.row = row;
    }
    public Circle get_circle(){
        return t_circle;
    }
    public int get_row(){
        return row;
    }
    public int get_column(){
        return column;
    }
}
