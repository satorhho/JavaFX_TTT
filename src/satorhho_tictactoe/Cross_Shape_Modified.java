package satorhho_tictactoe;

import javafx.scene.shape.Line;
import javafx.scene.paint.Color;

public class Cross_Shape_Modified {
    private Line t_line = new Line(50, 50, 90, 90);
    private Line t_line2 = new Line(50, 90, 90, 50);
    private int column;
    private int row;
    
    Cross_Shape_Modified(int column, int row){
        this.column = column;
        this.row = row;
        t_line.setStrokeWidth(7);
        t_line2.setStrokeWidth(7);
        t_line.setStroke(Color.BLUE);
        t_line2.setStroke(Color.BLUE);

    }
    
    public void set_column(int column){
        this.column = column;
    }
    public void set_row(int row){
        this.row = row;
    }
    public void set_line1(Line t_line){
        this.t_line = t_line;
    }
    public void set_line2(Line t_line2){
        this.t_line2 = t_line2;
    }
    public int get_column(){
        return column;
    }
    public int get_row(){
        return row;
    }
    public Line get_line(){
        return t_line;
    }
    public Line get_line2(){
        return t_line2;
    }
}
