package intro_to_array_lists;

import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {

	int speed = 10;
	
	Projectile(int x1, int y1, int width1, int height1) {
		super(x1, y1, width1, height1);
		x1=x;
		y=y1;
		width=width1;
		height=height1;
		
	}

	
	public void update() {
		y= y-speed;
		if(y<=0) {
			isAlive=false;
		}
	}
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);
		
	}
	
	
	
	
	
}
