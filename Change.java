import java.util.ArrayList;
public class Change {
	public static void main(String[] args) {
		System.out.println(NumberOfWaysToMakeChange(17));
	}

	public static int NumberOfWaysToMakeChange(int cents) {
		ArrayList<Integer> table = new ArrayList<Integer>(cents +1);
		table.set(0, 1);
		int[] coins = {1, 5, 10, 25};
		for (int i = 0; i < 4; i++) {
			int coin = coins[i];
			for (int j = coin; j <= cents; ++j) {
				int update = table.get(j - coin);
				table.set(j, update);
			}
		}
		return table.get(cents);
	}
}