package intro_to_array_lists;

import java.awt.Graphics;

public class GameObject {
	int x;

    int y;

    int width;

    int height;
   
    
    GameObject( int x1, int y1,int  width1,int  height1  ){
    x=x1;
    y=y1;
    width= width1;
    height=height1;
   
    }
    
    public void update() {
    	x+=1;
    	y+=1;
    	
    	
    	
    }
    public void draw(Graphics g) {
		g.fillRect(x, y, width, height);
    	
    }
}
