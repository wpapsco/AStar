import java.util.ArrayList;

public abstract class Node {
	private ArrayList<Integer> childNodeCosts;
	private ArrayList<Node> childNodes;
	private ArrayList<Node> parentNodes;
	private int heuristic;
	public int getCost(int child) {
		return childNodeCosts.get(child);
	}
	public ArrayList<Integer> getChildNodeCosts() {
		return childNodeCosts;
	}
}
