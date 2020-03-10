import java.util.ArrayList;
import java.util.Arrays;

public class IDie extends Die {

	private ArrayList<Integer> MockRolls;
	private int indexOfNextValue;

	public void MockDie() {
		int[] MockDie = { 1, 2, 3, 4, 5, 6 };
	}

	public void MockDie(int[] it) {

		MockRolls = new ArrayList<Integer>();
		for (int i : it)
			MockRolls.add(i);
		if (it.length == 0)
			MockRolls.add(1);
	}

	public void roll() {
		indexOfNextValue++;

		if (indexOfNextValue >= MockRolls.size()) {
			indexOfNextValue = 0;
		}

	}

	public int getLastRoll() {
		return MockRolls.get(indexOfNextValue);

	}
}
