package com.papsco.AStarTest;

import java.awt.Color;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import com.papsco.GenericAStarSearch.State;
import com.papsco.GenericAStarSearch.StateController;

public class MainClass extends BasicGame {
	private State executeState;
	private Vector2f cPos;
	public MainClass() {
		super("astar");
	}
	public void init(GameContainer arg0)
			throws SlickException {
		// TODO Auto-generated method stub
		Vector2f start = new Vector2f(0, 0);
		cPos = new Vector2f(start.x, start.y);
		Vector2f end = new Vector2f(100, 200);
		executeState = StateController.search(new AStarTestNode(start, end));
		System.out.println("completed");
	}

	@Override
	public void render(GameContainer arg0, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
		for (int i =  0; i < executeState.getPath().size(); i++) {
			g.draw(new Rectangle(((AStarTestNode) executeState.getPath().get(i)).currentPoint.x, ((AStarTestNode) executeState.getPath().get(i)).currentPoint.y, 2, 2));
		}
		g.draw(new Circle(345, 634, 10));
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) throws SlickException {
		 AppGameContainer app = new AppGameContainer(new MainClass());
         app.setDisplayMode(800, 600, false);
         app.start();
	}
}
