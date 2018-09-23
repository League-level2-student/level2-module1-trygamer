package intro_to_array_lists;

import java.awt.Graphics;

public class ObjectManager {

Rocketship rs1;	
	
	ObjectManager(Rocketship rs2){
		
		rs2=rs1;
		rs1= new Rocketship(0,0,0,0,0);
	}

public void update() {
	rs1.update();
}
	public void draw(Graphics g) {
		rs1.draw(g);
	}

}
