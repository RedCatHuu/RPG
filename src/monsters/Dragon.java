package monsters;

import utils.Dice;

public class Dragon extends bases.Monster {
	public Dragon(String name, String weapon) {
		super(name, weapon);
		
		// ヒットポイントの値は乱数を振って決定。
		this.setHp(Dice.get(270, 330)); 
		
		// 攻撃力の値は乱数を振って決定。
		this.setOffensive(Dice.get(12, 18));
	}
}
