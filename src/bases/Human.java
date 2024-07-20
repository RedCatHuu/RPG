package bases;

//人間を表現する抽象クラス
public abstract class Human extends Living {

	// コンストラクタ
	public Human(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする

		// 相手のHPをダメージ値だけ減らす

		// 自分の攻撃力を1だけ減らす

		// コンソールにステータスを表示

	}
}