package pokemon;

import java.util.Random;

public class Raticate {
	
	String type = "Normal";
	
	String filePath = "/Images/Gen4/020.png";
	
	int baseHP = 55;
	int baseAttack = 81;
	int baseDefense = 60;
	int baseSpecialAttack = 50;
	int baseSpecialDefense = 70;
	int baseSpeed = 97;
	
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
	
	public Raticate(int level) {
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
}