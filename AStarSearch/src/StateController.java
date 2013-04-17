import java.util.ArrayList;

public class StateController {
	private boolean goalExpanded;
	public ArrayList<State> fringe;
	public StateController(State startState) {
		fringe = new ArrayList<State>();
		goalExpanded = false;
		fringe.add(startState);
		while (!this.goalExpanded) {
			State lowestState = null;
			for (int i = 0; i < fringe.size(); i++) {
				if (i == 0) {
					lowestState = fringe.get(0);
				} else {
					if (fringe.get(i).computeCost() < lowestState.computeCost()) {
						lowestState = fringe.get(i);
					}
				}
			}
			fringe.remove(lowestState);
		}
	}
}
