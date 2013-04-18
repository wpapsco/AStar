package com.papsco.AStarTest;

import java.util.ArrayList;

import org.newdawn.slick.geom.Vector2f;

import com.papsco.GenericAStarSearch.Node;
import com.papsco.OGPC2013.Functions;

public class AStarTestNode extends Node {

	Vector2f currentPoint;
	Vector2f goalPoint;
	
	public AStarTestNode(Vector2f point, Vector2f goalPoint) {
		currentPoint = point;
		this.goalPoint = goalPoint;
	}
	
	@Override
	public void onExpand() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateChildren() {
		// TODO Auto-generated method stub
		ArrayList<Node> nodes = new ArrayList<Node>();
		ArrayList<Integer> costs = new ArrayList<Integer>();
		int factor = 2;
		for (int i = 0; i < 8; i++) {
			costs.add(0);
		}
		nodes.add(new AStarTestNode(new Vector2f(currentPoint.x + factor, currentPoint.y), goalPoint));
		nodes.add(new AStarTestNode(new Vector2f(currentPoint.x - factor, currentPoint.y), goalPoint));
		nodes.add(new AStarTestNode(new Vector2f(currentPoint.x, currentPoint.y + factor), goalPoint));
		nodes.add(new AStarTestNode(new Vector2f(currentPoint.x, currentPoint.y - factor), goalPoint));
		
		nodes.add(new AStarTestNode(new Vector2f(currentPoint.x - factor, currentPoint.y - factor), goalPoint));
		nodes.add(new AStarTestNode(new Vector2f(currentPoint.x + factor, currentPoint.y + factor), goalPoint));
		nodes.add(new AStarTestNode(new Vector2f(currentPoint.x + factor, currentPoint.y - factor), goalPoint));
		nodes.add(new AStarTestNode(new Vector2f(currentPoint.x - factor, currentPoint.y + factor), goalPoint));
		this.setChildren(nodes);
		this.setChildNodeCosts(costs);
		this.setHeuristic(Functions.distance(currentPoint, goalPoint));
	}

	@Override
	public boolean isGoalNode() {
		// TODO Auto-generated method stub
		boolean isGoal = false;
		if (Functions.distance(currentPoint, goalPoint) <= 10) {isGoal = true;}
		return isGoal;
	}
	
}
