import java.util.ArrayList;

public abstract class State {
	private ArrayList<Node> path;
	public int computeCost() {
		for (int i = 0; i < path.size(); i++) {
			for (int j = 0; j < path.get(i).getChildNodeCosts().size(); j++) {
				
			}
		}
		return 0;
	}
}
