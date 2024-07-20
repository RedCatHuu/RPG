package monsters;

import utils.Dice;

public class Oak extends bases.Monster {
	public Oak(String name, String weapon) {
		super(name, weapon);
		
		// ヒットポイントの値は乱数を振って決定。
		this.setHp(Dice.get(170, 230)); 
		
		// 攻撃力の値は乱数を振って決定。
		this.setOffensive(Dice.get(9, 15));
	}
}
