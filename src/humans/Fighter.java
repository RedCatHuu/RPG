package humans;

import utils.Dice;

public class Fighter extends bases.Human {
	public Fighter(String name, String weapon) {
		super(name, weapon);
		
		// ヒットポイントの値は乱数を振って決定。
		this.setHp(Dice.get(240, 300)); 
		
		// 攻撃力の値は乱数を振って決定。
		this.setOffensive(Dice.get(17, 23));
	}

}
