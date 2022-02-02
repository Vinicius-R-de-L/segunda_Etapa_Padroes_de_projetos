public class Slower extends SpeedState{	

	public Slower(Speed speed) {
		super(speed);
		System.out.println("Velocidade 0.5x");
	}

	@Override
	public void changeSpeed() {
		getSpeed().setState(new Padrao(getSpeed()));
	}
}
