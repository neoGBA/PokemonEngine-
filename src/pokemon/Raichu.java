package pokemon;

import java.util.Random;

public class Raichu {
	
	String type = "Electric";
	
	String filePath = "/Images/Gen4/026.png";
	
	int baseHP = 60;
	int baseAttack = 90;
	int baseDefense = 55;
	int baseSpecialAttack = 90;
	int baseSpecialDefense = 80;
	int baseSpeed = 110;
	
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
	
	public Raichu(int level) {
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
	
	public int getAttackStat() {
		int stat = attack;
		return stat;
	}
	
	public String getFilePath() {
		String path = filePath;
		return filePath;
	}
	
	public String getType() {
		return type;
	}
}