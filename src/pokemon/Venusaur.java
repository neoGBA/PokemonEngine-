package pokemon;

import java.util.Random;

public class Venusaur {
	
	String type = "Grass";
	String type2 = "Poison";
	
	String filePath = "/Images/Gen4/003.png";
	
	int baseHP = 80;
	int baseAttack = 82;
	int baseDefense = 83;
	int baseSpecialAttack = 100;
	int baseSpecialDefense = 100;
	int baseSpeed = 80;
	
	int HPIV;
	int attackIV;
	int defenseIV;
	int specialAttackIV;
	int specialDefenseIV;
	int speedIV;
	
	int HP;
	int attack;
	int defense;
	int specialAttack;
	int specialDefense;
	int speed;
	
	public Venusaur(int level) {
		//put each task in generic method to be used for each pokemon
		
		//calculate IVs
		Random rand = new Random();
		HPIV = rand.nextInt(31);
		attackIV = rand.nextInt(31);
		defenseIV = rand.nextInt(31);
		specialAttackIV = rand.nextInt(31);
		specialDefenseIV = rand.nextInt(31);
		speedIV = rand.nextInt(31);
		
		//Calculate stats
		formulas formula = new formulas();
		HP = formula.calculateHP(baseHP, HPIV, level);
		attack = formula.calculateOtherStat(baseAttack, attackIV, level);
		defense = formula.calculateOtherStat(baseDefense, defenseIV, level);
		specialAttack = formula.calculateOtherStat(baseSpecialAttack, specialAttackIV, level);
		specialDefense = formula.calculateOtherStat(baseSpecialDefense, specialDefenseIV, level);
		speed = formula.calculateOtherStat(baseSpeed, speedIV, level);
		
		//determine moves by level
		
	}
	
	public String getFilePath() {
		String path = filePath;
		return filePath;
	}
	
	public String getType() {
		return type;
	}
	
	public String getType2() {
		return type2;
	}
}