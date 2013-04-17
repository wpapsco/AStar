import java.util.ArrayList;

public abstract class State {
	private ArrayList<Node> path;
	public int computeCost() {
		int val = 0;
		for (int i = 0; i < path.size(); i++) {
			for (int j = 0; j < path.get(i).getChildNodeCosts().size(); j++) {
				val = val + path.get(i).getChildNodeCosts().get(j);
			}
		}
		val = val + path.get(path.size() - 1).getHeuristic();
		return val;
	}
}
