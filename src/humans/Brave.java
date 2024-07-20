package humans;

import utils.Dice;

public class Brave extends bases.Human {
	public Brave(String name, String weapon) {
		super(name, weapon);
		
		// ヒットポイントの値は乱数を振って決定。
		this.setHp(Dice.get(170, 230)); 
		
		// 攻撃力の値は乱数を振って決定。
		this.setOffensive(Dice.get(7, 13));
	}

}
