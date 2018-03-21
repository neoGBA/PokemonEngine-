package controller;

import pokemon.*;

public class Main {
	
	public static void main(String [] args) {
		Raichu raichu = new Raichu(30);
		Pidgeotto pidgeotto = new Pidgeotto(35);
		
		Battle battle = new Battle(raichu, pidgeotto);
	}
	
}
