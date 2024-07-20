package humans;

import utils.Dice;

public class Wizard extends bases.Human{
	public Wizard(String name, String weapon) {
		super(name, weapon);
		
		// ヒットポイントの値は乱数を振って決定。
		this.setHp(Dice.get(120, 180)); 
		
		// 攻撃力の値は乱数を振って決定。
		this.setOffensive(Dice.get(12, 18));
	}
}
