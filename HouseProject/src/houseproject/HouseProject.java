package javafxdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFxDemo extends Application {

    public static void main(String[] args) {

        launch(args);

    }

    @Override

    public void start(Stage stage) throws Exception {
        //500.0, 100.0,  
        //100.0, 200.0,  
        //500.0, 200.0

        /*Roof*/
        Polygon tri = new Polygon();
        tri.getPoints().addAll(new Double[]{
            490.0, 40.0,
            180.0, 200.0,
            790.0, 200.0});
        tri.setFill(Color.WHITE);
        tri.setStroke(Color.BLACK);

        /*Structure holding the roof*/
        Rectangle upper = new Rectangle(230, 200, 530, 48);
        upper.setFill(Color.WHITE);
        upper.setStroke(Color.BLACK);

        /*The building*/
        Rectangle build = new Rectangle(230, 230, 530, 350);
        build.setFill(Color.CHOCOLATE);
        build.setStroke(Color.BLACK);

        /*Circles Overlaping Coulmn */
        Circle circle1 = new Circle(247, 245, 15);
        circle1.setFill(Color.WHITE);
        circle1.setStroke(Color.BLACK);

        Circle circle2 = new Circle(286, 245, 15);
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);

        Circle circle3 = new Circle(383, 245, 15);
        circle3.setFill(Color.WHITE);
        circle3.setStroke(Color.BLACK);

        Circle circle4 = new Circle(424, 245, 15);
        circle4.setFill(Color.WHITE);
        circle4.setStroke(Color.BLACK);

        Circle circle5 = new Circle(550, 245, 15);
        circle5.setFill(Color.WHITE);
        circle5.setStroke(Color.BLACK);

        Circle circle6 = new Circle(590, 245, 15);
        circle6.setFill(Color.WHITE);
        circle6.setStroke(Color.BLACK);

        Circle circle7 = new Circle(700, 245, 15);
        circle7.setFill(Color.WHITE);
        circle7.setStroke(Color.BLACK);

        Circle circle8 = new Circle(740, 245, 15);
        circle8.setFill(Color.WHITE);
        circle8.setStroke(Color.BLACK);

        /*Columns*/
        Rectangle Column1 = new Rectangle(245, 230, 40, 270);
        Column1.setFill(Color.WHITE);
        Column1.setStroke(Color.BLACK);

        Rectangle Column2 = new Rectangle(385, 230, 40, 270);
        Column2.setFill(Color.WHITE);
        Column2.setStroke(Color.BLACK);

        Rectangle Column3 = new Rectangle(550, 230, 40, 270);
        Column3.setFill(Color.WHITE);
        Column3.setStroke(Color.BLACK);

        Rectangle Column4 = new Rectangle(700, 230, 40, 270);
        Column4.setFill(Color.WHITE);
        Column4.setStroke(Color.BLACK);

        /*Plac*/
        Rectangle plac = new Rectangle(450, 240, 80, 50);
        plac.setFill(Color.GREY);
        plac.setStroke(Color.BLACK);

        /*Doors*/
        Rectangle door1 = new Rectangle(292, 360, 80, 140);
        door1.setFill(Color.WHITE);
        door1.setStroke(Color.BLACK);

        Rectangle door2 = new Rectangle(450, 337, 80, 165);
        door2.setFill(Color.WHITE);
        door2.setStroke(Color.BLACK);

        Rectangle door3 = new Rectangle(600, 360, 80, 140);
        door3.setFill(Color.WHITE);
        door3.setStroke(Color.BLACK);

        /*Door1 First Column Windows*/
        Rectangle win1 = new Rectangle(310, 375, 10, 15);
        win1.setFill(Color.BLACK);
        win1.setStroke(Color.BLACK);

        Rectangle win2 = new Rectangle(310, 395, 10, 15);
        win2.setFill(Color.BLACK);
        win2.setStroke(Color.BLACK);

        Rectangle win3 = new Rectangle(310, 420, 10, 15);
        win3.setFill(Color.BLACK);
        win3.setStroke(Color.BLACK);

        Rectangle win4 = new Rectangle(310, 440, 10, 15);
        win4.setFill(Color.BLACK);
        win4.setStroke(Color.BLACK);

        Rectangle win5 = new Rectangle(310, 460, 10, 15);
        win5.setFill(Color.BLACK);
        win5.setStroke(Color.BLACK);

        /*Second column of Door1*/
        Rectangle win6 = new Rectangle(340, 375, 10, 15);
        win6.setFill(Color.BLACK);
        win6.setStroke(Color.BLACK);

        Rectangle win7 = new Rectangle(340, 395, 10, 15);
        win7.setFill(Color.BLACK);
        win7.setStroke(Color.BLACK);

        Rectangle win8 = new Rectangle(340, 420, 10, 15);
        win8.setFill(Color.BLACK);
        win8.setStroke(Color.BLACK);

        Rectangle win9 = new Rectangle(340, 440, 10, 15);
        win9.setFill(Color.BLACK);
        win9.setStroke(Color.BLACK);

        Rectangle win10 = new Rectangle(340, 460, 10, 15);
        win10.setFill(Color.BLACK);
        win10.setStroke(Color.BLACK);

        /*Middle Door Window Column One*/
        Rectangle Mwin1  = new Rectangle(460, 365, 15, 17);
        Mwin1.setFill(Color.BLACK);
        Mwin1.setStroke(Color.BLACK);
        
         Rectangle Mwin2  = new Rectangle(460, 385, 15, 17);
        Mwin2.setFill(Color.BLACK);
        Mwin2.setStroke(Color.BLACK);
        
         Rectangle Mwin3  = new Rectangle(460, 405, 15, 17);
        Mwin3.setFill(Color.BLACK);
        Mwin3.setStroke(Color.BLACK);
        
         Rectangle Mwin4  = new Rectangle(460, 425, 15, 17);
        Mwin4.setFill(Color.BLACK);
        Mwin4.setStroke(Color.BLACK);
        
         Rectangle Mwin5  = new Rectangle(460, 445, 15, 17);
        Mwin5.setFill(Color.BLACK);
        Mwin5.setStroke(Color.BLACK);
        
        /*  Middle Door Window Column 2 */
        Rectangle Mwin6  = new Rectangle(499, 365, 15, 17);
        Mwin6.setFill(Color.BLACK);
        Mwin6.setStroke(Color.BLACK);
        
        Rectangle Mwin7  = new Rectangle(499, 385, 15, 17);
        Mwin7.setFill(Color.BLACK);
        Mwin7.setStroke(Color.BLACK);
        
        Rectangle Mwin8  = new Rectangle(499, 405, 15, 17);
        Mwin8.setFill(Color.BLACK);
        Mwin8.setStroke(Color.BLACK);
        
        Rectangle Mwin9  = new Rectangle(499, 425, 15, 17);
        Mwin9.setFill(Color.BLACK);
        Mwin9.setStroke(Color.BLACK);
        
        Rectangle Mwin10  = new Rectangle(499, 445, 15, 17);
        Mwin10.setFill(Color.BLACK);
        Mwin10.setStroke(Color.BLACK);
         
        /*Last Door Window Column 1*/
        Rectangle Lwin1  = new Rectangle(615, 380, 10, 15);
        Lwin1.setFill(Color.BLACK);
        Lwin1.setStroke(Color.BLACK);
        
         Rectangle Lwin2  = new Rectangle(615, 400, 10, 15);
        Lwin2.setFill(Color.BLACK);
        Lwin2.setStroke(Color.BLACK);
        
         Rectangle Lwin3  = new Rectangle(615, 420, 10, 15);
        Lwin3.setFill(Color.BLACK);
        Lwin3.setStroke(Color.BLACK);
        
         Rectangle Lwin4  = new Rectangle(615, 445, 10, 15);
        Lwin4.setFill(Color.BLACK);
        Lwin4.setStroke(Color.BLACK);
        
       Rectangle Lwin5  = new Rectangle(615, 465, 10, 15);
       Lwin5.setFill(Color.BLACK);
       Lwin5.setStroke(Color.BLACK);
       
       /*Last Door Window Column 2*/
         Rectangle Lwin6  = new Rectangle(650, 380, 10, 15);
        Lwin6.setFill(Color.BLACK);
        Lwin6.setStroke(Color.BLACK);
        
         Rectangle Lwin7  = new Rectangle(650, 400, 10, 15);
        Lwin7.setFill(Color.BLACK);
        Lwin7.setStroke(Color.BLACK);
        
         Rectangle Lwin8  = new Rectangle(650, 420, 10, 15);
        Lwin8.setFill(Color.BLACK);
        Lwin8.setStroke(Color.BLACK);
        
         Rectangle Lwin9  = new Rectangle(650, 445, 10, 15);
        Lwin9.setFill(Color.BLACK);
        Lwin9.setStroke(Color.BLACK);
        
       Rectangle Lwin10  = new Rectangle(650, 465, 10, 15);
       Lwin10.setFill(Color.BLACK);
       Lwin10.setStroke(Color.BLACK);
        
        /* Base of the Pillar */
            Rectangle base1  = new Rectangle(235, 485,55, 15);
            base1.setFill(Color.WHITE);
            base1.setStroke(Color.BLACK);
            
            Rectangle base2  = new Rectangle(380, 485,55, 15);
            base2.setFill(Color.WHITE);
            base2.setStroke(Color.BLACK);
            
            Rectangle base3  = new Rectangle(543, 485,55, 15);
            base3.setFill(Color.WHITE);
            base3.setStroke(Color.BLACK);
            
            Rectangle base4  = new Rectangle(693, 485,55, 15);
            base4.setFill(Color.WHITE);
            base4.setStroke(Color.BLACK);
       
         /*Column floor */
           Rectangle cf1  = new Rectangle(230, 500,60, 5);
            cf1.setFill(Color.GREY);
            cf1.setStroke(Color.BLACK);
            
             Rectangle cf2  = new Rectangle(700, 500,60, 5);
            cf2.setFill(Color.GREY);
            cf2.setStroke(Color.BLACK);
       
       
        /*Background*/
        Rectangle ground = new Rectangle(0, 300, 900, 900);//background
        ground.setFill(Color.LIGHTGREEN);//color background

        Group house = new Group(tri, upper, build, Column1, circle1, circle2, Column2, circle3,
                circle4, Column3, circle5, circle6, Column4, circle7, circle8, plac, door1, door2, door3,
                win1, win2, win3, win4, win5, win6, win7, win8, win9, win10,Mwin1,Mwin2,Mwin3,Mwin4,Mwin5,
                Mwin6,Mwin7,Mwin8,Mwin9,Mwin10,Lwin1,Lwin2,Lwin3,Lwin4,Lwin5,Lwin6,Lwin7,Lwin8,Lwin9,Lwin10,base1,
                base2,base3,cf1,cf2);

        Group root = new Group(ground, house);//background of house

        Scene sn = new Scene(root, 850, 720, Color.LIGHTBLUE); // the scene

        stage.setScene(sn);
        stage.show();

    }
}
