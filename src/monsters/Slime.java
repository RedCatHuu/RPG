package monsters;

import utils.Dice;

public class Slime extends bases.Monster {
	public Slime(String name, String weapon) {
		super(name, weapon);
		
		// ヒットポイントの値は乱数を振って決定。
		this.setHp(Dice.get(70, 130)); 
		
		// 攻撃力の値は乱数を振って決定。
		this.setOffensive(Dice.get(5, 11));
	}
}
