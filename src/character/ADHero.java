package character;
import interfaces.*;

public class ADHero extends Hero implements AD {

	@Override
	public void physicAttack() {
		System.out.println("����������");
	}
}
