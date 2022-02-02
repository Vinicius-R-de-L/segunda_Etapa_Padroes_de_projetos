public class Faster extends SpeedState {

	public Faster(Speed speed) {
		super(speed);
		System.out.println("Velocidade 1.5x");
	}

	@Override
	public void changeSpeed() {
		getSpeed().setState(new Slower(getSpeed()));
	}
}
