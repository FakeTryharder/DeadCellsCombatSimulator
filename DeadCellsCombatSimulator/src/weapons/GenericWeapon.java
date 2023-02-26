package weapons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class GenericWeapon {

	protected int damage, criticalDamage;
	private ArrayList<GenericModifier> modifiers;

	public GenericWeapon(int damage, int criticalDamage, GenericModifier[] modifiers) {
		this(damage, criticalDamage, Arrays.asList(modifiers));
	}

	public GenericWeapon(int damage, int criticalDamage, List<GenericModifier> modifiers) {

		for (GenericModifier mod : modifiers)
			this.modifiers.add(mod);

		setDamage(damage);
		setCriticalDamage(criticalDamage);

	}

	public int getDamage() {
		return damage;
	}

	private void setDamage(int damage) {
		if (damage < 0) {
			this.damage = 0;
			return;
		}
		this.damage = damage;
	}

	public int getCriticalDamage() {
		return criticalDamage;
	}

	private void setCriticalDamage(int criticalDamage) {
		if (criticalDamage < 0) {
			this.criticalDamage = 0;
			return;
		}
		this.criticalDamage = criticalDamage;
	}

	public ArrayList<GenericModifier> getModifiers() {
		return modifiers;
	}

	public void setModifiers(ArrayList<GenericModifier> modifiers) {
		this.modifiers = modifiers;
	}

	public abstract int attack();

}
