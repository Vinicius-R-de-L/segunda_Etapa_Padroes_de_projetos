public class Padrao extends SpeedState {

	public Padrao(Speed speed) {
		super(speed);
		System.out.println("Velocidade Padrao");
	}

	@Override
	public void changeSpeed() {
		getSpeed().setState(new Faster(getSpeed()));
	}
}
