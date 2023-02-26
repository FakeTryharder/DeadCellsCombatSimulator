package weapons.melee;

import java.util.List;

import characters.Beheaded;
import weapons.GenericModifier;
import weapons.GenericWeapon;

public class FranticSword extends GenericWeapon {

	public FranticSword(List<GenericModifier> modifiers) {
		super(150, 312, modifiers);
	}
	
	public int attack() {
		if(Beheaded.HP < (Beheaded.MaxHP / 2))
			return criticalDamage;
		return damage;
	}

}
