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
public class themain extends Application {
    public void start(Stage self)
    {


        
       

  
    generatedvar vari = new generatedvar();
    generatedvar vari2 = new generatedvar();
    generatedvar vari3 = new generatedvar();
    generatedvar vari4 = new generatedvar();
    vari4.nextercounter = 0;
    generatedvar cities = new generatedvar();
    int dim1 = 100;
    Button bu = new Button("New map");


    Button foundcity = new Button("Found a city!");
    Button left = new Button("Move Left");
    Button right = new Button("Move Right");
    Button up = new Button("Move Up");
    Button down = new Button("Move Down");

    Button found_another_city = new Button("Found another city");
    
  Button coat = new Button("Explore");
  gamer dude = new gamer();  /////////////////////////////////// game var
  qual[][] map1;
  map1 = new qual[dim1 + 1][dim1 + 1];

   do{
  
  for(int i = 0; i < (dim1); i++){
    for(int j = 0; j < (dim1); j++){
        map1[j][i] = new qual();
      (map1[j][i]).type1 = 2;
    }
}




     prim1(map1, dim1, vari);

    for(int countin = 0; countin < 1000; countin++){
     sec1(map1, dim1, vari);
    }

    for(int countin = 0; countin < 500; countin++){
     tertiary(dim1, map1, vari3);
    }

    for(int countin = 0; countin < 300; countin++){
     sec1(map1, dim1, vari);
    }


    for(int l = 0; l < (dim1); l++){
        for(int m = 0; m < (dim1); m++){
            System.out.print(map1[m][l].type1);
        
        }
          
        System.out.println();
    }

    }while(checker(dim1, map1));

    Scene scene = tileplacer(map1, dim1, bu, coat);
    EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e)
           {
            

            for(int i = 0; i < (dim1); i++){
                for(int j = 0; j < (dim1); j++){
                    map1[j][i] = new qual();
                  (map1[j][i]).type1 = 2;
                }
            }


            do{           
              
                   prim1(map1, dim1, vari);
              
                  for(int countin = 0; countin < 1000; countin++){
                   sec1(map1, dim1, vari);
                  }
              
                  for(int countin = 0; countin < 500; countin++){
                   tertiary(dim1, map1, vari3);
                  }
              
                  for(int countin = 0; countin < 300; countin++){
                   sec1(map1, dim1, vari);
                  }
              
              
                  for(int l = 0; l < (dim1); l++){
                      for(int m = 0; m < (dim1); m++){
                          System.out.print(map1[m][l].type1);
                      
                      }
                        
                      System.out.println();
                  }
              
                  }while(checker(dim1, map1));

                  Scene scenery = tileplacer(map1, dim1, bu, coat);
            self.setTitle("mapper");
            self.setScene(scenery);
            self.show();
           }
   };
    bu.setOnAction(event);
  
/////////// /////////// /////////// /////////// game var in







dude.map2setter(map1, dim1, self);
EventHandler<ActionEvent> doomwalker = new EventHandler<ActionEvent>() {
    public void handle(ActionEvent e)
       {
        quaternary_land(map1, dim1, vari4);
        map1[vari4.point1x][vari4.point1y].changestuff(4);
        Scene scenery2 = dude.tyler(map1, dim1, vari4, foundcity, left, right, up, down);
        dude.orderloop(scenery2, self, foundcity, left, right, up, down, vari4, map1, dim1, found_another_city, cities);
        
        
       }
    };
    coat.setOnAction(doomwalker);

   




/////////// /////////// /////////// /////////// /////////// game var out



  self.setTitle("mapper");
  self.setScene(scene);
  self.show();




}




 static void prim1(qual[][] map1, int dim1, generatedvar vari){
    
    Random rand = new Random();
int randx = rand.nextInt((dim1 / 2));
vari.point1x = randx;
vari.point1x = vari.point1x + (dim1 / 4);

int randy = rand.nextInt((dim1 / 2));
vari.point1y = randy;
vari.point1y = vari.point1y + (dim1 / 4);

int lengthy = rand.nextInt((dim1 / 3));
vari.length = lengthy;

int height1 = rand.nextInt(5);
int height2 = rand.nextInt(5);
int height3;



//primary points


(map1[vari.point1x][vari.point1y]).type1 = 0;
  for(int h = 0; h < vari.length; h++){

    if(((vari.point1x + h) >= dim1) || ((vari.point1x + h) <= 0)){
        break;
      }
        map1[vari.point1x + h][vari.point1y].type1 = 0;
        
      
    }

        for(int y = 0; y <= ((vari.length)); y++){
        for(int q = 0; q <= (height1 + (rand.nextInt(3))); q++){

            if(((vari.point1x + y) >= dim1 ) || ((vari.point1y + q) >= dim1) || ((vari.point1x + y) <= 0) || ((vari.point1y + q) <= 0)){
                break;
            }
        map1[vari.point1x + y - 1][vari.point1y + q - 1].type1 = 0;
        
      }

          for(int c = 0; c <= (height1 + (rand.nextInt(3))); c++){

            if(((vari.point1x + y) >= dim1 ) || ((vari.point1y - c) <= 0)){
                break;
            }

        map1[vari.point1x + y - 1][vari.point1y - c].type1 = 0;
        
      }
          }
}








static void sec1(qual[][] map1, int dim1, generatedvar vari2){
    
    
    Random rand = new Random();
    int randx = rand.nextInt((dim1 / 2));
    vari2.point1x = randx;


    int randy = rand.nextInt((dim1 / 2));
    vari2.point1y = randy;



int lengthy = rand.nextInt((dim1 / 3));
vari2.length = lengthy;

int height1 = rand.nextInt(5);
int height2 = rand.nextInt(5);

if(map1[vari2.point1x][vari2.point1y].type1 == 0){

for(int h = 0; h < vari2.length; h++){

      if(((vari2.point1x + h) >= dim1) || ((vari2.point1x + h) <= 0)){
        break;
      }

      System.out.println(vari2.point1x + h);

      map1[(vari2.point1x + h - 1)][vari2.point1y].type1 = 0;
      
    
  }

      for(int y = 0; y <= ((vari2.length)); y++){
      for(int q = 0; q <= (height1 + (rand.nextInt(3))); q++){

        if(((vari2.point1x + y) >= dim1 ) || ((vari2.point1y + q) >= dim1) || ((vari2.point1x + y) <= 0) || ((vari2.point1y + q) <= 0)){
            break;
        }

        System.out.println(vari2.point1x + y);
        System.out.println(vari2.point1y + q);

      map1[(vari2.point1x + y - 1)][(vari2.point1y + q - 1)].type1 = 0;
      
    }

        for(int c = 0; c <= (height1 + (rand.nextInt(3))); c++){

            if(((vari2.point1x + y) >= dim1 ) || ((vari2.point1y - c) <= 0)){
                break;
            }
            System.out.println(vari2.point1x + y);
            System.out.println(vari2.point1y - c);

      map1[(vari2.point1x + y - 1)][(vari2.point1y - c)].type1 = 0;
      
    }
        }



}


}








    static boolean checker(int dim1, qual[][] map1){
        int counting = 0;
        for(int i = 0; i < (dim1); i++){
            for(int j = 0; j < (dim1); j++){
                
              if((map1[j][i]).type1 == 0){
                counting = counting + 1;
              }
            }
        }

        System.out.println("counting");
            System.out.println(counting);
            System.out.println("counting");

        if(counting < 700){
            return true;
            
        }
        else{
            return false;
        }
        
    }










    
    static void tertiary(int dim1, qual[][] map1, generatedvar vari3){

        Random rand = new Random();
        int randx = rand.nextInt((dim1 / 2));
        vari3.point1x = randx;
    
    
        int updownleftright = rand.nextInt((12));

        int randy = rand.nextInt((dim1 / 2));
        vari3.point1y = randy;
    
        int lengthy = rand.nextInt((dim1 / 3));
        vari3.length = lengthy;
    
    if(map1[vari3.point1x][vari3.point1y].type1 == 0){

        if(updownleftright < 3){
            while(map1[vari3.point1x][vari3.point1y].type1 == 0){
                vari3.point1y = vari3.point1y + 1;
            }
            allmightydeletion(map1, vari3, dim1);
        }

        else if(updownleftright < 6){
            while(map1[vari3.point1x][vari3.point1y].type1 == 0){
                vari3.point1y = vari3.point1y - 1;
            }
            allmightydeletion(map1, vari3, dim1);
        }
        else if(updownleftright < 9){
            while(map1[vari3.point1x][vari3.point1y].type1 == 0){
                vari3.point1x = vari3.point1x - 1;
            }
            allmightydeletion(map1, vari3, dim1);
        }
        else if(updownleftright < 12){
            while(map1[vari3.point1x][vari3.point1y].type1 == 0){
                vari3.point1x = vari3.point1x + 1;
            }
            allmightydeletion(map1, vari3, dim1);
        }


    }

    }



    static void allmightydeletion(qual[][] map1, generatedvar vari3, int dim1){


        Random rand = new Random();
        int height1 = rand.nextInt(5);
int height2 = rand.nextInt(5);



for(int h = 0; h < vari3.length; h++){

      if(((vari3.point1x + h) >= dim1) || ((vari3.point1x + h) <= 0)){
        break;
      }

      System.out.println(vari3.point1x + h);

      map1[(vari3.point1x + h - 1)][vari3.point1y].type1 = 3;
      
    
  }

      for(int y = 0; y <= ((vari3.length)); y++){
      for(int q = 0; q <= (height1 + (rand.nextInt(3))); q++){

        if(((vari3.point1x + y) >= dim1 ) || ((vari3.point1y + q) >= dim1) || ((vari3.point1x + y) <= 0) || ((vari3.point1y + q) <= 0)){
            break;
        }

        System.out.println(vari3.point1x + y);
        System.out.println(vari3.point1y + q);

      map1[(vari3.point1x + y - 1)][(vari3.point1y + q - 1)].type1 = 3;
      
    }

        for(int c = 0; c <= (height1 + (rand.nextInt(3))); c++){

            if(((vari3.point1x + y) >= dim1 ) || ((vari3.point1y - c) <= 0)){
                break;
            }
            System.out.println(vari3.point1x + y);
            System.out.println(vari3.point1y - c);

      map1[(vari3.point1x + y - 1)][(vari3.point1y - c)].type1 = 3;
      
    }
        }





}





    static Scene tileplacer(qual[][] map1, int dim1, Button bu, Button coat){

        Rectangle recker;
        Group root = new Group();
        Group branch = new Group();
        for(int i = 0; i < (dim1); i++){
            for(int j = 0; j < (dim1); j++){
                
                recker = (map1[j][i]).tiler(j, i);
                branch.getChildren().add(recker);
            }
        }
                bu.setLayoutX(1100); 
                bu.setLayoutY(500);
                coat.setLayoutX(1100); 
                coat.setLayoutY(700);
        root.getChildren().add(coat);
        root.getChildren().add(bu);
        root.getChildren().add(branch);
        Scene scene = new Scene(root, 1200, 1000);

        return scene;
    }

    static void quaternary_land(qual[][] map1, int dim1, generatedvar vari4){
         int whichone = 2;

        while(whichone != 0){
        Random rand = new Random();
        int randx = rand.nextInt((dim1 / 2));
        vari4.point1x = randx;
        int randy = rand.nextInt((dim1 / 2));
        vari4.point1y = randy;

        whichone = map1[randx][randy].type1;
        }
    }




    




public static void main(String args[])
    {
        
        launch(args);

        
        


    }

}
