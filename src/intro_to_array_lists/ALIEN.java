package intro_to_array_lists;

import java.awt.Color;
import java.awt.Graphics;

public class ALIEN extends GameObject{
int width= 50;

int height = 50;

	ALIEN(int x1, int y1, int width1, int height1) {
		super(x1, y1, width1, height1);
		// TODO Auto-generated constructor stub
		
		x=x1;
		y=y1;
		 width=width1;
		 height= height1;
		 
		
	}
	
	public void draw(Graphics g){
		g.drawImage(GamePanel.alienImg, x, y, width, height, null);
	}

	public void update(){
	    super.update();
		y+=1;
	}
	
}
