package effects;

import main.GameThread;

public class GenericEffect {

	public boolean dealsDamage;
	private int dps;
	private int duration;

	public GenericEffect(int dps, int duration) {
		dealsDamage = true;
		setDps(dps);
		setDuration(duration);
	}

	public GenericEffect(int duration) {
		dealsDamage = false;
		setDps(0);
		setDuration(duration);
	}

	public int getDps() {
		return dps;
	}

	public void setDps(int dps) {
		if (dps < 0)
			return;
		this.dps = dps;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		if (duration < 0)
			return;
		this.duration = duration;
	}
	
	public void tick() {
		duration -= GameThread.period;
	}

}
