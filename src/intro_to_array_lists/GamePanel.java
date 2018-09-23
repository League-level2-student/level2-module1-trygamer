package intro_to_array_lists;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer t;
	final int MENU_STATE = 0;

	final int GAME_STATE = 1;

	final int END_STATE = 2;
	
	Font  titleFont;
	Font  startFont;
Font infoFont;

Rocketship rs = new Rocketship(250, 700, 50, 50,5);
ObjectManager om = new ObjectManager(rs);


int currentState = MENU_STATE;
int ek;
	GamePanel() {
		t = new Timer(1000 / 60, this);
		titleFont = new Font("Arial",Font.PLAIN, 48 );
		startFont = new Font("Arial",Font.PLAIN, 30);

    }
	
	
	
	
	void updateMenuState() {
		
	}
	
	
	void updateGameState() {
		om.update();
	}
	void updateEndState() {
		
	}
	
	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);

		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height); 
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
	     g.drawString("LEAGUE INVADERS", 15, 100);
	     g.setFont(startFont);
	     g.setColor(Color.YELLOW);
	     g.drawString("Press ENTER to start", 100, 400);
	     g.setFont(startFont);
			g.setColor(Color.YELLOW);
		     g.drawString("Press space for intructions", 70, 700);


	}
	
	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);

		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height); 
		om.draw(g);
	}
	
	void drawEndState(Graphics g) {
		g.setColor(Color.RED);

		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height); 
		g.setFont(titleFont);
		g.setColor(Color.BLACK);
	     g.drawString("Game Over", 100, 100);
	     g.setFont(startFont);
	     g.setColor(Color.BLACK);
	     g.drawString("You killed "+ ek+" enemies", 100, 400);
	     g.setColor(Color.BLACK);
	     g.drawString("Press ENTER to restart", 100, 700);
	     
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(currentState == MENU_STATE){

            updateMenuState();

    }else if(currentState == GAME_STATE){

            updateGameState();

    }else if(currentState == END_STATE){

            updateEndState();

    }
		repaint();

	}

	public void startGame() {
		t.start();
	}

	@Override

	public void paintComponent(Graphics g) {
		if(currentState == MENU_STATE){

            drawMenuState(g);

    }else if(currentState == GAME_STATE){

            drawGameState(g);

    }else if(currentState == END_STATE){

            drawEndState(g);

    }
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("up");
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(currentState == END_STATE){

            currentState = MENU_STATE;
		}
		else if(e.getKeyChar()==KeyEvent.VK_ENTER) {
			currentState+=1;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			System.out.println("t");
			rs.x+=rs.speed;
		}
		else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			
			rs.x-=rs.speed;
		}
		  
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	
		if(e.getKeyChar()==KeyEvent.VK_RIGHT) {
			rs.x+=0;
		}
		else if(e.getKeyChar()==KeyEvent.VK_LEFT) {
			rs.x-=0;
		}
		  
	}

}
