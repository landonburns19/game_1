import java.util.Scanner;
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import java.io.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.net.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.*;
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.shape.LineTo; 
import javafx.scene.shape.MoveTo; 
import javafx.scene.shape.Path;
import java.util.Random;
import javafx.scene.paint.Color;

public class qual {
    

       int type1;
       static int type2;
    
        void entrar(){
        type2 = type1;
        }
        
         Rectangle tiler(int x, int y){
        if(type1 == 0){
                Rectangle rectangle = new Rectangle();
                rectangle.setX(0f + (x * 10)); 
                rectangle.setY(0f + (y * 10)); 
                rectangle.setWidth(10f); 
                rectangle.setHeight(10f); 
                rectangle.setFill(Color.rgb(0, 90, 0));
        return rectangle;
        }

        else if(type1 == 4){
                Rectangle rectangle = new Rectangle();
                rectangle.setX(0f + (x * 10)); 
                rectangle.setY(0f + (y * 10)); 
                rectangle.setWidth(10f); 
                rectangle.setHeight(10f); 
                rectangle.setFill(Color.rgb(200, 200, 200));
        return rectangle;
        }

        else if(type1 == 5){
                Rectangle rectangle = new Rectangle();
                rectangle.setX(0f + (x * 10)); 
                rectangle.setY(0f + (y * 10)); 
                rectangle.setWidth(10f); 
                rectangle.setHeight(10f); 
                rectangle.setFill(Color.rgb(0, 200, 0));
        return rectangle;
        }

        else if(type1 == 6){
                Rectangle rectangle = new Rectangle();
                rectangle.setX(0f + (x * 10)); 
                rectangle.setY(0f + (y * 10)); 
                rectangle.setWidth(10f); 
                rectangle.setHeight(10f); 
                rectangle.setFill(Color.rgb(200, 0, 0));
        return rectangle;
        }

        else if(type1 == 7){
                Rectangle rectangle = new Rectangle();
                rectangle.setX(0f + (x * 10)); 
                rectangle.setY(0f + (y * 10)); 
                rectangle.setWidth(10f); 
                rectangle.setHeight(10f); 
                rectangle.setFill(Color.rgb(0, 0, 200));
        return rectangle;
        }

        else {
                Rectangle rectangle = new Rectangle();
                rectangle.setX(0f + (x * 10)); 
                rectangle.setY(0f + (y * 10)); 
                rectangle.setWidth(10f); 
                rectangle.setHeight(10f); 
                rectangle.setFill(Color.rgb(100, 100, 200));
        return rectangle;
        }

        
        }

        public void changestuff(int tipping){
                type1 = tipping;
        }
    
       


public Rectangle cultural_hearth(int cultural_hearth_score){
        Rectangle rectangle = new Rectangle();
        if(type1 == 5){
                
                rectangle.setX(0f + (1000)); 
                rectangle.setY(0f + (900)); 
                rectangle.setWidth(0f + (cultural_hearth_score)); 
                rectangle.setHeight(50f); 
                rectangle.setFill(Color.rgb(0, 200, 0));
                System.out.println("curledtrident");
                return rectangle;
        }
        else if(type1 == 6){
                rectangle.setX(0f + (1000)); 
                rectangle.setY(0f + (850)); 
                rectangle.setWidth(0f + (cultural_hearth_score)); 
                rectangle.setHeight(50f); 
                rectangle.setFill(Color.rgb(200, 0, 0));
                System.out.println("blessedwing");
                return rectangle;
        }
        else {
                rectangle.setX(0f + (1000)); 
                rectangle.setY(0f + (800)); 
                rectangle.setWidth(0f + (cultural_hearth_score)); 
                rectangle.setHeight(50f); 
                rectangle.setFill(Color.rgb(0, 0, 200));
                System.out.println("hornhammer");

                return rectangle;
        }

}
}