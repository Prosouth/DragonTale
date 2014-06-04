package GameState;

import java.awt.Graphics2D;

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
	
	public void keyPressed(int k) {}
	
	public void keyReleased(int k) {}
}
