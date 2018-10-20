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
	
	public static List<TileInfo<String, Integer, String, Integer>> createTiles() {
		
		List<TileInfo<String, Integer, String, Integer>> tileList = new ArrayList<TileInfo<String, Integer, String, Integer>>();
		
		// Wall of text because without it I keep getting "TileInfo is a raw type. References to generic type TileInfo<T1,C1,T2,C2> should be parameterized
		TileInfo<String, Integer, String, Integer> t0 = new TileInfo<String, Integer, String, Integer>("NOT FOR USE", 0, "NOT FOR USE", 0);
		TileInfo<String, Integer, String, Integer> t1 = new TileInfo<String, Integer, String, Integer>("Plains", 0, "Plains", 0);
		TileInfo<String, Integer, String, Integer> t2 = new TileInfo<String, Integer, String, Integer>("Plains", 0, "Plains", 0);
		TileInfo<String, Integer, String, Integer> t3 = new TileInfo<String, Integer, String, Integer>("Forest", 0, "Forest", 0);
		TileInfo<String, Integer, String, Integer> t4 = new TileInfo<String, Integer, String, Integer>("Forest", 0, "Forest", 0);
		TileInfo<String, Integer, String, Integer> t5 = new TileInfo<String, Integer, String, Integer>("Forest", 0, "Forest", 0);
		TileInfo<String, Integer, String, Integer> t6 = new TileInfo<String, Integer, String, Integer>("Forest", 0, "Forest", 0);
		TileInfo<String, Integer, String, Integer> t7 = new TileInfo<String, Integer, String, Integer>("Ocean", 0, "Ocean", 0);
		TileInfo<String, Integer, String, Integer> t8 = new TileInfo<String, Integer, String, Integer>("Ocean", 0, "Ocean", 0);
		TileInfo<String, Integer, String, Integer> t9 = new TileInfo<String, Integer, String, Integer>("Ocean", 0, "Ocean", 0);		
		TileInfo<String, Integer, String, Integer> t10 = new TileInfo<String, Integer, String, Integer>("Field", 0, "Field", 0);
		TileInfo<String, Integer, String, Integer> t11 = new TileInfo<String, Integer, String, Integer>("Field", 0, "Field", 0);
		TileInfo<String, Integer, String, Integer> t12 = new TileInfo<String, Integer, String, Integer>("Swamp", 0, "Swamp", 0);
		TileInfo<String, Integer, String, Integer> t13 = new TileInfo<String, Integer, String, Integer>("Plains", 0, "Forest", 0);
		TileInfo<String, Integer, String, Integer> t14 = new TileInfo<String, Integer, String, Integer>("Plains", 0, "Ocean", 0);
		TileInfo<String, Integer, String, Integer> t15 = new TileInfo<String, Integer, String, Integer>("Plains", 0, "Field", 0);
		TileInfo<String, Integer, String, Integer> t16 = new TileInfo<String, Integer, String, Integer>("Plains", 0, "Swamp", 0);
		TileInfo<String, Integer, String, Integer> t17 = new TileInfo<String, Integer, String, Integer>("Forest", 0, "Ocean", 0);
		TileInfo<String, Integer, String, Integer> t18 = new TileInfo<String, Integer, String, Integer>("Forest", 0, "Field", 0);
		TileInfo<String, Integer, String, Integer> t19 = new TileInfo<String, Integer, String, Integer>("Plains", 1, "Forest", 0);
		TileInfo<String, Integer, String, Integer> t20 = new TileInfo<String, Integer, String, Integer>("Plains", 1, "Water", 0);
		TileInfo<String, Integer, String, Integer> t21 = new TileInfo<String, Integer, String, Integer>("Plains", 1, "Field", 0);
		TileInfo<String, Integer, String, Integer> t22 = new TileInfo<String, Integer, String, Integer>("Plains", 1, "Swamp", 0);
		TileInfo<String, Integer, String, Integer> t23 = new TileInfo<String, Integer, String, Integer>("Plains", 1, "Cave", 0);
		TileInfo<String, Integer, String, Integer> t24 = new TileInfo<String, Integer, String, Integer>("Forest", 1, "Plains", 0);
		TileInfo<String, Integer, String, Integer> t25 = new TileInfo<String, Integer, String, Integer>("Forest", 1, "Plains", 0);
		TileInfo<String, Integer, String, Integer> t26 = new TileInfo<String, Integer, String, Integer>("Forest", 1, "Plains", 0);
		TileInfo<String, Integer, String, Integer> t27 = new TileInfo<String, Integer, String, Integer>("Forest", 1, "Plains", 0);
		TileInfo<String, Integer, String, Integer> t28 = new TileInfo<String, Integer, String, Integer>("Forest", 1, "Water", 0);
		TileInfo<String, Integer, String, Integer> t29 = new TileInfo<String, Integer, String, Integer>("Forest", 1, "Field", 0);
		TileInfo<String, Integer, String, Integer> t30 = new TileInfo<String, Integer, String, Integer>("Water", 1, "Plains", 0);
		TileInfo<String, Integer, String, Integer> t31 = new TileInfo<String, Integer, String, Integer>("Forest", 1, "Plains", 0);
		TileInfo<String, Integer, String, Integer> t32 = new TileInfo<String, Integer, String, Integer>("Forest", 1, "Forest", 0);
		TileInfo<String, Integer, String, Integer> t33 = new TileInfo<String, Integer, String, Integer>("Forest", 1, "Forest", 0);
		TileInfo<String, Integer, String, Integer> t34 = new TileInfo<String, Integer, String, Integer>("Forest", 1, "Forest", 0);
		TileInfo<String, Integer, String, Integer> t35 = new TileInfo<String, Integer, String, Integer>("Forest", 1, "Forest", 0);
		TileInfo<String, Integer, String, Integer> t36 = new TileInfo<String, Integer, String, Integer>("Plains", 0, "Field", 1);
		TileInfo<String, Integer, String, Integer> t37 = new TileInfo<String, Integer, String, Integer>("Water", 0, "Field", 1);
		TileInfo<String, Integer, String, Integer> t38 = new TileInfo<String, Integer, String, Integer>("Plains", 0, "Swamp", 1);
		TileInfo<String, Integer, String, Integer> t39 = new TileInfo<String, Integer, String, Integer>("Field", 0, "Swamp", 1);
		TileInfo<String, Integer, String, Integer> t40 = new TileInfo<String, Integer, String, Integer>("Cave", 1, "Plains", 0);
		TileInfo<String, Integer, String, Integer> t41 = new TileInfo<String, Integer, String, Integer>("Plains", 0, "Field", 2);
		TileInfo<String, Integer, String, Integer> t42 = new TileInfo<String, Integer, String, Integer>("Water", 0, "Field", 2);
		TileInfo<String, Integer, String, Integer> t43 = new TileInfo<String, Integer, String, Integer>("Plains", 0, "Swamp", 2);
		TileInfo<String, Integer, String, Integer> t44 = new TileInfo<String, Integer, String, Integer>("Field", 0, "Swamp", 2);
		TileInfo<String, Integer, String, Integer> t45 = new TileInfo<String, Integer, String, Integer>("Cave", 2, "Plains", 0);
		TileInfo<String, Integer, String, Integer> t46 = new TileInfo<String, Integer, String, Integer>("Swamp", 0, "Cave", 2);
		TileInfo<String, Integer, String, Integer> t47 = new TileInfo<String, Integer, String, Integer>("Swamp", 0, "Cave", 2);
		TileInfo<String, Integer, String, Integer> t48 = new TileInfo<String, Integer, String, Integer>("Plains", 0, "Cave", 3);
		
		tileList.add(t0);
		tileList.add(t1);
		tileList.add(t2);
		tileList.add(t3);
		tileList.add(t4);
		tileList.add(t5);
		tileList.add(t6);
		tileList.add(t7);
		tileList.add(t8);
		tileList.add(t9);
		tileList.add(t10);
		tileList.add(t11);
		tileList.add(t12);
		tileList.add(t13);
		tileList.add(t14);
		tileList.add(t15);
		tileList.add(t16);
		tileList.add(t17);
		tileList.add(t18);
		tileList.add(t19);
		tileList.add(t20);
		tileList.add(t21);
		tileList.add(t22);
		tileList.add(t23);
		tileList.add(t24);
		tileList.add(t25);
		tileList.add(t26);
		tileList.add(t27);
		tileList.add(t28);
		tileList.add(t29);
		tileList.add(t30);
		tileList.add(t31);
		tileList.add(t32);
		tileList.add(t33);
		tileList.add(t34);
		tileList.add(t35);
		tileList.add(t36);
		tileList.add(t37);
		tileList.add(t38);
		tileList.add(t39);
		tileList.add(t40);
		tileList.add(t41);
		tileList.add(t42);
		tileList.add(t43);
		tileList.add(t44);
		tileList.add(t45);
		tileList.add(t46);
		tileList.add(t47);
		tileList.add(t48);
		
		return tileList;
	}
	
}