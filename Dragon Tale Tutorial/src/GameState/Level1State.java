package GameState;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import Entity.Player;
import TileMap.Background;
import TileMap.TileMap;

public class Level1State extends GameState
{
	private TileMap tileMap;
	private Background bg;
	
	private Player player;
	
	public Level1State(GameStateManager gsm)
	{
		this.gsm = gsm;
		init();
	}
	
	public void init() 
	{
		tileMap = new TileMap(30);
		tileMap.loadTiles("/Tilesets/grasstileset.gif");
		tileMap.loadMap("/Maps/level1-1.map");
		tileMap.setPosition(0, 0);
		
		bg = new Background("/Backgrounds/grassbg1.gif", 0.1);
		
		player = new Player(tileMap);
		player.setPosition(100, 100);
	}
	
	public void update() 
	{
		// update player
		player.update();
	}
	
	public void draw(Graphics2D g) 
	{
		// draw background
		bg.draw(g); 
		
		// draw tilemap
		tileMap.draw(g);	
		
		// draw player
		player.draw(g);
	}
	
	public void keyPressed(int k) 
	{
		if(k == KeyEvent.VK_LEFT)
		{
			player.setLeft(true);
		}
		if(k == KeyEvent.VK_RIGHT)
		{
			player.setRight(true);
		}
		if(k == KeyEvent.VK_UP)
		{
			player.setUp(true);
		}
		if(k == KeyEvent.VK_DOWN)
		{
			player.setDown(true);
		}
		if(k == KeyEvent.VK_W)
		{
			player.setJumping(true);
		}
		if(k == KeyEvent.VK_E)
		{
			player.setGliding(true);
		}
		if(k == KeyEvent.VK_R)
		{
			player.setScratching();
		}
		if(k == KeyEvent.VK_F)
		{
			player.setFiring();
		}
	}
	
	public void keyReleased(int k) 
	{
		if(k == KeyEvent.VK_LEFT)
		{
			player.setLeft(false);
		}
		if(k == KeyEvent.VK_RIGHT)
		{
			player.setRight(false);
		}
		if(k == KeyEvent.VK_UP)
		{
			player.setUp(false);
		}
		if(k == KeyEvent.VK_DOWN)
		{
			player.setDown(false);
		}
		if(k == KeyEvent.VK_W)
		{
			player.setJumping(false);
		}
		if(k == KeyEvent.VK_E)
		{
			player.setGliding(false);
		}		
	}
}
