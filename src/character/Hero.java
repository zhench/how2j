package character;

public class Hero {
String name;
float hp;
float armor;
int moveSpeed;
public static void main(String[] args) {
	ADHero ad = new ADHero();
	Hero hero=new Hero();
	hero=ad;
	System.out.println(hero.name);
}
}
