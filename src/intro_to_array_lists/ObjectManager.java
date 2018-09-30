package intro_to_array_lists;

import java.awt.Graphics;
import java.util.ArrayList;


public class ObjectManager {

	Rocketship rs;

	ArrayList<Projectile> pj = new ArrayList<Projectile>();
	
	
	
	
	
	public void addProjectile(Projectile pj1) {

		pj.add(pj1);
	}

	ObjectManager(Rocketship rs2){
		
		rs=rs2;
		
	}

public void update() {
	rs.update();
	
	for(int i = 0; i < pj.size(); i++){
		pj.get(i).update();
	
		
	}
	
}
	public void draw(Graphics g) {
		rs.draw(g);
		for(int i = 0; i < pj.size(); i++){
			pj.get(i).draw(g);
	}

}}
