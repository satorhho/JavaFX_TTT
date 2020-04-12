// My class for the clickable plane (rectangles)
package satorhho_tictactoe;

import javafx.scene.shape.Rectangle;

public class Rectangle_Shape_Modified {
    private Rectangle t_rect = new Rectangle(50, 50);
    private int column;
    private int row;
    
   Rectangle_Shape_Modified(int column, int row){
       this.column = column;
       this.row = row;
       
   }
   // setter methods here are practically useless but let it be
   public void set_rectangle(Rectangle t_rect){
       this.t_rect = t_rect;
   }
   public void set_column(int column){
       this.column = column;
   }
   public void set_row(int row){
       this.row = row;
   }
   public Rectangle get_rectangle(){
       return t_rect;
   }
   public int column(){
       return column;
   }
   public int row(){
       return row;
   }
}
