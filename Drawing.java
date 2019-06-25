/*  Program:			Eclipse
    Author:			Mai Pham	
    Class:			CSCI 145
    Date:			09/21/2017
    Description:		Project 1 - Part B: Simple Drawing
    I certify that the code below is my own work.
	Exception(s): N/A
*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.*;

public class Drawing extends Application
{
    public void start(Stage primaryStage)
    {
    		Random rand = new Random();
    		int x, y, radius, width, height;
    	
    		Group g = new Group();
    	
    		for (int i = 0; i < 3; i++)
    		{
    			x = rand.nextInt(401);
    			y = rand.nextInt(301);
    			radius = rand.nextInt(81)+20;
    		
    			while (x + radius > 400 || y + radius > 300 || x - radius < 0 || y - radius < 0)
    			{
    				x = rand.nextInt(401);
    				y = rand.nextInt(301);
    				radius = rand.nextInt(81)+20;
    			}
    			Circle c = new Circle(x, y, radius);
    			c.setFill(null);
    			c.setStroke(Color.TEAL);
    			g.getChildren().add(c);
    		}
   
    		for (int i = 0; i < 3; i++)
    		{
    			x = rand.nextInt(401);
    			y = rand.nextInt(301);
    			width = rand.nextInt(101)+50;
    			height = rand.nextInt(61)+30;
    			
    			while (x + width > 400 || y + height > 300)
    			{
    				x = rand.nextInt(401);
    				y = rand.nextInt(301);
    				width = rand.nextInt(101)+50;
    				height = rand.nextInt(61)+30;
    			}
    			Rectangle rect = new Rectangle(x, y, width, height);
    			rect.setFill(null);
    			rect.setStroke(Color.PURPLE);
    			g.getChildren().add(rect);
    		}
        
    		Text quote = new Text(250, 275, "Author: Mai Pham");
    	    g.getChildren().add(quote);
    	    
    		//EXTRA CREDIT
    		Circle c1 = new Circle(145, 50, 25);
    		c1.setFill(null);
    		c1.setStroke(Color.BLUE);
    		c1.setStrokeWidth(3);
    		Circle c2 = new Circle(200, 50, 25);
    		c2.setFill(null);
    		c2.setStroke(Color.BLACK);
    		c2.setStrokeWidth(3);
    		Circle c3 = new Circle(255, 50, 25);
    		c3.setFill(null);
    		c3.setStroke(Color.RED);
    		c3.setStrokeWidth(3);
    		Circle c4 = new Circle(172.5, 75, 25);
    		c4.setFill(null);
    		c4.setStroke(Color.YELLOW);
    		c4.setStrokeWidth(3);
    		Circle c5 = new Circle(227.5, 75, 25);
    		c5.setFill(null);
    		c5.setStroke(Color.GREEN);
    		c5.setStrokeWidth(3);
    		
    		Group root = new Group(g, c1,c2,c3,c4,c5);
        Scene scene = new Scene(root, 400, 300);
        
        primaryStage.setTitle("Project 1: Part B");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
