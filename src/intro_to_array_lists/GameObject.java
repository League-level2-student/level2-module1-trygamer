package intro_to_array_lists;

import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject  {
	int x;

    int y;

    int width;

    int height;
    
    Rectangle collisionBox;
    
    
    
    boolean isAlive=true;
   
    
    GameObject( int x1, int y1,int  width1,int  height1  ){
    x=x1;
    y=y1;
    width= width1;
    height=height1;
    collisionBox=new Rectangle(x, y,height,width);
    }
   
    
    
    public void update() {

    	  collisionBox.setBounds(x, y, width, height);


    	
    	
    }
    public void draw(Graphics g) {
		
    	
    }
}
