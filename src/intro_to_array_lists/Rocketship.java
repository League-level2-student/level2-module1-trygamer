package intro_to_array_lists;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;
	Rocketship(int x1, int y1, int width1, int height1,int speed1) {
		super(x1, y1, width1, height1);
		
		speed=15;
		speed=speed1;
	} 
	
	public void update() {
		
	}

	public void draw(Graphics g) {
		   g.setColor(Color.BLUE);

	        g.fillRect(x, y, width, height);
		
	}
	
}
