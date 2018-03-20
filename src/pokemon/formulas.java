package pokemon;

public class formulas {
	
	//EV's HAVE NOT BEEN IMPLEMENTED
	//NATURES HAVE NOT BEEN IMPLEMENTED
	
	public int calculateHP(int baseHP, int HpIv, int level) {
		int HP = 0;
		
		HP = ((((baseHP + HpIv) * 2) * level)/100)+level+10;
		
		return HP;
	}
	
	public int calculateOtherStat(int baseStat, int statIv, int level) {
		int otherStat = 0;
		
		otherStat = (((2 * baseStat + statIv) * level)/100)+5;
				
		return otherStat;
	}
	
}
