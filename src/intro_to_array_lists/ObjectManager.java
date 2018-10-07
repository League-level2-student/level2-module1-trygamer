package intro_to_array_lists;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;


public class ObjectManager {

	long enemyTimer=0;
	int enemySpawnTime=1000;
	
	
	Rocketship rs;

	ArrayList<Projectile> pj = new ArrayList<Projectile>();
	
	ArrayList<ALIEN> an = new ArrayList<ALIEN>();

	public void checkCollision() {
		for(ALIEN a : an){

		if(rs.collisionBox.intersects(a.collisionBox)){

	                rs.isAlive = false;}
		
		for(Projectile p : pj){
			if(a.collisionBox.intersects(p.collisionBox)){
				
				a.isAlive=false;
				
				p.isAlive=false;
			
		}}}
}
	        
	
	public void addAlien(ALIEN AN1) {
		an.add(AN1);
		
	}
	public void manageEnemies(){
        if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
                addAlien(new ALIEN(new Random().nextInt(LeagueInvaders.width), 0, 50, 50));

enemyTimer = System.currentTimeMillis();
        }
}	
	public void purgeObjects() {
	for(int i=0 ;i< an.size();i++)	{

		if(an.get(i).isAlive==false ) {
			an.remove(i);
		}
	}
		for(int i=0 ;i< pj.size();i++)	{

			if(pj.get(i).isAlive==false ) {
				pj.remove(i);
			}
		}
			

				if(rs.isAlive==false ) {
					GamePanel.currentState = GamePanel.END_STATE;
				}
			
	
	}
	
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
	for(int i = 0; i < an.size(); i++){
		an.get(i).update();
	
		
		
		
		
		
		
		
	}
	
}
	public void draw(Graphics g) {
		rs.draw(g);
	
		for(int i = 0; i < pj.size(); i++){
			pj.get(i).draw(g);
			
	}
		for(int i =0; i<an.size(); i++) {
			an.get(i).draw(g);
		}

}}
