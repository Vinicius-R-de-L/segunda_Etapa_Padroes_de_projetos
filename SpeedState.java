public abstract class SpeedState{

	private Speed speed;

	public SpeedState(Speed speed) {
		super();
		this.speed = speed;
	}
	
	public abstract void changeSpeed();

	public Speed getSpeed() {
		return speed;
	}

	public void setSpeed(Speed speed) {
		this.speed = speed;
	}

}
