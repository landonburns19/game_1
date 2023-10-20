import java.util.Scanner;
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import java.io.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
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
public class gamer {

    qual[][] map2;

    public void map2setter(qual[][] map1, int dim1, Stage self){
        map2 = map1;
        System.out.println("success");
        
        
    }

    static Scene tyler(qual[][] map1, int dim1, generatedvar vari4, Button foundcity, Button left, Button right, Button up, Button down){

        

        Rectangle recker;
        Group root = new Group();
        Group branch = new Group();
        for(int i = 0; i < (dim1); i++){
            for(int j = 0; j < (dim1); j++){
                
                recker = (map1[j][i]).tiler(j, i);
                branch.getChildren().add(recker);
            }
        }

                foundcity.setLayoutX(1100); 
                foundcity.setLayoutY(100);
                left.setLayoutX(1100); 
                left.setLayoutY(150);
                right.setLayoutX(1100); 
                right.setLayoutY(200);
                up.setLayoutX(1100); 
                up.setLayoutY(250);
                down.setLayoutX(1100); 
                down.setLayoutY(300);
        root.getChildren().add(left);
        root.getChildren().add(right);
        root.getChildren().add(up);
        root.getChildren().add(down);
        root.getChildren().add(foundcity);
        root.getChildren().add(branch);
        Scene scene = new Scene(root, 1200, 1000);

        return scene;


}




static void orderloop(Scene scenery2, Stage self, Button foundcity, Button left, Button right, Button up, Button down, generatedvar vari4, qual[][] map1, int dim1, Button found_another_city, generatedvar cities){



EventHandler<ActionEvent> doomwalker = new EventHandler<ActionEvent>() {   ////////start here
    public void handle(ActionEvent e)
       {
        System.out.print("The die has been cast");
        if(vari4.nextercounter == 0){
        map1[vari4.point1x][vari4.point1y].changestuff(5);
    cities.point1x = vari4.point1x;
    cities.point1y = vari4.point1y;
  
            Scene ofbegan = tyler_began(map1, dim1, vari4, foundcity, left, right, up, down);
            vari4.nextercounter = vari4.nextercounter + 1;
        self.setTitle("pasta pasta");
        self.setScene(ofbegan);
        self.show();
        }
        else if(vari4.nextercounter == 1){
            map1[vari4.point1x][vari4.point1y].changestuff(6);
    cities.point2x = vari4.point1x;
    cities.point2y = vari4.point1y;
            Scene ofbegan = tyler_began(map1, dim1, vari4, foundcity, left, right, up, down);
            vari4.nextercounter = vari4.nextercounter + 1;
        self.setTitle("pasta pasta");
        self.setScene(ofbegan);
        self.show();
        }
        else {
            map1[vari4.point1x][vari4.point1y].changestuff(7);
    cities.point3x = vari4.point1x;
    cities.point3y = vari4.point1y;
            Scene ofbegan = tyler_began(map1, dim1, vari4, foundcity, left, right, up, down);
            vari4.nextercounter = vari4.nextercounter + 1;
        self.setTitle("pasta pasta");
        self.setScene(ofbegan);
        self.show();
            TextArea mash = new TextArea();
            mash.setPrefColumnCount(1);
            mash.setPrefHeight(25);
            mash.setPrefWidth(150);
            HBox boxy = new HBox();
            boxy.setSpacing(20);
            boxy.setPadding(new Insets(75, 50, 50, 1000));
            boxy.getChildren().addAll(mash);
            Group rooty_tooty = new Group(boxy);
            Button now_named_green = new Button("Name the red city");
            Scene scenery3 = tileplacer3(map1, dim1, rooty_tooty);
            self.setTitle("pasta pasta");
            self.setScene(scenery3);
            self.show();


            
            namingstuff(mash, self, cities, now_named_green);

            String city1_name = mash.getText();
            System.out.println(city1_name);
            
        }

    

        
       }
    };
    foundcity.setOnAction(doomwalker);

    EventHandler<ActionEvent> doomleft = new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e)
           {
            if((map1[vari4.point1x - 1][vari4.point1y].type1 != 2) && (map1[vari4.point1x - 1][vari4.point1y].type1 != 3)  && (map1[vari4.point1x - 1][vari4.point1y].type1 != 5) && (map1[vari4.point1x - 1][vari4.point1y].type1 != 6) && (map1[vari4.point1x - 1][vari4.point1y].type1 != 7)){
                int temp = map1[vari4.point1x][vari4.point1y].type1;
                if(temp == 4){
                    temp = 0;
                    }
            map1[vari4.point1x][vari4.point1y].changestuff(temp);
            vari4.point1x = vari4.point1x - 1;
            map1[vari4.point1x][vari4.point1y].changestuff(4);
            Scene sceneleft = tyler(map1, dim1, vari4, foundcity, left, right, up, down);
            self.setTitle("pasta pasta");
            self.setScene(sceneleft);
            self.show();
            }


            
           }
        };
        left.setOnAction(doomleft);

        EventHandler<ActionEvent> doomright = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
               {
                if((map1[vari4.point1x + 1][vari4.point1y].type1 != 2) && (map1[vari4.point1x + 1][vari4.point1y].type1 != 3) && (map1[vari4.point1x + 1][vari4.point1y].type1 != 5) && (map1[vari4.point1x + 1][vari4.point1y].type1 != 6) && (map1[vari4.point1x + 1][vari4.point1y].type1 != 7)){
                    
                    int temp = map1[vari4.point1x][vari4.point1y].type1;
                    if(temp == 4){
                        temp = 0;
                    }
                    map1[vari4.point1x][vari4.point1y].changestuff(temp);
                    vari4.point1x = vari4.point1x + 1;
                    map1[vari4.point1x][vari4.point1y].changestuff(4);
                    Scene sceneleft = tyler(map1, dim1, vari4, foundcity, left, right, up, down);
                    self.setTitle("pasta pasta");
                    self.setScene(sceneleft);
                    self.show();
                    }           
        
                
               }
            };
            right.setOnAction(doomright);

            EventHandler<ActionEvent> doomup = new EventHandler<ActionEvent>() {
                public void handle(ActionEvent e)
                   {
                    if((map1[vari4.point1x][vari4.point1y - 1].type1 != 2) && (map1[vari4.point1x][vari4.point1y - 1].type1 != 3) && (map1[vari4.point1x][vari4.point1y - 1].type1 != 5) && (map1[vari4.point1x][vari4.point1y - 1].type1 != 6) && (map1[vari4.point1x][vari4.point1y - 1].type1 != 7)){

                    int temp = map1[vari4.point1x][vari4.point1y].type1;
                    if(temp == 4){
                        temp = 0;
                    }
                        map1[vari4.point1x][vari4.point1y].changestuff(temp);
                        vari4.point1y = vari4.point1y - 1;
                        map1[vari4.point1x][vari4.point1y].changestuff(4);
                        Scene sceneleft = tyler(map1, dim1, vari4, foundcity, left, right, up, down);
                        self.setTitle("pasta pasta");
                        self.setScene(sceneleft);
                        self.show();
                        }
            
                    
                   }
                };
                up.setOnAction(doomup);

                EventHandler<ActionEvent> doomdown = new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent e)
                       {
                        if((map1[vari4.point1x][vari4.point1y + 1].type1 != 2) && (map1[vari4.point1x][vari4.point1y + 1].type1 != 3) && (map1[vari4.point1x][vari4.point1y + 1].type1 != 5) && (map1[vari4.point1x][vari4.point1y + 1].type1 != 6) && (map1[vari4.point1x][vari4.point1y + 1].type1 != 7)){

                        int temp = map1[vari4.point1x][vari4.point1y].type1;
                        if(temp == 4){
                        temp = 0;
                    }

                            map1[vari4.point1x][vari4.point1y].changestuff(temp);
                            vari4.point1y = vari4.point1y + 1;
                            map1[vari4.point1x][vari4.point1y].changestuff(4);
                            Scene sceneleft = tyler(map1, dim1, vari4, foundcity, left, right, up, down);
                            self.setTitle("pasta pasta");
                            self.setScene(sceneleft);
                            self.show();
                            }
                
                        
                       }
                    };
                    down.setOnAction(doomdown);



                    

                    
    self.setTitle("pasta pasta");
    self.setScene(scenery2);
    self.show();
}



static Scene tyler_began(qual[][] map1, int dim1, generatedvar vari4, Button foundcity, Button left, Button right, Button up, Button down){

    Rectangle recker;
        Group root = new Group();
        Group branch = new Group();
        for(int i = 0; i < (dim1); i++){
            for(int j = 0; j < (dim1); j++){
                
                recker = (map1[j][i]).tiler(j, i);
                branch.getChildren().add(recker);
            }
        }

                foundcity.setLayoutX(1100); 
                foundcity.setLayoutY(100);
                left.setLayoutX(1100); 
                left.setLayoutY(150);
                right.setLayoutX(1100); 
                right.setLayoutY(200);
                up.setLayoutX(1100); 
                up.setLayoutY(250);
                down.setLayoutX(1100); 
                down.setLayoutY(300);
        root.getChildren().add(left);
        root.getChildren().add(right);
        root.getChildren().add(up);
        root.getChildren().add(down);
        root.getChildren().add(foundcity);
        root.getChildren().add(branch);
        Scene scene = new Scene(root, 1200, 1000);

        return scene;

}


static Scene tileplacer2(qual[][] map1, int dim1, Group rooty_tooty, Button now_named_green){

        Rectangle recker;
        Group root = new Group();
        Group branch = new Group();
        for(int i = 0; i < (dim1); i++){
            for(int j = 0; j < (dim1); j++){
                
                recker = (map1[j][i]).tiler(j, i);
                branch.getChildren().add(recker);
            }
        }
        
        now_named_green.setLayoutX(1000); 
        now_named_green.setLayoutY(30);
        root.getChildren().add(branch);
        root.getChildren().add(rooty_tooty);
        root.getChildren().add(now_named_green);


        Scene scene = new Scene(root, 1200, 1000);

        return scene;
    }


    static void namingstuff(TextArea mash, Stage self, generatedvar cities, Button now_named_green){

        EventHandler<ActionEvent> reddy = new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e)
           {
             cities.city1 = mash.getText();
            System.out.println(cities.city1);
           }
        };
        now_named_green.setOnAction(reddy);

    }


    static Scene tileplacer3(qual[][] map1, int dim1, Group rooty_tooty){

        Rectangle recker;
        Group root = new Group();
        Group branch = new Group();
        for(int i = 0; i < (dim1); i++){
            for(int j = 0; j < (dim1); j++){
                
                recker = (map1[j][i]).tiler(j, i);
                branch.getChildren().add(recker);
            }
        }
        
        now_named_green.setLayoutX(1000); 
        now_named_green.setLayoutY(30);
        root.getChildren().add(branch);
        root.getChildren().add(rooty_tooty);
        root.getChildren().add(now_named_green);


        Scene scene = new Scene(root, 1200, 1000);

        return scene;
    }
    

}