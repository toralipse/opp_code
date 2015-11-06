/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fig;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 *
 * @author p675037t
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Pane pane;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        Figure[] figs = {new Figure(52,37),new Rect(84,45)};
        for(Figure fig:figs){
            fig.draw("test");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    Group group = new Group();
    int gy = 0;
    
    class Figure{
        int width;
        int height;

        public Figure(int width, int height) {
            this.width = width;
            this.height = height;
        }
        
        void draw(String mes){
            pane.getChildren().remove(group);
            Text text = new Text(mes);
            text.setY(gy);
            group.getChildren().add(text);
            
            Circle circle = new Circle(width/2.0 , Color.RED);
            circle.setScaleY((height * 1.0) / (width * 1.0));
            circle.setCenterX(100);
            circle.setCenterY(height/2.0+10+gy);
            group.getChildren().add(circle);
            
            Rectangle rec = new Rectangle(width * 3.0 /4.0 ,height * 3.0 / 4.0 ,Color.BLUE);
            rec.setX(100);
            rec.setY(10+gy);
            group.getChildren().add(rec);

            pane.getChildren().add(group);
            gy += height * 3;
        }
    }
    class Rect extends Figure{

        public Rect(int width, int height) {
            super(width, height);
        }
        
        @Override
        void draw(String mes){
            pane.getChildren().remove(group);
            Text text = new Text(mes);
            text.setY(gy);
            group.getChildren().add(text);
            
            Rectangle box = new Rectangle(width,height ,Color.GREY);
            box.setX(100);
            box.setY(10+gy);
            group.getChildren().add(box);

            pane.getChildren().add(group);
            gy += height * 3;
        }
    }
    
}
