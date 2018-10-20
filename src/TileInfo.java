import java.util.ArrayList;
import java.util.List;

public class TileInfo<T1, C1, T2, C2> {
	
	private final String leftTile;
	private final String rightTile;
	private final int leftCrownVal;
	private final int rightCrownVal;
	
	public TileInfo(String leftTile, int leftCrownVal, String rightTile, int rightCrownVal) {
		this.leftTile = leftTile;
		this.leftCrownVal = leftCrownVal;
		this.rightTile = rightTile;
		this.rightCrownVal = rightCrownVal;
	}
	
	public String getLeftTile() {
		return leftTile;
	}
	
	public String getRightTile() {
		return rightTile;
	}
	
	public int getLeftCrownVal() {
		return leftCrownVal;
	}
	
	public int getRightCrownVal() {
		return rightCrownVal;
	}
	
	// Creates all the tiles for the game
	public static List<TileInfo<String, Integer, String, Integer>> createTiles() {
		
		List<TileInfo<String, Integer, String, Integer>> tileList = new ArrayList<TileInfo<String, Integer, String, Integer>>();
		
		tileList.add(new TileInfo<String, Integer, String, Integer>("NOT FOR USE", 0, "NOT FOR USE", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Plains", 0, "Plains", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Plains", 0, "Plains", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Forest", 0, "Forest", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Forest", 0, "Forest", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Forest", 0, "Forest", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Forest", 0, "Forest", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Ocean", 0, "Ocean", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Ocean", 0, "Ocean", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Ocean", 0, "Ocean", 0));		
		tileList.add(new TileInfo<String, Integer, String, Integer>("Field", 0, "Field", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Field", 0, "Field", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Swamp", 0, "Swamp", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Plains", 0, "Forest", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Plains", 0, "Ocean", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Plains", 0, "Field", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Plains", 0, "Swamp", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Forest", 0, "Ocean", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Forest", 0, "Field", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Plains", 1, "Forest", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Plains", 1, "Water", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Plains", 1, "Field", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Plains", 1, "Swamp", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Plains", 1, "Cave", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Forest", 1, "Plains", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Forest", 1, "Plains", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Forest", 1, "Plains", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Forest", 1, "Plains", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Forest", 1, "Water", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Forest", 1, "Field", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Water", 1, "Plains", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Forest", 1, "Plains", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Forest", 1, "Forest", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Forest", 1, "Forest", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Forest", 1, "Forest", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Forest", 1, "Forest", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Plains", 0, "Field", 1));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Water", 0, "Field", 1));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Plains", 0, "Swamp", 1));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Field", 0, "Swamp", 1));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Cave", 1, "Plains", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Plains", 0, "Field", 2));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Water", 0, "Field", 2));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Plains", 0, "Swamp", 2));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Field", 0, "Swamp", 2));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Cave", 2, "Plains", 0));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Swamp", 0, "Cave", 2));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Swamp", 0, "Cave", 2));
		tileList.add(new TileInfo<String, Integer, String, Integer>("Plains", 0, "Cave", 3));
		
		return tileList;
	}
	
}
