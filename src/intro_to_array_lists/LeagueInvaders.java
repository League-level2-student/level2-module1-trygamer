package intro_to_array_lists;



import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class LeagueInvaders  {
	JFrame f ;
 static int height = 800;
 static int width = 500; 
 GamePanel gp;
	public static void main(String[] args) {
		LeagueInvaders li = new LeagueInvaders();

		
		li.setup();
	}
	
	LeagueInvaders( ){
		f = new JFrame();
		 gp = new GamePanel();
	}
	
	public void setup(){
		f.setVisible(true);
		f.setSize(width, height);
		f.add(gp);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane();
		f.setPreferredSize(new Dimension(width, height));
	gp.startGame();
	f.addKeyListener(gp);
		f.pack();
		
	}
}
